// Date : 2020.10.22
// Title : 유기농 배추
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : BFS

package BOJ_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_BFS_11
{
	static class XY
	{
		int x, y;
		
		public XY(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
	}

	static int[] dx = {  0, 0,1, -1 };
	static int[] dy = { 1, -1, 0, 0 };
	static int[][] map;
	static int[][] visit;
	static int N, M, K;

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		while (n-- > 0)
		{
			String[] str = br.readLine().split(" ");
			N = Integer.parseInt(str[1]);
			M = Integer.parseInt(str[0]);
			K = Integer.parseInt(str[2]);

			map = new int[N][M];
			visit = new int[N][M];

			for (int i = 0; i < K; i++)
			{
				str = br.readLine().split(" ");
				map[Integer.parseInt(str[1])][Integer.parseInt(str[0])] = 1;
			}
			int count = 0;
			for (int i = 0; i < N; i++)
			{
				for (int j = 0; j < M; j++)
				{
					if (visit[i][j] == 0 && map[i][j] == 1)
					{
						bfs(i, j);
						//System.out.println(i+" "+j);
						count++;
					}
				}

			}
			sb.append(count).append("\n");

		}
		System.out.println(sb.toString());

	}

	public static void bfs(int x, int y)
	{
		Queue<XY> q = new LinkedList<>();
		visit[x][y] = 1;
		q.add(new XY(x, y));

		while (!q.isEmpty())
		{
			XY temp = q.poll();

			for (int i = 0; i < 4; i++)
			{
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];

				if (nx >= 0 && ny >= 0 && nx < N && ny < M)
				{
					if (visit[nx][ny] == 0 && map[nx][ny] == 1)
					{
						visit[nx][ny] = 1;
						q.add(new XY(nx, ny));
					}
				}
			}
		}

	}
}