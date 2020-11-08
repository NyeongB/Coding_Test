// Date : 2020.08.29, 20.11.08
// Title : OX퀴즈
// Author : Choi Cheol Nyeong
// Language : Java
// classification : String
 
package BOJ_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_String_01
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		while(total-->0)
		{
			char [] arr = br.readLine().toCharArray();
			int sum = 0;
			int num = 0;
			for(int i=0; i<arr.length; i++)
			{
				if(arr[i]=='O')
				{
					sum += ++num;
				}
				else if(arr[i] == 'X')
				{
					num = 0;
				}
			}
			sb.append(sum+"\n");
		}
		
		System.out.println(sb.toString());
	}
	
}

// 더 간결한 코드 구성