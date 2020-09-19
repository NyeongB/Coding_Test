// Date : 2020.09.19
// Title : 한수
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Bruteforcing

package BOJ_Bruteforcing;

import java.util.Scanner;

public class BOJ_Bruteforcing_01
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		int count = 0;
		
		if(num<=99)
		{
			count = num;
		}
		else
		{
			count = 99;
			for(int i=100; i<=num; i++)
			{
				String s = "" + i;
				int h = s.charAt(0) - '0';
				int t = s.charAt(1) - '0';
				int o = s.charAt(2) - '0';
				
				if(t-h == o-t)
				{
					count++;
				}
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}
}

// 브루트 포스 알고리즘 
// 때로는 무식하게 모든 경우를 다 보는것의 알고리즘이 필요하다
// 브루트포스의 기본 문제 
// 1~99 까지는 모두가 한수이기때문이고 
// 100의 자리부터는 등차수열이 제대로 이루어 지는지 확인해야한다. 