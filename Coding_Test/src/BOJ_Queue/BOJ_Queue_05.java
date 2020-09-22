// Date : 2020.09.22
// Title : 최소 힙
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Queue
 
package BOJ_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class BOJ_Queue_05
{
	public static void main(String [] agrs) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
		StringBuffer sb = new StringBuffer();
		
		while(n-- >0)
		{
			int temp = Integer.parseInt(br.readLine());
			
			if(temp == 0)
			{
				if(q.isEmpty())
				{
					sb.append("0\n");
				}
				else
				{
					sb.append(q.poll()).append("\n");
				}
			}
			else
			{
				q.add(temp);
			}
		}
		
		System.out.println(sb.toString());
		
	}
}

// 우선순위 큐를 사용하면 쉽게 풀 수 있는 문제
// 지난번에 최대 힙 문제와는 다르게 오르차순으로 기준을 잡아야한다 
// n 번의 입력을 받기위해 while문의 조건을 설정했으며
// 0일 경우에는 비었을때와 비어있지 않을때를 분기한다.
// 속력을 위하여 StringBuilder 를 사용하였다.