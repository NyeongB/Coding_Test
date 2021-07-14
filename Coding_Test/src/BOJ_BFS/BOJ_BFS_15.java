// Date : 2020.01.11
// Title : 미로 탐색
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : BFS

package BOJ_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_BFS_15
{
	static int[] dx = { 0, 0, -1, 1 };
	static int[] dy = { -1, 1, 0, 0 };
	static int[][] map;
	static boolean[][] visited;
	static int N, M;

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);

		visited = new boolean[N][M];
		map = new int[N][M];

		for (int i = 0; i < N; i++)
		{
			str = br.readLine().split("");
			for (int j = 0; j < M; j++)
			{
				map[i][j] = Integer.parseInt(str[j]);
			}
		}

		bfs(0, 0);

		System.out.println(map[N-1][M-1]);
	}

	public static void bfs(int a, int b)
	{
		Queue<int []> q = new LinkedList<>();
		q.add(new int[] {a,b});
		
		
		while(!q.isEmpty())
		{
			int [] temp = q.poll();

			for (int i = 0; i < 4; i++)
			{
				int nx = dx[i] + temp[0];
				int ny = dy[i] + temp[1];
				
				if(nx>=0&&ny>=0&&nx<N&&ny<M)
				{
					if(!visited[nx][ny]&& map[nx][ny]>0)
					{
						visited[nx][ny] = true;
						q.add(new int[] {nx, ny});
						map[nx][ny] = map[temp[0]][temp[1]] + 1;
					}
				}
				
			}
		}
		
		
	}
}