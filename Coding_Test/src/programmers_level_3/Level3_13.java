// Date : 2020.11.18
// Title : 거스름 돈
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : 다이나믹 프로그래밍

package programmers_level_3;

import java.util.Arrays;

public class Level3_13
{

	public static void main(String[] args)
	{
		Solution3_13 solution = new Solution3_13();
		int result = solution.solution(5, new int[]
		{ 1, 2, 5 });

		System.out.println(result);
	}

}

class Solution3_13
{
	static final int MOD = 1000000007;

	public int solution(int n, int[] money)
	{
		int[][] dp = new int[money.length + 1][n + 1];

		Arrays.sort(money);

		dp[0][0] = 1;

		for (int r = 1; r < dp.length; ++r)
		{
			for (int c = 0; c < dp[0].length; ++c)
			{
				if (c < money[r - 1])
				{
					dp[r][c] = dp[r - 1][c] % MOD;
				} 
				else if (c == money[r - 1])
				{
					dp[r][c] = dp[r - 1][c] + 1 % MOD;
				}
				else
				{
					dp[r][c] = dp[r - 1][c] + dp[r][c - money[r - 1]] % MOD;
				}
			}
		}

		return dp[money.length][n];
	}
}
// 블로그 참고 