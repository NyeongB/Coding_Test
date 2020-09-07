// Date : 2020.09.07
// Title : RGB 거리
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Dynamic Programming
 
package BOJ_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_DP_02
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int [][] arr = new int[3][n+1];
		
		for(int i=0; i<n; i++)
		{
			String [] str = br.readLine().split(" ");
			
			int r = Integer.parseInt(str[0]);
			int g = Integer.parseInt(str[1]);
			int b = Integer.parseInt(str[2]);
			
			arr[0][i+1] = Math.min(arr[1][i], arr[2][i]) + r;
			arr[1][i+1] = Math.min(arr[0][i], arr[2][i]) + g;
			arr[2][i+1] = Math.min(arr[0][i], arr[1][i]) + b;
			
			
			
		}
		
		System.out.println(Math.min(arr[0][n], Math.min(arr[1][n], arr[2][n])));
	}
	
}