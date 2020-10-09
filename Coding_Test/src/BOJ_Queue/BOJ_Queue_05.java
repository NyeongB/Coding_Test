// Date : 2020.09.22, 20.10.09
// Title : 최소 힙
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Queue

package BOJ_Queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_Queue_05
{
	public static void main(String[] agrs)
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		
		Queue<Integer> q = new PriorityQueue<>();
		
		while(n-->0)
		{
			int temp = sc.nextInt();
			if(temp==0)
			{
				if(!q.isEmpty())
					sb.append(q.poll()+"\n");
				else
					sb.append("0\n");
			}
			else
				q.add(temp);
			
		}
		
		System.out.println(sb.toString());
	}
}

// 우선순위 큐를 사용하면 쉽게 풀 수 있는 문제
// 지난번에 최대 힙 문제와는 다르게 오르차순으로 기준을 잡아야한다 
// n 번의 입력을 받기위해 while문의 조건을 설정했으며
// 0일 경우에는 비었을때와 비어있지 않을때를 분기한다.
// 속력을 위하여 StringBuilder 를 사용하였다.