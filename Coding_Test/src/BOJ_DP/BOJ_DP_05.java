// Date : 2020.10.22
// Title : 이친수
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Dynamic Programming
 
package BOJ_DP;

import java.util.Scanner;

public class BOJ_DP_05
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		long [] arr = new long[91];
		
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i=3; i<=n; i++)
		{
			arr[i] = arr[i-2] + arr[i-1];
		}
		
		System.out.println(arr[n]);
		
		sc.close();
	}
	
}

// 항상 범위에 신경쓰며
// DP는 점화식을 잘 세워야한다.