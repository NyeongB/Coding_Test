// Date : 2020.09.21
// Title : 괄호
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Stack

package BOJ_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_Stack_02
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		Stack<Character> st;
		
		while(n-- >0)
		{
			st = new Stack<Character>();
			
			String str = br.readLine();
			
			for(int i=0; i<str.length(); i++)
			{
				if(str.charAt(i)=='(')
				{
					st.push('(');
				}
				else
				{
					if(!st.isEmpty())
					{
						st.pop();
					}
					else
					{
						st.push(')');	// 사실 아무거나 넣어도 상관없음 비어있지 않음의 조건검사 용도
						break;
					}
				}
			}
			
			if(st.isEmpty())
			{
				sb.append("YES\n");
			}
			else
			{
				sb.append("NO\n");
			}
			
		}
		
		System.out.println(sb.toString());
	}

}
// 기본 스택 문제 
// 스택의 감이 떨어지지 않도록 다시 풀어보았다.
// 많이 익숙해진듯하다.

/*
public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String[] str = new String[num];
		
		for (int i = 0; i < num; i++)
		{
			str[i] = sc.next();
		}
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<num; i++)
		{
			Stack<Character> s = new Stack<Character>();
			for(int j=0; j<str[i].length(); j++)
			{
				if(str[i].charAt(j)=='(')
				{
					s.push('(');
				}
				else
				{
					if(!s.isEmpty())
					{
						s.pop();
					}
					else
					{
						s.push(')');
						break;
					}
				}
			}
			if(s.isEmpty())
				sb.append("YES\n");
			else
				sb.append("NO\n");
		}
		System.out.println(sb.toString());
		
	}
*/
