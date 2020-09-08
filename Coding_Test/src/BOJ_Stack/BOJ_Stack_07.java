// Date : 2020.09.08
// Title : 균형잡힌 세상
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Stack
 
package BOJ_Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_Stack_07
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		StringBuffer sb = new StringBuffer();
		
		while(true)
		{
			str = br.readLine();
			if(str.equals("."))
				break;
			
			Stack<Character> st = new Stack<Character>();
			for(int i=0; i<str.length(); i++)
			{
				char temp = str.charAt(i);
				
				if(temp=='(')
				{
					st.push('(');
				}
				else if(temp=='[')
				{
					st.push('[');
				}
				else if(temp==')'&&!st.isEmpty()&&st.peek()=='(')	// 스택이 비어있을때 peek() 한경우를 방지 
				{
						st.pop();
				}
				else if(temp==']'&&!st.isEmpty()&&st.peek()=='[')
				{
						st.pop();
				}
				else if (temp == ')' || temp ==']') 
					st.push(temp);

			}
			
			
			
			if(!st.isEmpty())
				sb.append("no\n");
			else
				sb.append("yes\n");
			
		}
		
		System.out.println(sb.toString());
	}
	
}
// 다 풀어놓고 몇몇 조건떄문에 8번 도전한문제.. 
// 우선 가장 큰 실수는 ')', ']' 하나씩 들어갈때 조건처리 안해준것
// else if(temp==']'&&!st.isEmpty()&&st.peek()=='[') (O)
/*
else if(temp==')'&&!st.isEmpty())	 
				{
					if(st.peek()=='(')
						st.pop();
				}					(X)
*/
