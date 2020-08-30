// Date : 2020.08.30
// Title : 요세푸스 문제
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Queue
 
package BOJ_Queue;

import java.util.LinkedList;
import java.util.Scanner;

public class BOJ_Queue_02
{
	public static void main(String [] agrs)
	{
		Scanner sc = new Scanner(System.in);
		
		String [] str = sc.nextLine().split(" ");
		
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		
		int [] answer = new int[N];
		int count = 0;
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		for(int i=1; i<=N; i++)
		{
			queue.add(i);
		}
		
		while(!queue.isEmpty())
		{
			for(int i=0; i<K-1; i++)
			{
				int temp = queue.pop();
				queue.add(temp);// 선입선출을 이용함 추출한다음 다시 넣음 → 우선순위가 낮아짐 
			}
			answer[count++] = queue.pop(); // K번째
		}
		
		// 정답 출력을 위한 
		System.out.print("<"+answer[0]);
		for(int i=1; i<N; i++)
			System.out.print(", "+answer[i]);
		
		System.out.print(">");
		
	}
}