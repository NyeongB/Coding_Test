// Date : 2020.09.03
// Title : 요세푸스 문제 0
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Queue
 
package BOJ_Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class BOJ_Queue_03
{
	public static void main(String [] agrs)
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		LinkedList<Integer> q = new LinkedList<Integer>();
		
		for(int i=0; i<N; i++)
			q.add(i+1);
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(!q.isEmpty())
		{
			
			for(int i=0; i<K-1; i++)
			{
				int temp = q.pop();
				q.offer(temp);				// linkedlist 를 q 처럼 쓸려면 반드시 offer 이나 add 로 추가해야함 안그럼 정렬발생... push 뭐지.. 
			}
			//System.out.println(q.peek());
			list.add(q.pop());
			
		}
		
		System.out.print("<"+list.get(0));
		for(int i=1; i<list.size(); i++)
			System.out.print(", "+list.get(i));
		System.out.print(">");
	}		
}