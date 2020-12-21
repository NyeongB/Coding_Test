// Date : 2020.12.11
// Title : 플러그
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_39
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int total = Integer.parseInt(br.readLine());
		
		int sum = 1 - total;	// 겹치는 부분을 미리 빼줌
		
		while(total-->0)
		{
			sum += Integer.parseInt(br.readLine());
		}
		
		if(sum>1000)
			System.out.println(1000);
		else
			System.out.println(sum);
	}
}