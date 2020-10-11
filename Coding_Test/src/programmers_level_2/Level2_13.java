// Date : 2020.09.14, 20.10.11
// Title : 더 맵게
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Heap

package programmers_level_2;

import java.util.PriorityQueue;
import java.util.Queue;

public class Level2_13
{
	public static void main(String[] args)
	{
		Solution2_13 solution = new Solution2_13();

		System.out.println(solution.solution(new int[]
		{ 1, 2, 3, 9, 10, 12 }, 7));
	}

}

class Solution2_13
{
	public int solution(int[] scoville, int K)
	{
		int answer = 0;

		// 최소 힙 선언
		PriorityQueue<Integer> q = new PriorityQueue<>();

		// 스코빌 배열에서 큐로 초기화
		for (int n : scoville)
			q.add(n);

		while (true)
		{
			if (q.peek() >= K)//
				break;

			if (q.size() == 1)
			{
				return -1;
			}

			int a = q.poll();
			int b = q.poll();

			q.add(a + 2 * b);
			answer++;
		}

		return answer;
	}
}
//힙은 데이터를 입력하면 자동으로 우선순위에 따라 정렬해주는 자료구조
//우선순위 큐는 이러한 힙을 이용하여 구현한 자료구조이다.
//이러한 힙의 성질을 고려해볼 때, PriorityQueue에서 데이터를 poll() 할때마다, 스코빌을 계산하여 offer()한다.

// 다시 풀어보고 중요하다고 느낀게 처음 드는 생각으로
// 모든것들이 K 보다 커지는 순간을 최솟값인 가장앞에있는거 하나만 비교하면되는데
// 반복문으로 q의사이즈와 K보다 큰거의 갯수가 같으면 반환하는 알고리즘을 생각해 효율성에서 모두 시간초과났다.
// 자료구조를 이해하고 그의 특성을 잘 이용해 문제를 해결해야될것같다.