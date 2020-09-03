// Date : 2020.09.03
// Title : 설탕 배달
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Greedy
 
package BOJ_Greedy;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_Greedy_05
{
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
	
}