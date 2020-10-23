// Date : 2020.10.23
// Title : 2Xn 타일링
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Dynamic Programming
 
package BOJ_DP;

import java.util.Scanner;

public class BOJ_DP_07
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		long [] arr = new long[1001];
		
		arr[1] = 1;
		arr[2] = 2;
		
		for(int i=3; i<=num; i++)
		{
			arr[i] = (arr[i-2] + arr[i-1]) % 10007;
		}
		
		System.out.println(arr[num]);
		
		sc.close();
		
	}
	
}

// DP 문제는 항상 점화식을 생각한다