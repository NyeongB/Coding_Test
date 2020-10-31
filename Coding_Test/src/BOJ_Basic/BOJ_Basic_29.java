// Date : 2020.10.31
// Title : 평균
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_29
{
	public static void main(String[] args) throws IOException
	{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		int [] arr = new int[n];
		String [] str = br.readLine().split(" ");
		
		
		int max = Integer.parseInt(str[0]);
		
		for(int i=0; i<n; i++)
		{
			arr[i] = Integer.parseInt(str[i]);
			
			if(max<arr[i])
				max = arr[i];
			
		}
		
		double total = 0;
		
		for(int i=0; i<n; i++)
		{
			//System.out.println(arr[i]+" "+max);
			total += ((arr[i] / (double)max)*100);
		}
		
		System.out.printf("%.2f",total/n);
		
		
		
	}
}

