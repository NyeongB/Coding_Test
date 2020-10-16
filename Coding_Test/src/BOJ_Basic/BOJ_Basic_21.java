// Date : 2020.10.16
// Title : 벌집
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.util.Scanner;

public class BOJ_Basic_21
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int total = 1;
		int index = 0;
		while(true)
		{
			if(num==1)
			{
				System.out.println(1);
				return;
			}
			if(total>=num)
			{
				break;
			}
			total += 6*++index;
		}
		System.out.println(++index);
	}
}

// 생긴건 어렵게 생겼으나 규칙을 찾을수있다면 해결할 수 있는 문제
// 1 (6) 7 (12) 19 (18) 37 의 증가를 어떻게 코트로 구현하는게 관건인듯