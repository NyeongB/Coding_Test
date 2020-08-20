// Date : 2020.08.20
// Title : 문자열 다루기 기본
// Author : Choi Cheol Nyeong

package programmers_level_1;

public class Level1_7
{
	public static void main(String[] args)
	{
		Solution1_7 solution1_7 = new Solution1_7();
		System.out.println(solution1_7.solution("a234"));
		System.out.println(solution1_7.solution("123456"));
	}

}

class Solution1_7
{
	public boolean solution(String s)
	{
		boolean answer = true;

		int len = s.length();

		if (len != 4 && len != 6)
			answer = false;

		try
		{
			Integer.parseInt(s);
		} catch (Exception e)
		{
			answer = false;
		}

		return answer;
	}
}