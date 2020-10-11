// Date : 2020.10.11
// Title : 이중우선순위큐
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Heap

package programmers_level_3;

import java.util.Collections;
import java.util.PriorityQueue;

public class Level3_05
{

	public static void main(String[] args)
	{
		Solution solution = new Solution();

		int[] arr = solution.solution(new String[]
		{ "I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1" });

		for (int n : arr)
			System.out.println(n);
	}

}

class Solution
{
	public int[] solution(String[] operations)
	{
		int[] answer = new int[2];

		// 최소힙, 최대힙 선언
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < operations.length; i++)
		{
			String[] temp = operations[i].split(" ");

			char com = temp[0].charAt(0);
			int n = Integer.parseInt(temp[1]);

			if (com == 'I')
			{
				minHeap.add(n);
				maxHeap.add(n);
			} else if (com == 'D')
			{
				if (n == 1) // 최대 제거
				{
					if (maxHeap.isEmpty())
						continue;
					int t = maxHeap.poll();
					minHeap.remove(t);
				} else if (n == -1) // 최소 제거
				{
					if (minHeap.isEmpty())
						continue;
					int t = minHeap.poll();
					maxHeap.remove(t);
				}
			}

		}

		if (!minHeap.isEmpty())
		{
			answer[0] = maxHeap.poll();
			answer[1] = minHeap.poll();
		}

		return answer;
	}
}

// 항상 문제풀때 실수하는점 자료구조를 사용할때 비어있을때 pop()하는 실수
// 문제를 잘 읽고 없는 경우의 케이스가 들어오는지 확인후 대처

// 오늘 처음 난 실수 중괄호 조심 마지막 if문이 반복문안에들어있었다 소름

// 레벨3 문제라고하긴 쉬운문제인듯하나 우선순위큐를 확인하는문제