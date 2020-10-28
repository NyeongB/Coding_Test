// Date : 2020.10.28
// Title : 절대값 힙
// Author : Choi Cheol Nyeong
// Language : Java
// classification : PriorityQueue

package BOJ_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;

public class BOJ_Queue_08
{

	public static void main(String[] args) throws IOException
	{
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(new Comparator<Integer>()
		{
			@Override
			public int compare(Integer a, Integer b)
			{
				if (Math.abs(a) > Math.abs(b) || (Math.abs(a) == Math.abs(b) && a > b)) // 절대값이 작은게 들어올때마다, 같으면 작은값이
																						// 들어올때마다
					return 1;
				else
					return -1;
			}
		});

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		while (n-- > 0)
		{
			int input = Integer.parseInt(br.readLine());
			if (input == 0)
			{
				if (!q.isEmpty())
					sb.append(q.poll() + "\n");
				else
					sb.append("0\n");
			} else
				q.add(input);
		}

		System.out.println(sb.toString());

	}
}