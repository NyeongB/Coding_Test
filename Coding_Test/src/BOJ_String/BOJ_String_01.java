// Date : 2020.08.29
// Title : OX퀴즈
// Author : Choi Cheol Nyeong
// Language : Java
// classification : String
 
package BOJ_String;

import java.util.Scanner;

public class BOJ_String_01
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [] str = new String [n];
		for(int i=0; i<n; i++)
		{
			str[i] = sc.next();
		}
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<n; i++)
		{
			int len = str[i].length();
			int temp = 0;
			int count =0;
			for(int j=0; j<len; j++) {
				
				if(str[i].charAt(j)=='O')
				{
					count++;
					temp+=count;
				}
				else if(str[i].charAt(j)=='X')
				{
					count=0;
				}
				
			}
			sb.append(temp+"\n");
		}
		
		System.out.println(sb.toString());
		
	}
	
}