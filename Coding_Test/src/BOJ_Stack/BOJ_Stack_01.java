// Date : 2020.08.30
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
		//System.out.println(str);
		
		Stack<Character> s = new Stack<>();
		
		int answer = 0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)=='(')
			{
				s.push('(');
			}
			else if(str.charAt(i)==')')
			{
				if(str.charAt(i-1)=='(')
				{
					s.pop();
					answer +=s.size();
					
				}
				else
				{
					answer++;
					s.pop();
				}
			}
		}
		
		System.out.println(answer);
		
	}
	
}