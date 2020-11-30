// Date : 2020.11.30
// Title : 팩토리얼 0의 개수
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_33
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int answer = 0;
		
		
		for(int i= 5; i<=n; i *=5)
		{
			answer += n / i;
		}
		
		System.out.println(answer);
		
		
		
	}
}

// 팩토리얼을 구하고 %10 해가면서 0이 아니면 브레이크 하는식으로 접근했는데
// 시간초과나고 절대 구할수없다 26부터 long범위을 넘어간다.
// 그래서 보고 하니깐 5의 갯수를 구하는거란다..