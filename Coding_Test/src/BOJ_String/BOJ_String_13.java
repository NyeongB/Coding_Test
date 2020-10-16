// Date : 2020.10.16
// Title : Hashing
// Author : Choi Cheol Nyeong
// Language : Java
// classification : String
 
package BOJ_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_String_13
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		long total = 0;
		
		for(int i=0; i<str.length(); i++)	
		{
			char temp = str.charAt(i);
			
			total += Math.pow(31, i) * ((int)temp - 96);
		}
		
		System.out.println(total);
	}
	
}