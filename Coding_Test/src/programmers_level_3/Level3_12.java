// Date : 2020.11.08
// Title : 가장 긴 팰린드롬 수
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : 다이나믹 프로그래밍

package programmers_level_3;

public class Level3_12
{

	public static void main(String[] args)
	{
		Solution3_12 solution = new Solution3_12();
		int result = solution.solution("abcacba");

		System.out.println(result);
	}

}

class Solution3_12
{
	public int solution(String s)
	{
		int answer = 1;

		int len = s.length();

		int[][] dp = new int[len][len];
		char[] arr = s.toCharArray();

		for (int i = 0; i < len; i++)
		{
			dp[i][i] = 1;
		}

		for (int i = 0; i < len - 1; i++)
		{
			if (arr[i] == arr[i + 1])
			{
				dp[i][i + 1] = 1;
				answer = 2;
			}
		}

		for (int i = 3; i <= len; i++)
		{
			for (int j = 0; j <= len - i; j++)
			{
				int k = i + j - 1;
				if (arr[k] == arr[j] && dp[j + 1][k - 1] == 1)
				{
					dp[j][k] = 1;
					answer = Math.max(answer, i);
				}
			}
		}

		return answer;
	}
}
// 처음엔 완전탐색으로 접근했다 시간초과가 계속 나길래 블로그를 참고했다
// dp방식으로 굉장히 중요한 코드같다