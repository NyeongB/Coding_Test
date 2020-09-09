// Date : 2020.09.08
// Title : 크레인 인형뽑기 게임
// Author : Choi Cheol Nyeong
// Language : Java

package programmers_level_1_1;

import java.util.*;

public class Level1_35
{
	public static void main(String[] args)
	{

		// String str = "1S2D*3T";
		String str = "1D2S#10S";
		Solution1_35 solution1_34 = new Solution1_35();
		System.out.println(solution1_34.solution(str));

	}

}

class Solution1_35
{
	public int solution(String dartResult)
	{
		int answer = 0;

		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < dartResult.length(); i++)
		{
			char input = dartResult.charAt(i);
			if (input == '*' || input == '#')
			{
				if (input == '*' && st.size() >= 2)
				{
					int n1 = st.pop() * 2;
					int n2 = st.pop() * 2;
					st.push(n2);
					st.push(n1);
				} else if (input == '*' && st.size() >= 1)
				{
					st.push(st.pop() * 2);
				} else if (input == '#')
				{
					st.push(st.pop() * -1);
				}
			} else
			{
				int num = input - '0';
				char ch = dartResult.charAt(++i);
				if (Character.isDigit(ch)) // 숫자 뒤에 나온 문자가 또다시 숫자이면 그다음 문자를 또확인한다.
				{
					String t = "" + num + ch;
					num = Integer.parseInt(t); // 10을 만드는 과정
					ch = dartResult.charAt(++i);
				}

				int result = 0;
				switch (ch)
				{
				case 'S':
					result = num;
					break;
				case 'D':
					result = num * num;
					break;
				case 'T':
					result = num * num * num;
					break;
				}
				st.push(result);
			}
		}

		int size = st.size();
		for (int i = 0; i < size; i++)
		{
			answer += st.pop();
		}
		return answer;
	}
}
// 테스트 32개.. 30개만 통과해서 오류 찾느라 힘든문제
// 0~10 인것도 잘 파악해야하고 
// *의 범위도 잘봐야한다. 