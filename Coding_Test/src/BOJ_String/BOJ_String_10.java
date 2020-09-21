// Date : 2020.09.21
// Title : 팰린드롬수
// Author : Choi Cheol Nyeong
// Language : Java
// classification : String

package BOJ_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_String_10
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		while (true)
		{
			String str = br.readLine();

			boolean flag = false;

			if (str.equals("0"))
				break;

			int len = str.length();

			for (int i = 0; i < len / 2; i++)
			{
				if (str.charAt(i) != str.charAt(len - 1 - i))
				{
					flag = true;
					break;
				}

			}
			
			if (flag)
			{
				sb.append("no\n");
			} 
			else
			{
				sb.append("yes\n");
			}
		}

		System.out.println(sb.toString());
	}

}
// 간단한 회문 문제
// 짝수일때만 전부를 확인하고 
// 홀수일떄는 맨 가운데 숫자는 구분할필요가 없기때문에
// n/2 만큼 반복한다.