// Date : 2020.12.06
// Title : 완전 제곱수
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_36
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());

		int sum = 0;
		int min = 10000;

		for (int i = 1; i <= 100; i++)
		{
			int temp = i*i;
			if( temp>=M&&temp<=N )
			{
				min = Math.min(temp,min);
				sum += temp;
			}
		}
		
		if(min == 10000)
			System.out.println(-1);
		else
		{
			System.out.println(sum);
			System.out.println(min);
		}
		
	}
}