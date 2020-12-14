// Date : 2020.12.14
// Title : 색종이
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_41
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		
		int [][] map = new int[100][100];
		
		while(num-->0)
		{
			String [] str = br.readLine().split(" ");
			
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			
			for(int i=a; i<a+10; i++)
			{
				for(int j=b; j<b+10; j++)
				{
					map[i][j] = 1;
				}
			}
		}
		
		
		// 전체를 돌면서 전부 더함 1인곳이 넓이임 
		
		int sum = 0;
		
		for(int i=0; i<map.length; i++)
		{
			for(int j=0; j<map[0].length; j++)
			{
				sum += map[i][j];
				//System.out.print(map[i][j]+" ");
			}
			//System.out.println();
		}
		
		System.out.println(sum);
		
	}
}

// 겹친 부분을 빼야되나 하다가
// 100까지기에 시간 초과 안날것같아서 배열로 접근해봄