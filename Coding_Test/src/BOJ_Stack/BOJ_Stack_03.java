// Date : 2020.08.30
// Title : 스택
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Stack

/*
push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
*/
 
package BOJ_Stack;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_Stack_03
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());	// nextInt() 로하면 공백이 계속 들어감
		String command="";
		String [] str;
		
		Stack<Integer> s = new Stack<>();
		
		while(n-- >0)
		{
			str = sc.nextLine().split(" ");
			command = str[0];
			//System.out.println("str0"+str[0]);
			
			switch(command)
			{
				case "push" :
					int pushNum = Integer.parseInt(str[1]);
					//System.out.println("str1:"+str[1]);
					s.push(pushNum);
					break;
				case "pop" :
					if(!s.isEmpty())
						System.out.println(s.pop());
					else
						System.out.println(-1);
					break;
				case "size" :
					System.out.println(s.size());
					break;
				case "empty" :
					if(s.isEmpty())
						System.out.println(1);
					else
						System.out.println(0);
					break;
				case "top" :
					if(!s.isEmpty())
						System.out.println(s.peek());
					else
						System.out.println(-1);
					break;
					
			}
		}
	}
	
}