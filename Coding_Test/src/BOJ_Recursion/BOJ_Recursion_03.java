// Date : 2020.01.08
// Title : 소수 찾기 
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Permutaion

package BOJ_Recursion;

import java.io.IOException;
import java.util.*;

public class BOJ_Recursion_03
{

	public static void main(String[] args)
	{

		System.out.println(solution("17"));
	}

	static int[] output;
	static int[] nums;
	static int[] visited;
	static Set<Integer> set = new HashSet<>();

	public static int solution(String numbers)
	{
		int answer = 0;

		String[] str = numbers.split("");
		nums = new int[str.length];
		visited = new int[str.length];
		output = new int[str.length];
		for (int i = 0; i < str.length; i++)
		{
			nums[i] = Integer.parseInt(str[i]);
		}

		for (int i = 1; i <= str.length; i++)
			perm(0, i, str.length);

		for (int s : set)
		{
			if (isPrime(s))
				answer++;
		}

		return answer;
	}

	public static void perm(int count, int depth, int N)
	{
		if (count == depth)
		{
			String temp = "";
			for (int i = 0; i < depth; i++)
			{
				temp += output[i];
			}

			set.add(Integer.parseInt(temp));
			return;
		}

		for (int i = 0; i < N; i++)
		{
			if (visited[i] == 0)
			{
				visited[i] = 1;
				output[count] = nums[i];
				perm(count + 1, depth, N);
				visited[i] = 0;
			}
		}

	}

	public static boolean isPrime(int n)
	{
		if (n < 2)
			return false;
		boolean result = true;

		for (int i = 2; i <= (int) Math.sqrt(n); i++)
		{
			if (n % i == 0)
				return false;
		}

		return result;
	}

}

// 순열로 풀어야함 
// 7 0 1 이면 7, 0, 1 -> 70 71 01 07 17 10, 701 017 170 107 710 071 -> 이것들중에 소수를 찾음
// Set 자료구조를 사용하여 우선 다넣는데 중복이 안되는것중에 소수를 따로 찾음
// 꽤 귀찮은 문제
