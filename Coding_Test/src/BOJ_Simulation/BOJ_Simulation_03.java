// Date : 2020.10.22
// Title : ACM 호텔
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Simulation
 
package BOJ_Simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Simulation_03
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		while(num-->0)
		{
			String [] str = br.readLine().split(" ");
			int h = Integer.parseInt(str[0]);
			int w = Integer.parseInt(str[1]);
			int n = Integer.parseInt(str[2]);
			
			
			
			if(n % h == 0)	// 꼭대기 층이면
			{
				int x = n / h;
				int y = h;
				sb.append(y+""+x/10+x%10+"\n");
			}
			else
			{
				int x = n / h;
				int y = n - h * x;
				sb.append(y+""+(x+1)/10+(x+1)%10+"\n");
			}
			
			
		}
		
		System.out.println(sb.toString());
	}
	
}

