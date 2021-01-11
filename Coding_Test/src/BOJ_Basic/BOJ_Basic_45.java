// Date : 2020.11.11
// Title : 수 이어 쓰기 1
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_45
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int len = str.length();
		
		int num = Integer.parseInt(str);
		
		int temp = 9;
		
		int result = 0;
		
		for(int i=1; i<len; i++)
		{
			result += i * temp;
			temp *=10;
		}
		
		result += (num - (int)(Math.pow(10, len-1)) + 1) * len;
		
		System.out.println(result);
	}
}