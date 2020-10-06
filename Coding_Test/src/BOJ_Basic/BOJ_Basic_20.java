// Date : 2020.10.06
// Title : 베르테랑 공준
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_20
{
	public static boolean isPrime(int n)
	{
		boolean result = true;
		
		if(n==1)
			return false;
		
		for(int i=2; i<=(int)Math.sqrt(n); i++)
		{
			if(n%i==0)
				return false;
		}
		
		
		return result;
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		while(true)
		{
			int s = Integer.parseInt(br.readLine());
			
			if(s==0)
				break;
			
			int end = 2 * s;
			int cnt = 0;
			
			for(int i=s+1; i<=end; i++)
			{
				if(isPrime(i))
					cnt++;
			}
			
			sb.append(cnt+"\n");
			
		}
		
		System.out.println(sb.toString());
	}
}