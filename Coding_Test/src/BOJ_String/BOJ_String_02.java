// Date : 2020.08.31
// Title : 숫자의 갯수
// Author : Choi Cheol Nyeong
// Language : Java
// classification : String
 
package BOJ_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_String_02
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A,B,C;
		
		A = Integer.parseInt(br.readLine());
		B = Integer.parseInt(br.readLine());
		C = Integer.parseInt(br.readLine());
		
		long total = A*B*C;
		
		String str = "" + total;
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<10; i++)
		{
			int count = 0;
			
			for(int j=0; j<str.length(); j++)
			{
				if((str.charAt(j)-'0')==i)
				{
					count++;
				}
			}
			sb.append(count+"\n");
		}
		
		System.out.println(sb.toString());
	}
	
}