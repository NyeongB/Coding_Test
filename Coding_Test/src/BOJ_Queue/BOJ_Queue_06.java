// Date : 2020.09.25
// Title : 카드2
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Queue
 
package BOJ_Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BOJ_Queue_06
{
	public static void main(String [] agrs)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num==1)
		{
			System.out.println(1);
			return;
		}
		
		sc.close();
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i=1; i<=num; i++)	// 초기화
		{
			q.add(i);
		}
		
		
		
		while(true)
		{
			q.poll();	// 맨위 제거 
			if(q.size()==1)
				break;
			int temp = q.poll();
			
			q.add(temp);
		}
		
		System.out.println(q.poll());
		
	}
}

// 간단한 큐문제 문제를 읽는 순간 큐로 해결해야겠다는 생각을 할수있어서 다행이다.
// 구현은 금방하였지만 입력값이 1인 경우를 생각하지않았다.
// N 의 조건을 잘 보는 습관을 갖자..