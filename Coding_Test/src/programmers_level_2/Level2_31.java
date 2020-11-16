// Date : 2020.11.16
// Title : 가장 큰 수
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : 정렬

package programmers_level_2;

import java.util.Arrays;
import java.util.Comparator;

public class Level2_31
{
	public static void main(String[] args)
	{

		Solution2_31 solution = new Solution2_31();
		System.out.println(solution.solution(new int[] {6,10,2}));
	}

}

class Solution2_31
{
	public String solution(int[] numbers)
	{
		String answer = "";

		int len = numbers.length;

		String[] str = new String[len];

		for (int i = 0; i < len; i++)
		{
			// str[i] = "" + numbers[i];
			str[i] = String.valueOf(numbers[i]);
		}

		Arrays.sort(str, new Comparator<String>()
		{

			public int compare(String a, String b)
			{
				// System.out.println(a+" "+b);
				// System.out.println((b+a).compareTo(a+b));
				return (b + a).compareTo(a + b);		// 양수면 스왑
			}

		});

		if (str[0].charAt(0) == '0')	// 0이 2개면 "00"으로 출력될 수 도있어서
			return "0";

		for (String s : str)
			answer += s;

		return answer;
	}
}