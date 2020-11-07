// Date : 2020.08.24 20.11.07
// Title : 자연수 뒤집어 배열로 만들기
// Author : Choi Cheol Nyeong

package programmers_level_1;

import java.util.ArrayList;

public class Level1_20
{
	public static void main(String[] args)
	{
		Solution1_20 solution1_20 = new Solution1_20();
		int[] arr = solution1_20.solution(12345);

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i]);
	}

}

class Solution1_20
{
	public int[] solution(long n)
	{
		int[] answer =
		{};

		ArrayList<Long> list = new ArrayList<>();

		while (n > 0)
		{
			list.add(n % 10);
			n /= 10;
		}

		answer = new int[list.size()];

		int index = 0;
		
		for (long num : list)
		{
			answer[index++] = (int) num;
		}

		return answer;
	}
}
// 기존 코드와 비교도 안되게 빠르다