// Date : 2020.09.06
// Title : 어두운 건 무서워
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_05
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str = br.readLine().split(" ");
		
		StringBuffer sb = new StringBuffer();
		
		int row, col, n;
		
		row = Integer.parseInt(str[0]);
		col = Integer.parseInt(str[1]);
		n = Integer.parseInt(str[2]);
		
		int [][] arr = new int[row][col];
		
		for(int i=0; i<row; i++)
		{
			str = br.readLine().split(" ");
			
			for(int j=0; j<col; j++)
			{
				arr[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		/*
		 * for(int i=0; i<row; i++) {
		 * 
		 * for(int j=0; j<col; j++) { System.out.print(arr[i][j]+" "); }
		 * System.out.println(); }
		 */
		
		int r1,c1,r2,c2;
		int sum = 0;
		for(int i=0; i<n; i++)
		{
			sum = 0;
			int count = 0;
			str = br.readLine().split(" ");
			r1 = Integer.parseInt(str[0])-1;
			c1 = Integer.parseInt(str[1])-1;
			r2 = Integer.parseInt(str[2])-1;
			c2 = Integer.parseInt(str[3])-1;
			
			//System.out.println(r1+" "+c1+" "+r2+" "+c2);
			for(int j=r1; j<=r2; j++ )
			{
				for(int k=c1; k<=c2; k++)
				{
					sum += arr[j][k];
					count++;
				}
			}
			
			sb.append(sum/count+"\n");
		}
		
		System.out.println(sb.toString());
		
	}
}