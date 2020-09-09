// Date : 2020.09.09
// Title : 열 개씩 끊어 출력하기 
// Author : Choi Cheol Nyeong
// Language : Java
// classification : String
 
package BOJ_String;

import java.io.BufferedReader;
import java.io.*;

public class BOJ_String_07 
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		
		for(int i=0; i<str.length(); i++)
		{
			if(i%10==0&&i!=0)
				System.out.println();
			System.out.print(str.charAt(i));
			
		}
	}
	
}