// Date : 2020.10.22
// Title : A+B - 5
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_26
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true)
		{
			String [] str = br.readLine().split(" ");
			
			if(str[0].equals("0"))
				break;
			
			sb.append(Integer.parseInt(str[0]) + Integer.parseInt(str[1])+"\n");
		}
		
		System.out.println(sb.toString());
		
	}
}
