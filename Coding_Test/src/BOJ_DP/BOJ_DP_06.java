// Date : 2020.10.22
// Title : 파도반 수열
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Dynamic Programming
 
package BOJ_DP;

import java.util.Scanner;

public class BOJ_DP_06
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int n = sc.nextInt();
		
		long [] arr = new long[101];	// 1~100 사용 index 0 은 사용안함 편의상
		
		arr[1] = arr[2] = arr[3] = 1;
		
		for(int i=4; i<=100; i++)
		{
			arr[i] = arr[i-3] + arr[i-2];
		}
		
		while(n-->0)
		{
			int temp = sc.nextInt();
			sb.append(arr[temp]).append("\n");
			
		}
		
		System.out.println(sb.toString());
		
		sc.close();
	}
	
}

// DP는 점화식 1 1 1 2 2 3 4 5 .. 등의 규칙을 보고 판단 
// 처음에 int넣어서 틀림