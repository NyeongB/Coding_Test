// Date : 2020.11.14
// Title : 문자열 압축
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : 

package programmers_level_2;

public class Level2_30
{
	public static void main(String[] args)
	{

		Solution2_30 solution = new Solution2_30();
		System.out.println(solution.solution("ababababcc"));

	}

}

class Solution2_30
{


	public static int solution(String s)
	{
		if (s.length() == 1)
			return 1;

		int answer = 1001;
		for (int i = 1; i <= s.length() / 2; i++)
		{
			String now, next = "", result = "";
			int hit = 1;
			for (int j = 0; j <= s.length() / i; j++)
			{
				int start = j * i;
				int end = i * (j + 1) > s.length() ? s.length() : i * (j + 1);
				
				now = next;
				next = s.substring(start, end);
				
				if (now.equals(next))
				{
					hit++;
				} 
				else
				{
					result += (processHit(hit) + now);
					hit = 1;
				}
				
			}
			
			result += (processHit(hit) + next);	// 딱 떨어지는게 아닐경우는 따로 추가
			
			answer = Math.min(answer, result.length());
		}

		return answer;
	}

	private static String processHit(int hit)
	{
		return hit > 1 ? String.valueOf(hit) : "";
	}
}

// 레벨2 인지 의심스럽다.. 너무 어려워서 이해하는쪽으로.. 