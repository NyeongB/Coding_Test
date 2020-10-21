package groom;

import java.io.*;

public class Groom_024
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		N = Integer.parseInt(input);
		map = new int[N][N];
		visit = new int[N][N];

		for (int i = 0; i < N; i++)
		{
			String[] str = br.readLine().split(" ");
			for (int j = 0; j < N; j++)
			{
				map[i][j] = Integer.parseInt(str[j]);
			}
		}

		visit[0][0] = 1;
		if (map[0][0] == 1)
			count++;
		dfs(0, 0);
		System.out.print(max);
	}

	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };
	static int[][] map;
	static int[][] visit;
	static int N;		
	static int count;	// 포장 비포장 체크
	static int max;	// 맥스값
	static int scope;	// 최단거리 이상으로가는지 체크

	public static void dfs(int x, int y)
	{
		if (scope > N * 2 - 1)
			return;

		if (x == N - 1 && y == N - 1)
		{
			max = Math.max(max, count);
			return;
		}

		for (int i = 0; i < 4; i++)
		{
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if (nx >= 0 && ny >= 0 && nx < N && ny < N)
			{
				if (visit[nx][ny] == 0)
				{
					visit[nx][ny] = 1;
					scope++;
					if (map[nx][ny] == 1)
						count++;

					dfs(nx, ny);

					if (map[nx][ny] == 1)
						count--;
					scope--;
					visit[nx][ny] = 0;
				}
			}
		}

	}
}

// DFS 문제 
// 구름은 단점이 다른사람이 어떻게 푼지 볼수없고 문제가 틀렸는지 시간초과인지 제대로 안나올때가있다
// 처음엔 최단거리를 넘어서는 경우 return을 하지않고 max값을 넣는 조건에만 추가하여서 시간초과가 난거같은데 구름에선 틀렸다고만했다..
// 비슷한 문제를 찾아본다.