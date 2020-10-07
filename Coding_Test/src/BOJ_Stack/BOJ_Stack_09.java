// Date : 2020.10.07
// Title : 수 뒤집기
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Stack
 
package BOJ_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_Stack_09
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> st = new Stack<>();
		
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(num-- >0)
		{
			String [] str = br.readLine().split(" ");
			
			for(int i=0; i<str.length; i++)
			{
				for(int j=0; j<str[i].length(); j++)	// " "단위로 자른 스트링 갯수만큼 스택에 넣었다가
				{
					st.push(str[i].charAt(j));
				}
				
				for(int j=0; j<str[i].length(); j++) // 고대로 스택에서 그수만큼 빼기
				{
					sb.append(st.pop());
				}
				sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
	
}