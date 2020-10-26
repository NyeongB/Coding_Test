// Date : 2020.10.26
// Title : 마인크래프트
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Bruteforcing

package BOJ_Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Bruteforcing_07
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().split(" ");
		
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		int B = Integer.parseInt(str[2]);
		
		int[][] arr = new int[501][501];
		
		int max=-1;
	    int min=501;
	    int minTime = 99999999;
	    int block_height = 99999999;
		
		for(int i=0; i<N; i++)
		{
			str = br.readLine().split(" ");
			for(int j=0; j<M; j++)
			{
				arr[i][j] = Integer.parseInt(str[j]);
				min = Math.min(arr[i][j], min);
				max = Math.max(arr[i][j], max);
			}
		}
		
		
		for(int i=min; i<=max; i++)
		{
			
			int time = 0;
			int block = B;
			
			for(int j=0; j<N; j++)
			{
				for(int k=0; k<M; k++)
				{
					int height = arr[j][k] - i;
					
					if(height>0)	 
					{
						time = time + height * 2;
	                    block = block + height;
					}
					else if(height<0) 
					{
						 time = time - height;
		                    block = block + height;
					}
				}
			}
			
			if(block>=0)
			{
				if(minTime> time)
				{
					minTime = time;
		                block_height = i;
				}
			}
			
		}
		
		System.out.println(minTime + " " + block_height);
		
		
		
	}
}