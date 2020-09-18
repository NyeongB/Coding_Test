// Date : 2020.09.18
// Title : 수들의 합
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.util.Scanner;

public class BOJ_Basic_12
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		
		sc.close();
		
		long count = 0;
		long sum = 0;
		for (;;)
		{
			count++;
			sum += count;
			if (sum > num)
			{
				count--;
				break;
			}
		}

		System.out.println(count);
	}
}

// 바이너리 서치 문제라고 분류되어있지만 단순 수학문제인듯하다
// long 대한 처리가 중요한 문제 