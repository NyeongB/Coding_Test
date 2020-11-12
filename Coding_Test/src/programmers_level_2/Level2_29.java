// Date : 2020.11.10
// Title : 조이스틱
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : 그리디

package programmers_level_2;

public class Level2_29
{
	public static void main(String[] args)
	{

		Solution2_29 solution = new Solution2_29();
		System.out.println(solution.solution("12kk kor   bb  abc"));

	}

}

class Solution2_29
{
	public String solution(String s)
	{
		String answer = "";
		s = s.toLowerCase(); // 모두 소문자로 만들고
		boolean flag = true; // 공백 만날때마다 그 다음은 대문자를 위함

		for (int i = 0; i < s.length(); i++)
		{
			char temp = s.charAt(i);

			if (temp == ' ')
			{
				answer += ' ';
				flag = true;
				continue;
			}

			if (flag)
			{
				if (!Character.isDigit(temp))
					temp = (char) (temp - 32);

				flag = false;
			}

			answer += temp;
		}

		return answer;
	}
}

// 처음에 매개변수로 받은 문자열에 스플릿으로 접근해봤는데 안됐다
// 이유는 공백문자열이 여러군대 들어갈수있기때문에
// 하나하나 바꿔줘야한다..