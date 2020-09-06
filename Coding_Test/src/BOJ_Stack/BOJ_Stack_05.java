// Date : 2020.09.06
// Title : 좋은 단어
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Stack
 
package BOJ_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_Stack_05
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		//Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int count = 0; // 좋은 단어의 갯수
		//System.out.println(n);
		for(int i=0; i<n; i++)
		{
		
			Stack<Character> st = new Stack<Character>();
			String str = br.readLine();
			//System.out.println(str);
			for(int j=0; j<str.length(); j++)
			{
				if(st.isEmpty())
				{
					//System.out.println("테스트1");
					st.push(str.charAt(j));	// 비어 있다면 넣는다
				}
				else if(st.peek() == str.charAt(j))
				{
					//System.out.println("테스트2");
					st.pop();	// 가장 나중에 들어온거랑 현재거랑 같다면 비운다.
				}
				else if(st.peek() != str.charAt(j))
				{
					//System.out.println("테스트3");
					st.push(str.charAt(j));	// 가장 나중에 들어온거랑 현재것과 다르면 푸쉬
				}
				
				
				
			}
			
			if(st.isEmpty())
			{
				count++;
				//System.out.println("비었나요?"+(i+1));
			}	
			
		}
		
		System.out.println(count);
		
	}
	
}
