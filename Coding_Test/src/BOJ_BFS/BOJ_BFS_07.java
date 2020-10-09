// Date : 2020.10.09
// Title : 단지번호 붙이기
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : BFS

package BOJ_BFS;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_BFS_07
{

	static int[][] map;
	static int[][] visit;
	static int[] dx ={ 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };
	static int[] arr;

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int count = 0;
		map = new int[n][n];
		visit = new int[n][n];
		arr = new int[n * n];
		for (int i = 0; i < n; i++)
		{
			String[] str = br.readLine().split("");
			for (int j = 0; j < str.length; j++)
				map[i][j] = Integer.parseInt(str[j]);
		}

		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				if (visit[i][j] == 0 && map[i][j] == 1)
				{
					// System.out.println(i+","+j);
					count++;
					bfs(i, j, count);

				}
			}
		}
		Arrays.sort(arr);

		System.out.println(count);

		for (int num : arr)
		{
			if (num != 0)
				System.out.println(num);
		}

	}

	public static void bfs(int x, int y, int index)
	{
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(x, y));
		visit[x][y] = 1;
		int count = 1;
		while (!q.isEmpty())
		{
			Point temp = q.poll();

			for (int i = 0; i < 4; i++)
			{
				int a = temp.x + dx[i];
				int b = temp.y + dy[i];

				if (a >= 0 && b >= 0 && a < map.length && b < map.length)
				{
					if (map[a][b] == 1 && visit[a][b] == 0)
					{
						visit[a][b] = 1;
						q.add(new Point(a, b));
						count++;
					}
				}
			}

		}

		arr[index] = count;

	}
}