// Date : 2020.08.30
// Title : 괄호
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Stack

package BOJ_Stack;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_Stack_02
{
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

}