// Date : 2020.08.30
// Title : 큐
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Queue
 

//push X: 정수 X를 큐에 넣는 연산이다.
//pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//size: 큐에 들어있는 정수의 개수를 출력한다.
//empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
//front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
//back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

package BOJ_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
public class BOJ_Queue_01
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		LinkedList<Integer> q = new LinkedList<>();
		
		int n = Integer.parseInt(br.readLine());	// br.read() 사용하면 백준에서 틀린거로 처리? 같은정수인데.. 
		
		String [] str;
		String command;
		
		while(n-- !=0)
		{
			str = br.readLine().split(" ");
			command = str[0];
			
			switch(command)
			{
				case "push" :
					int num = Integer.parseInt(str[1]); 
					q.offer(num);
					break;
				case "front" :
					if(!q.isEmpty())
						System.out.println(q.peek());
					else
						System.out.println(-1);
					break;
				case "back" :
					if(!q.isEmpty())
						System.out.println(q.peekLast());
					else
						System.out.println(-1);
					break;
				case "size" :
					System.out.println(q.size());
					break;
				case "empty" :
					if(q.isEmpty())
						System.out.println(1);
					else
						System.out.println(0);
					break;
				case "pop" :
					if(!q.isEmpty())
						System.out.println(q.poll());
					else
						System.out.println(-1);
					break;
			}
		}
				
	}
	
}