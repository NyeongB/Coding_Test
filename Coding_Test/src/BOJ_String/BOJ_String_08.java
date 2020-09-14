// Date : 2020.09.14
// Title : ROT13
// Author : Choi Cheol Nyeong
// Language : Java
// classification : String
 
package BOJ_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_String_08
{
	public static void main(String[] args) throws IOException
	{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String answer = "";
		
		for(int i=0; i<str.length(); i++)
		{
			char temp = str.charAt(i);
			if(65<= temp && temp <= 90)
			{
				temp = (char)((temp-65+13)%26 + 65);
			}
			else if(97<=temp && temp<=122)
			{
				temp = (char)((temp-97+13)%26 + 97);
			}
			
			answer +=temp;
		}
		
		System.out.println(answer);
	}
	
}