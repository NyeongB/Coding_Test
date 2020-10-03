// Date : 2020.10.03
// Title : 나누기
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_18
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		int N = Integer.parseInt(br.readLine());
		int F = Integer.parseInt(br.readLine());
		
		while(true)
		{
			String num = "" + N;
			
			
			for(int i=0; i<=99; i++)	// 00~99까지 나눠본다.
			{
				String temp = num.substring(0,num.length()-2);	// 맨뒤에 두자리를 제외한 나머지 숫자
				
				if(i<10)	
				{
					temp +=0;
				}
				
				temp += i;
				
				if(Integer.parseInt(temp)%F==0)	// 맨 뒷자리를 붙이고 나누기를 해본다. 나눠진다면 맨뒤 뒷자리를 출력
				{
					System.out.println(temp.substring(temp.length()-2,temp.length()));
					return;
				}
			}
		}
		
	}
}

// 완전탐색으로 접근했다 00 ~ 99 사이에 나눠지는게 있으면 정답으로 출력한다. 
// 문제에서 가장 작은 값이라 했음으로 00 부터 탐색한다.