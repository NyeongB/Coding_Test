// Date : 2020.09.09
// Title : 실패율
// Author : Choi Cheol Nyeong
// Language : Java

package programmers_level_1_1;

import java.util.*;

public class Level1_37
{
	public static void main(String[] args)
	{
		int[] stages =
		{ 2, 1, 2, 6, 2, 4, 3, 3 };
		int N = 5;
		Solution1_37 solution1_34 = new Solution1_37();

		int[] arr = solution1_34.solution(N, stages);

		for (int n : arr)
			System.out.println(n);
	}

}

class Solution1_37
{
	public int[] solution(int N, int[] stages)
	{
		int[] answer = new int[N];

		int[] arr = new int[N + 2];

		ArrayList<Pair> list = new ArrayList<>();

		for (int i = 0; i < stages.length; i++)
			arr[stages[i] - 1]++;

		int total = stages.length;

		for (int i = 0; i < N; i++)
		{

			double fail = (double) arr[i] / total;

			total -= arr[i];
			// System.out.println(fail);

			list.add(new Pair(fail, i + 1));

		}

		Collections.sort(list, new Comparator<Pair>()
		{
			public int compare(Pair a, Pair b)
			{
				if (b.x > a.x)
					return 1;
				else if (b.x < a.x)
					return -1;
				else
					return 0;
			}
		});

		for (int i = 0; i < answer.length; i++)
			answer[i] = list.get(i).y;
		return answer;
	}
}

class Pair
{
	Double x;
	int y;

	public Pair(Double x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

// 실패율을 어레이리스트에 indexOf, remove 식으로 하다가 시간초과가 뜸..
// 간단하게 배열로 카운트와 토탈을 구해서 실패율을 넣는게 포인트
// 또한 어아니머스 클래스 Comparator 와 compare 메소드 오버라이드 해서 Pair 클래스의 실패율 값에 따라 내림차순하는것도 관건 