// Date : 2021.01.11
// Title : 스타트와 링크
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Bruteforcing

package BOJ_Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_Bruteforcing_14
{

	static int N;
	static int[][] map;
	static boolean[] visited;
	static int min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visited = new boolean[N];

		for (int i = 0; i < N; i++)
		{
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			for (int j = 0; j < N; j++)
			{
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		combi(0, 0);
		System.out.println(min);
	}

	static void combi(int index, int count)
	{

		if (count == N / 2)
		{

			// 이때 검사
			diff();
			return;
		}

		for (int i = index; i < N; i++)
		{
			if (!visited[i])
			{
				visited[i] = true;
				combi(i + 1, count + 1);
				visited[i] = false;
			}
		}

	}

	static void diff()
	{
		int start_sum = 0;
		int link_sum = 0;

		for (int i = 0; i < N - 1; i++)
		{
			for (int j = i + 1; j < N; j++)
			{
				if (visited[i] == true && visited[j] == true)
				{
					start_sum += map[i][j] + map[j][i];
				} else if (visited[i] == false && visited[j] == false)
				{
					link_sum += map[i][j] + map[j][i];
				}
			}
		}

		int result = Math.abs(start_sum - link_sum);

		if (result == 0)
		{
			System.out.println(0);
			System.exit(0);
		}

		min = Math.min(min, result);

	}
}