// Date : 2020.09.01
// Title : 소수 구하기
// Author : Choi Cheol Nyeong
// Language : Java
 
package BOJ_Basic;

import java.util.Scanner;

public class BOJ_Basic_01
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String [] str = sc.nextLine().split(" ");
		int s = Integer.parseInt(str[0]);
		int e = Integer.parseInt(str[1]);
		
		StringBuffer sb = new StringBuffer();
		for(int i=s; i<=e; i++)
		{
			if(prime(i))
			{
				sb.append(i+"\n");
			}
		}
		
		System.out.println(sb.toString());
		sc.close();
	}
	
	static boolean prime(int num)
	{
		if(num<=1)
			return false;
		else
		{
			for(int i=2; i<=Math.sqrt(num); i++)
			{
				if(num%i==0)
					return false;
			}
		}
		
		return true;
	}
	
}