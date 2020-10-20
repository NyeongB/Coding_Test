// Date : 2020.10.20
// Title : 달팽이는 올라가고 싶다
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_22
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str = br.readLine().split(" ");
		
		int A = Integer.parseInt(str[0]);
		int B = Integer.parseInt(str[1]);
		int V = Integer.parseInt(str[2]);
		
		int total = 0;
		int count = 0;
		
		// 처음 짯던 코드
		/*
		while(true)
		{
			total += A;
			if(V <= total)
			{
				System.out.println(count + 1);
				
				return;
			}
			
			total -= B;
			count++;
			
		}
		*/
		
		int day = (V - B) / (A - B);
		
		if((V - B) % (A - B) !=0)
		{
			day++;
		}
		System.out.println(day);
		
		
		
	}
}

// 시간제한을 명시하길래 함정이 있을줄알았는데
// 역시나 함정이였다
// 수학적인 코드로 접근하는법을 공부하였다..