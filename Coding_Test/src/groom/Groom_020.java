package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Groom_020
{
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long num = Long.parseLong(br.readLine());
		long result = 0;
		
		for(long i=1; i<=num; i++)
		{
			result += i*i;
		}
		
		System.out.print(result);
	}
}
// 규칙만 찾으면 되는 간단한 문제지만
// N의 값이 1,000,000까지 이므로 long으로 처리하였다