// Date : 2020.10.22
// Title : 이항 계수
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_27
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str = br.readLine().split(" ");
		
		int N = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);
		
		int result = facto(N) / (facto(N-K)*facto(K));
		
		System.out.println(result);
		
	}
	
	public static int facto(int n)
	{
		if(n==1 || n==0)
			return 1;
		
		return n * facto(n-1);
	}
}

// 최대가 팩토리얼 10까지라 시간초과 안날걸알고 재귀로 구현하였다
// 하지만 문제에서 K 가 0일때도 포함한것을 못보고 예외안했다 한번 틀렸다..