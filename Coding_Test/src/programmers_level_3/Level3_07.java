// Date : 2020.10.24
// Title : 2*n 타일링
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : DP

package programmers_level_3;

public class Level3_07
{

	public static void main(String[] args)
	{
		Solution3_07 solution3_07 = new Solution3_07();
		System.out.println(solution3_07.solution(4));
	}

}

class Solution3_07
{

	public int solution(int n)
	{

		long[] arr = new long[60001]; // 1 ~ 60,000
		arr[1] = 1;
		arr[2] = 2;

		for (int i = 3; i <= n; i++)
		{
			arr[i] = (arr[i - 2] + arr[i - 1]) % 1000000007;
		}

		return (int) arr[n];
	}
}

// DP 문제다 
// 규칙을 잘보고 점화식을 세워서 푼다