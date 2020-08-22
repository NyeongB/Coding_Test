// Date : 2020.08.22
// Title : 체육복
// Author : Choi Cheol Nyeong

package programmers_level_1;

public class Level1_13
{
	public static void main(String[] args)
	{
		Solution1_13 solution1_13 = new Solution1_13();
		int n = 5;
		int [] lost = {2,4};
		int []	reserve = {1,3,5};
		System.out.println(solution1_13.solution(n, lost, reserve));
	}

}

class Solution1_13
{
	public int solution(int n, int[] lost, int[] reserve)
	{
		int answer = 0;
		answer = n - lost.length;
		for (int i = 0; i < lost.length; i++)
		{
			for (int j = 0; j < reserve.length; j++)
			{
				if (lost[i] == reserve[j])
				{
					answer++;
					reserve[j] = -1;
					lost[i] = -1;
					break;

				}
			}
		}

		for (int i = 0; i < lost.length; i++)
		{
			for (int j = 0; j < reserve.length; j++)
			{
				if (Math.abs(reserve[j] - lost[i]) == 1)
				{
					reserve[j] = -1;
					answer++;
					break;
				}
			}
		}
		return answer;
	}
}