// Date : 2020.09.30
// Title : 윷놀이
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_16
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		String [] str;
		int count;
		
		for(int i=0; i<3; i++)
		{
			str = br.readLine().split(" ");
			count = 0;
			
			for(int j=0; j<4; j++)
			{
				if(str[j].equals("0"))
					count++;
			}
			
			switch(count)
			{
			case 0:
				sb.append("E\n");
				break;
			case 1:
				sb.append("A\n");
				break;	
			case 2:
				sb.append("B\n");
				break;	
			case 3:
				sb.append("C\n");
				break;	
			case 4:
				sb.append("D\n");
				break;	
			}
		}
		
		
		System.out.println(sb.toString());
	}
}