// Date : 2020.10.24
// Title : 압축
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Stack
 
package BOJ_Stack;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_Stack_10
{
	static int [] visit = new int[51];
	public static void main(String[] args)
	{
		// 33(562(71(9)))
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> st = new Stack<Integer>();
		
		String str = sc.next();
		
		for(int i=0; i<str.length(); i++)
		{
			char temp = str.charAt(i);
			if(temp=='(')
			{
				st.add(i);	// 인덱스 기억해놓기
			}
			else if(temp==')')
			{
				visit[st.pop()] = i;
			}
		}
		
		System.out.println(recursion(str,0,str.length()));
		
		sc.close();
	}
	
	public static int recursion(String str, int start, int end)
	{
		int result = 0;
		
		
		for(int i=start; i<end; i++)
		{
			char temp = str.charAt(i);
			
			
			if(temp=='(')
			{
				int k = str.charAt(i-1) - '0';
				
				result += k * recursion(str,i+1,visit[i]) - 1;
				i = visit[i];
				continue;
			}
			
			result++;
			
		}
		
		
		return result;
	}
	
}