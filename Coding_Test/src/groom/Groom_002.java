package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Groom_002
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		char [][] arr = new char[n][m];
		int flag = 0;
		
		for(int i=0; i<n; i++)
		{
			if(i%2==0)
			{
				for(int j=0; j<m; j++)
				{
				arr[i][j] = '#';
				}
			}
			else
			{
				if(flag==0)
				{
					for(int j=0; j<m-1; j++)
					{
						arr[i][j] = '.';
					}
					arr[i][m-1] = '#';
					flag = 1;
				}
				else if(flag==1)
				{
					for(int j=1; j<m; j++)
					{
						arr[i][j] = '.';
					}
					arr[i][0] = '#';
					flag = 0;
				}
			}
		
		}
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
				System.out.print(arr[i][j]);
			System.out.println();
		}
		
		
	}
}
