// Date : 2020.09.15
// Title : 검증수
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.util.Scanner;

public class BOJ_Basic_10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String [] str = sc.nextLine().split(" ");
		
		int [] arr = new int[str.length];
		
		int result = 0;
		
		for(int i=0; i<str.length; i++)
		{
			arr[i] = Integer.parseInt(str[i]);

			result += arr[i]*arr[i];
		}
		
		System.out.println(result%10);
		
		sc.close();
		
		
	}
}