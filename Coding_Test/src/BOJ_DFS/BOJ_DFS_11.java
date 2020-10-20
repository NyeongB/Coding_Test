// Date : 2020.10.20
// Title : 블랙잭
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : DFS

package BOJ_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_DFS_11
{
	static int n, m;
	static int[] arr;
	static int[] visit;
	static int[] result = new int[3];

	static int max = 0;

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);

		arr = new int[n];
		visit = new int[n];

		str = br.readLine().split(" ");

		for (int i = 0; i < n; i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}

		dfs(0);

		System.out.println(max);

	}

	public static void dfs(int count)
	{

		if (count == 3)
		{

			int total = 0;
			for (int n : result)
				total += n;
			// System.out.println(total);

			if (total <= m && total > max)
				max = total;
			return;
		}

		for (int i = 0; i < n; i++)
		{
			if (visit[i] == 0)
			{
				visit[i] = 1;

				result[count] = arr[i];
				// System.out.println(result[count]);
				dfs(count + 1);
				visit[i] = 0;
			}
		}
	}
}

// 문제를 풀때 유형을 안보고 혼자 생각하면서 풀었다
// 나중에 알았지만 브루트 포스를 사용해 문제를풀고
// 블로그들에서는 대부분 3중포문을 사용해서 문제를 풀었다.
// 처음에 재귀로 접근하면 좋을것같아서 곧바로 접근하였다.