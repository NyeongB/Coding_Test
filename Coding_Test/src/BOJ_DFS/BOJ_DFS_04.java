// Date : 2020.09.13
// Title : 유기농 배추
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : DFS

package BOJ_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_DFS_04
{

	static int[][] map;
	static int[][] visit;

	static int n, m;

	static int[] dx =
	{ -1, 0, 1, 0 };
	static int[] dy =
	{ 0, 1, 0, -1 };

	static int result = 0;

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		String[] str;

		StringBuffer sb = new StringBuffer();

		while (num-- > 0)
		{
			str = br.readLine().split(" ");
			n = Integer.parseInt(str[1]);
			m = Integer.parseInt(str[0]);
			int k = Integer.parseInt(str[2]);
			map = new int[n][m];
			visit = new int[n][m];
			result = 0;
			while (k-- > 0)
			{
				str = br.readLine().split(" ");

				map[Integer.parseInt(str[1])][Integer.parseInt(str[0])] = 1;
			}
			for (int i = 0; i < map.length; i++)
			{
				for (int j = 0; j < map[0].length; j++)
				{
					if (visit[i][j] == 0 && map[i][j] == 1)
					{
						dfs(i, j);
						result++;
					}
				}

			}
			sb.append(result + "\n");

		}

		System.out.println(sb.toString());

		/*
		 * for(int i=0; i<map.length; i++) { for(int j=0; j<map[0].length; j++)
		 * System.out.print(map[i][j]); System.out.println(); }
		 */
	}

	public static void dfs(int i, int j)
	{
		visit[i][j] = 1;	// 방문 처리

		for (int k = 0; k < 4; k++)
		{
			int x = i + dx[k];
			int y = j + dy[k];

			if (x >= 0 && y >= 0 && x < map.length && y < map[0].length)
			{
				if (map[x][y] == 1 && visit[x][y] == 0)
				{
					dfs(x, y);

				}
			}

		}

	}

}

// 좌표가 반대인걸 조심해야하는 문제였다
// 좌표는 상하좌우 만 생각하면 되니깐 비교적 간단한 문제였따
// 하지만 dfs를 오랜만에 푸니깐 접근법이 바로바로 생각나지 않기때문에 반복 학습이 중요하다.