// Date : 2020.08.22, 20.11.20, 20.12.07
// Title : 큰 수 만들기
// Author : Choi Cheol Nyeong

package programmers_level_2;

public class Level2_01
{
	public static void main(String[] args)
	{
		String test1 = "1924"; // k 2
		String test2 = "1231234"; // k 3
		char ch = '9';
		// test1.replace(0, 0);
		// System.out.println(ch-'0');
		Solution solution = new Solution();
		System.out.println(solution.solution(test2, 3));
	}

}

class Solution
{
	public String solution(String number, int k)
	{
		StringBuilder answer = new StringBuilder();	// 속도 줄이려고 별에별걸 다했는데 이게 제일 빠르다
		
		int len = number.length();
		
		int r_len = len - k;
		
		int s = -1;
		
		for (int i = 0; i < r_len; i++)
		{
			char max = '0';
			for (int j = s + 1; j < len - r_len + 1 + i; j++)
			{
				char num = number.charAt(j);
				
				if (max < num)
				{
					max = num;
					s = j;
				}
			}

			answer.append(max); // 속도가 100배 이상 빨라짐

		}

		return answer.toString();
	}
}
// 리턴해야되는 길이가 4라면 
// 맨뒤에 3자리는 제외한 값에서 찾아야하고 
// 그다음은 2자리 .. 1자리 0자리.. 를 제외하고 찾는데
// 대신 맥스값으로 선택된 값 뒤에있는 값부터 탐색해야한다.

// 3차 시도 문제 똑같이 풀었는데 결국 속도차이.. 가장 중요한 StringBuilder의 append로 문제를 해결해야한다.	// 자꾸 실수함(주의)