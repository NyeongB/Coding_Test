// Date : 2020.09.26, 20.10.07
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

public class BOJ_BFS_05
{
	static class XY
	{
		int x;
		int y;

		XY(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
	}

	static int N, M;
	static int[][] map;

	static int[] dx = { 1, 0, 0, -1 };
	static int[] dy = { 0, -1, 1, 0 };

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");

		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);

		map = new int[N][M];

		for (int i = 0; i < N; i++)
		{
			str = br.readLine().split("");
			for (int j = 0; j < str.length; j++)
			{
				map[i][j] = Integer.parseInt(str[j]);
			}
		}

		bfs(0, 0);
		System.out.println(map[N - 1][M - 1]);
	}

	static void bfs(int a, int b)
	{
		Queue<XY> q = new LinkedList<>();
		q.add(new XY(a, b));

		while (!q.isEmpty())
		{
			XY temp = q.poll();

			for (int i = 0; i < 4; i++)
			{
				int x = dx[i] + temp.x;
				int y = dy[i] + temp.y;

				if (x >= 0 && y >= 0 && x < N && y < M)
				{
					if (map[x][y] == 1)
					{
						map[x][y] = 1 + map[temp.x][temp.y];
						q.add(new XY(x, y));
					}
				}
			}
		}
	}

}
