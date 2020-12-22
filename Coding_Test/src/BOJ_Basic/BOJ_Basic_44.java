// Date : 2020.12.22
// Title : 홀수
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_44
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int total = 0;
		
		int min = Integer.MAX_VALUE;
		
		
		
		for(int i=0; i<7; i++)
		{
			int input_num = Integer.parseInt(br.readLine());
			
			if(input_num % 2 != 0)
			{
				if(min > input_num)
				{
					min = input_num;
				}
				
				total += input_num;
			}
		}
		
		
		if(min == Integer.MAX_VALUE)
		{
			System.out.println(-1);
		}
		else
		{
			System.out.println(total);
			System.out.println(min);
		}
		
		
			
	}
}