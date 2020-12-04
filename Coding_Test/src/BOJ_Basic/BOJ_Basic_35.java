// Date : 2020.12.04
// Title : 윤년
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_35
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int year = Integer.parseInt(br.readLine());
		
		if((year%4==0&&year%100!=0) || year % 400 == 0)		// 4의 배수이지만 100의 배수는 아니고 400의 배수인수가 윤년
			System.out.println(1);
		else
			System.out.println(0);
		
	}
}