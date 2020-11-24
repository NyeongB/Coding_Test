// Date : 2020.11.24
// Title : 알람 시계
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_31
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str = br.readLine().split(" ");
		
		int HH = Integer.parseInt(str[0]);
		int MM = Integer.parseInt(str[1]);
		
		
		if(MM - 45 >= 0)
		{
			System.out.println(HH +" "+(MM - 45));
		}
		else	// 시간을 줄여야할 경우에는 
		{
			if(HH - 1 >= 0) // 0일때와 아닐때를 나눠서 계산
			{
				System.out.println( (HH - 1) + " " + (60 + (MM - 45)) );
			}
			else
			{
				System.out.println( (24 - 1) + " " + (60 + (MM - 45)) );
			}
		}
		
		
	}
}