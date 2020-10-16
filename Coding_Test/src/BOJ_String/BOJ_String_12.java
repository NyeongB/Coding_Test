// Date : 2020.10.16
// Title : 그룹 단언 체커
// Author : Choi Cheol Nyeong
// Language : Java
// classification : String
 
package BOJ_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_String_12
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		while(n-->0)
		{
			String temp = br.readLine();
			if(check(temp))
			{
				count++;
			}
		}
		
		System.out.println(count);
	}
	
	static boolean check(String str)
	{
		boolean result = true;
		ArrayList<Character> list = new ArrayList<Character>();
		char last = str.charAt(0);
		list.add(last);
		
		for(int i=1; i<str.length(); i++)
		{
			char temp = str.charAt(i);
			
			if(temp==last)
			{
				last = temp;
			}
			else if(!list.contains(temp))
			{
				list.add(temp);
				last = temp;
			}
			else
			{
				//System.out.println(str);
				return false;
			}
			
		}
		
		return result;
	}
	
}