// Date : 2020.09.26
// Title : 문자가 몇갤까
// Author : Choi Cheol Nyeong
// Language : Java
// classification : String
 
package BOJ_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_String_11
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true)
		{
			String str = br.readLine();
			
			if(str.equals("#"))
				break;
			
			int count = 0;
			ArrayList<Character> list = new ArrayList<Character>();
			
			for(int i=0; i <str.length(); i++)
			{
				char temp = str.charAt(i);
				
				if( ((65<= temp && temp <=90) ) && list.indexOf(temp)<0 )	// 대문자이고 안들어갔다면
				{	
					count++;
					list.add(temp);
					list.add((char)(temp+32));	// 그에 소문자도 같이
				}
				else if( (97<= temp && temp <=122) && list.indexOf(temp)<0 ) // 소문자이고 안들어갔다면
				{
					count++;
					list.add(temp);
					list.add((char)(temp-32)); // 그에 대문자도 같이
				}
			}
			
			
			sb.append(count).append("\n");
		}
		
		System.out.println(sb.toString());
	}
	
}

// ArrayList 의 indexOf 를활용하여 문자가 이미 들어간지 안들어간지를 파악하였다
// 약간 하드 코딩인거같다.