// Date : 2020.12.27
// Title : 다리 놓기
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Dynamic Programming

package BOJ_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_DP_08
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		while (T-- > 0)
		{
			String[] str = br.readLine().split(" ");

			int N = Integer.parseInt(str[0]);
			int M = Integer.parseInt(str[1]);

			int dp[][] = new int[N + 1][M + 1];

			for (int n = 2; n <= N; n++)
				dp[n][1] = 0;

			for (int m = 1; m <= M; m++)
				dp[1][m] = m;

			for (int x = 2; x <= N; x++)
			{
				for (int y = 2; y <= M; y++)
				{
					dp[x][y] = dp[x][y - 1] + dp[x - 1][y - 1];
				}
			}

			sb.append(dp[N][M] + "\n");

		}

		System.out.println(sb.toString());
	}

}

// 참고 : https://yeoeun-ji.tistory.com/60	DP 조합 방법 
