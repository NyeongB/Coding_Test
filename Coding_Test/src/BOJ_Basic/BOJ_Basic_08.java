// Date : 2020.09.15
// Title : 소인수 분해
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.util.Scanner;

public class BOJ_Basic_08
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		StringBuffer sb = new StringBuffer();
		
		int i=1;
		while(num!=1)
		{
			i++;
			
			if(num%i==0)
			{
				sb.append(i+"\n");
				num /=i;
				i=1;
			}
			
		}
		
		System.out.println(sb.toString());
		
		sc.close();
		
	}
}

// 기본을 다지는것 또한 중요하다
// 갑자기 풀라면 한번에 논리 정연하게 코드를 구상하는 코드가 많이 없는것같다.
// 거창한 알고리즘 문제 뿐만아니라 기본 문제도 꾸준히 푼다.. 