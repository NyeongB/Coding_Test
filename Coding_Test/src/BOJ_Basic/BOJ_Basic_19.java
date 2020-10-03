// Date : 2020.10.03
// Title : 분수
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_19
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		int i = 0;
		int n = Integer.parseInt(br.readLine());
		
		while(i + sum < n)	 // i 의 라인을 파악
		{
			sum += i++;
		}
		
		int a;
		int b;
		if(i%2==0)
		{
			a = n - sum;
		}
		else
		{
			a = i + 1 - (n - sum);
		}
		b = i + 1 - a;
		
		System.out.println(a+"/"+b);
		
	}
}

// 규칙을 찾는것이 중요하다.
// 짝수 홀수 규칙을 찾았는데 분수 표현식이 힘들어 블로그를 참고하였다.