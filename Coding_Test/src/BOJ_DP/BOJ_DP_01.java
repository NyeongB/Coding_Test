// Date : 2020.09.07
// Title : 피보나치 수 2
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Dynamic Programming
 
package BOJ_DP;

import java.util.Scanner;

public class BOJ_DP_01
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		long [] fibo = new long [91];
		
		fibo[0] = 0;
		fibo[1] = 1;
		
		for(int i=2; i<=num; i++)
		{
			fibo[i] = fibo[i-2] + fibo[i-1];
		}
		
		System.out.println(fibo[num]);

		
		
		sc.close();
	}
	
}
// 주의 할점 n이 90 까지니깐 배열은 91까지 준비되어있어야함
// 피보나치수가 int 형 범위 밖일 경우가 있으로 long으로 준비함
// DP로 풀어야 속도가 나옴 재귀 피보나치 이용시 시간초과 