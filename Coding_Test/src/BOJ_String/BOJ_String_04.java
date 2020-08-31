// Date : 2020.08.31
// Title : A+B -6
// Author : Choi Cheol Nyeong
// Language : Java
// classification : String
 
package BOJ_String;

import java.util.Scanner;

public class BOJ_String_04
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int n = sc.nextInt();
		for(int i=0; i<n; i++)
		{
			int temp = plus(sc.next());
			sb.append(temp+"\n");
		}
		System.out.println(sb.toString());
	}
	
	public static int plus(String str)
	{
		int result = 0;
		String [] num = str.split("\\,");
		result = Integer.parseInt(num[0]) + Integer.parseInt(num[1]);
		return result;
	}
	
}