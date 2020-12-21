// Date : 2020.12.12
// Title : 좋은 자동차 번호판
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_40
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int total = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		while(total-->0)
		{
			String [] str = br.readLine().split("-");
			
			
			int num1 = 0;
			int num2 = Integer.parseInt(str[1]);
			
			for(int i=0; i<str[0].length(); i++)
			{
				char ch = str[0].charAt(i);
				
				num1 += (int)(ch-65) * Math.pow(26, str[0].length()-1-i);	// A ~ Z 까지 26진법
			}
			
			int result = Math.abs(num1 - num2);
			
			if(result>=1 && result<= 100)
			{
				sb.append("nice\n");
			}
			else
				sb.append("not nice\n");
			
		}
		
		System.out.println(sb.toString());
	}
}