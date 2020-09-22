// Date : 2020.09.22
// Title : 설탕 배달
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Greedy
 
package BOJ_Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Greedy_05
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n%5==0)
		{
			System.out.println(n/5);
			return;
		}
		else
		{
			int temp = n / 5;
			for(int i=temp; i>0; i--)
			{
				if((n - 5*i)%3 ==0)
				{
					System.out.println(i+(n - 5*i)/3);
					return;
				}
			}
		}
		
		if(n%3==0)
		{
			System.out.println(n/3);
		}
		else
			System.out.println(-1);
		
	}
	
}
// 그리디 기본 문제
// 중요한것은 가장큰 5로 나눈것, 5와 3을 섞는것중에서 5가 가장 많이 있는 케이스부터 보는것, 나머진 3으로만 이루어진것이며
// 또 그나머지는 구할수없는 값으로 인지하는것이 가장 중요하다.

/*
public static void main(String[] args) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		if(num%5==0)
		{
			System.out.println(num/5);
			return;
		}
		else
		{
			int temp = num/5;
			for(int i=temp; i>0; i--)	// 탐욕적으로 5kg 설탕이 많이 있는 경우부터 적은순으로 가정 
			{
				if((num- 5*i)%3==0)
				{
					System.out.println(i+((num- 5*i)/3));
					return;
				}
			}
		}
		
		// 5키로,3키로 설탕을 섞은거로도 안되면 3키로 설탕으로 만 판단 
		
		if(num%3==0)
			System.out.println(num/3);
		else
			System.out.println(-1);
		
		
		
	}
*/
