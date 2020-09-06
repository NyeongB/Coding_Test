// Date : 2020.09.06
// Title : 주사위 세개
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_04
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str = br.readLine().split(" ");
		
		int num1 = Integer.parseInt(str[0]);
		int num2 = Integer.parseInt(str[1]);
		int num3 = Integer.parseInt(str[2]);
		
		if(num1 == num2 && num2 == num3)
		{
			System.out.println(num1*1000 + 10000);
		}
		else
		{
			if(num1== num2)
			{
				System.out.println(num1*100 + 1000);
			}
			else if(num2 == num3)
			{
				System.out.println(num2*100 + 1000);
			}
			else if(num3 == num1)
			{
				System.out.println(num3*100 + 1000);
			}
			else
			{
				System.out.println(Math.max(Math.max(num1, num2),num3)*100);
			}
		}
	}
}