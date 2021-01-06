// Date : 2021.01.06
// Title : 치즈
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Simulation

package BOJ_Simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_Simulation_08
{

	static int[][] map;
	static boolean[][] visited;
	static int t;
	static int count;
	static int N, M;

	static int[] dx =
	{ 0, 0, 1, -1 };
	static int[] dy =
	{ 1, -1, 0, 0 };

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);

		map = new int[N][M];

		for (int i = 0; i < N; i++)
		{
			str = br.readLine().split(" ");

			for (int j = 0; j < M; j++)
			{
				map[i][j] = Integer.parseInt(str[j]);
			}
		}

		while (true)
		{
			
			if (check())
				break;
			count++;
			t++;

			// 산화 부분 체크
			visited = new boolean[N][M];
			count = 0;
			bfs(0, 0);

			// 치즈 녹이기
			melt();
			
		}
		
		System.out.println(t+"\n"+count);

	}

	public static boolean check() // 1이 없으면 트루
	{
		
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < M; j++)
			{
				if (map[i][j] == 1)
					return false;
			}
		}

		return true;
	}

	public static void bfs(int x, int y)
	{
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[]
		{ x, y });

		while (!q.isEmpty())
		{
			int[] temp = q.poll();
			
			for (int i = 0; i < 4; i++)
			{
				int nx = temp[0] + dx[i];
				int ny = temp[1] + dy[i];

				if (nx >= 0 && ny >= 0 && nx < N && ny < M)
				{
					if (!visited[nx][ny])
					{
						if (map[nx][ny] == 1)
						{
							map[nx][ny] = 2; // 곧 녹일 치즈로 만듬
							count++;
						} else if (map[nx][ny] == 0)
						{
							visited[nx][ny] = true;
							q.add(new int[]
							{ nx, ny });
						}

					}
				}

			}

		}
	}// end bfs
	
	// 치즈 녹이기
	public static void melt()
	{
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < M; j++)
			{
				if (map[i][j] == 2)
					map[i][j] = 0;	// 모두 0으로 바꿔서 녹임
			}
		}
	}

}

// 한번에 통과되서 다행...
// 처음에는 공기를 오염시켜야되나 싶었는데
// 꾸준히 고민한 끝에 매번 0,0에서 공기를 찾아가는게 맞다
// 핵심은 0으로 이동을하며 1을 만났을때 그 치즈를 2로 바꾸고 카운트 체크를 하는것이다
// 그 후에 2를 0으로 바꾸고 시간을 올리고 
// 모든 치즈가 녹은지를 체크하고 
// while로 계속 반복한다.