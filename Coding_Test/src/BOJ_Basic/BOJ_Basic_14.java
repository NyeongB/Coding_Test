// Date : 2020.09.26
// Title : 완전수
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_14
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		String [] str = br.readLine().split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<num; i++)
		{
			String result = check(str[i]);
			
			sb.append(result).append("\n");
			
		}
		
		System.out.println(sb.toString());
	}
	
	public static String check(String str)
	{
		String result ="";
		
		int num = Integer.parseInt(str);
		
		int sum = 0;
		
		for(int i=1; i<=num/2; i++)
		{
			if(num%i==0)
			{
				sum += i;
			}
		}
		
		if(sum==num)
			result = "Perfect";
		else if(sum<num)
			result = "Deficient";
		else if(sum>num)
			result = "Abundant";
		
		return result;
	}
}

// 자신을 제외한 모든 약수는 자신/2 까지만 검사해도 나오게되는걸 이용해 메소드를 구성했다.