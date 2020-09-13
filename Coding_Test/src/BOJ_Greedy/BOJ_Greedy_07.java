// Date : 2020.09.13
// Title : ATM
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Greedy
 
package BOJ_Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_Greedy_07
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		
		Arrays.sort(arr);
		
		int result = 0;
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
				result += arr[j];
		}
		
		System.out.println(result);
		
		sc.close();
	}
	
}