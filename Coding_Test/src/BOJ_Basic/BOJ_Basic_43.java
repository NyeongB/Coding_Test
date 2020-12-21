// Date : 2020.12.20
// Title : 합
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_43
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		System.out.println(num * (num+1) / 2);

	}
}
// 처음에 반복문으로 돌릴까 했는데 
// 시그마 합 공식으로 접근하는게 제일 빠른것 같다.