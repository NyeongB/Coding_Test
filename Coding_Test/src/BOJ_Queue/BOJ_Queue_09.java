// Date : 2020.10.28
// Title : 절대값 힙
// Author : Choi Cheol Nyeong
// Language : Java
// classification : PriorityQueue

package BOJ_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class BOJ_Queue_09
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

// 한번에 성공해서 굉장히 뿌듯한 프린터 큐 구현
// 핵심은 우선순위가 높은것이 있는지 없는지 판단을 배열의 전체 탐색을 통해서 진행하였고
// 출력이 된이후엔 우선순위를 죽이기 위해 0 으로 대입했다.
