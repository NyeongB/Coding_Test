// Date : 2020.08.30, 20.09.25, 20.11.08
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
		
		char [] arr = br.readLine().toCharArray();
		
		int answer = 0;
		
		Stack<Character> st = new Stack<Character>();
		
		for(int i=0; i<arr.length; i++)
		{
			char temp = arr[i];
			
			if(temp=='(')
			{
				st.push('(');
			}
			else
			{
				if(arr[i-1] == '(') // 이전꺼가 ( 이면 하나 제거후 사이즈 넣기 (레이저쏘기)
				{
					st.pop();
					answer += st.size();
				}
				else
				{
					answer++;
					st.pop();
				}
			}
		}
		
		System.out.println(answer);
		
	}
}

// toCharArray() 를 사용하여 새로풀어봤는데 150ms 만큼 더걸린다..? // 다시해보니 오류였네 같은코드가 채점 섭컴터상태에따라 다른듯