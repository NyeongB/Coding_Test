// Date : 2020.08.30, 20.09.25
// Title : 쇠막대기
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Stack
 
package BOJ_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_Stack_01
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		Stack<Character> st = new Stack<Character>();
		
		int answer = 0;
		
		for(int i=0; i<str.length(); i++)
		{
			char temp = str.charAt(i);
			if(temp=='(')
				st.push('(');
			else
			{
				if(str.charAt(i-1)=='(')
				{
					st.pop();
					answer += st.size();
					
				}
				else
				{
					st.pop();
					answer++;
				}
			}
		}
		
		System.out.println(answer);
		
		
	}
	
}