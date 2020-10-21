// Date : 2020.10.22
// Title : 직각삼각형
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_Basic_24
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		while(true)
		{
			int [] arr = new int[3];
			String [] str = br.readLine().split(" ");
			if(str[0].equals("0"))
				break;
			
			arr[0] = Integer.parseInt(str[0]);
			arr[1] = Integer.parseInt(str[1]);
			arr[2] = Integer.parseInt(str[2]);
			
			Arrays.sort(arr);
			
			if(arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2])
			{
				sb.append("right\n");
			}
			else
				sb.append("wrong\n");
			
		}
		
		System.out.println(sb.toString());
	}
}