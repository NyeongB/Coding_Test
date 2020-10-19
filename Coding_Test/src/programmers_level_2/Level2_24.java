// Date : 2020.10.19
// Title : 타겟 넘버
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : DFS

package programmers_level_2;

public class Level2_24
{
	public static void main(String[] args)
	{
		int[] numbers =
		{ 1, 1, 1, 1, 1 };
		int target = 3;

		Solution2_24 solution2_24 = new Solution2_24();
		System.out.println(solution2_24.solution(numbers, target));
	}

}

class Solution2_24
{

	static int target;
	static int[] numbers;
	static int answer;

	public int solution(int[] numbers, int target)
	{

		this.target = target;
		this.numbers = numbers;

		dfs(0);

		return answer;
	}

	public void dfs(int index)
	{
		int sum = 0;

		if (index == numbers.length)
		{
			for (int n : numbers)
				sum += n;

			if (sum == target)
			{
				answer++;

			}
			return;
		}

		// 하나는 +
		numbers[index] *= 1;
		dfs(index + 1);
		// 하나는 -
		numbers[index] *= -1;
		dfs(index + 1);

	}

}

// 이 문제를 보면서 많은 것을 느꼈다
// 분명 백준 DFS, BFS 문제만 푼 상태에서 이문제를 도전했을때 탐색방법을 어떻게 구현해야될지
// 전혀 감이안와서 이렇게 어려운 문제가 Level2밖에 안된다고 생각을하며 문제를 미뤘었다
// 그 이후 꾸준히 문제를 풀며 2달이 지난 시점에서 왜 Level2 인지 알게되었다
// 까다로운 조건없이 모든 경우를 탐색하는 경우이며 배열의 길이만큼 depth를 탐색하면된다.

// 가장 중요한 부분은 +일때와 - 일때를 나눠서 접근하는 것이며 구현은 +가 먼저탐색되고 재귀가 돌아오며 - 부분을 탐색하며 
// 전역변수 answer를 증가시키며 진행된다.