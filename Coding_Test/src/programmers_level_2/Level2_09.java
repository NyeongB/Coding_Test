// Date : 2020.09.10
// Title : 다음 큰 숫자
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : basic

package programmers_level_2;

public class Level2_09
{

	public static void main(String[] args)
	{
		Solution2_09 solution2_09 = new Solution2_09();
		System.out.println(solution2_09.solution(78));
		System.out.println(solution2_09.solution(15));
	}
}

class Solution2_09
{
	public int solution(int n)
	{
		int answer = 0;

		int temp = n + 1;

		String str1 = Integer.toBinaryString(n);
		int[] arr = new int[2];
		for (int i = 0; i < str1.length(); i++)
		{
			int index = str1.charAt(i) - '0';
			arr[index]++;
		}

		while (true)
		{
			String str2 = Integer.toBinaryString(temp);
			int[] arr2 = new int[2];
			for (int i = 0; i < str2.length(); i++)
			{
				int index = str2.charAt(i) - '0';
				arr2[index]++;
			}

			if (arr[1] == arr2[1])
			{
				answer = temp;
				break;
			}
			temp++;

		}
		return answer;
	}
}