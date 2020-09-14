// Date : 2020.09.15
// Title : 최대 힙
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Queue
 
package BOJ_Queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_Queue_04
{
	public static void main(String [] agrs)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		Queue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		
		StringBuffer sb = new StringBuffer();
		
		while(n-->0)
		{
			int temp = sc.nextInt();
			
			if(temp==0)
			{
				if(q.isEmpty())
					sb.append("0\n");
				else
					sb.append(q.poll()+"\n");
			}
			q.add(temp);
		}
		
		System.out.println(sb.toString());
		
		
		sc.close();
	}
}