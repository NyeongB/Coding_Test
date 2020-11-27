// Date : 2020.11.27
// Title : 달팽이
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_32
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int search = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][n];
		
		int flag = 1;
		
		int row = -1;
		int col = 0;
		
		int total = n;
		int num = n*n;
		int x = 0;
		int y = 0;
		
		while(total>0)
		{
			for(int i=0; i<total; i++)
			{
				row += flag;
				if(search == num)
				{
					x = row + 1;
					y = col + 1;
				}
				arr[row][col] = num--;
			}
			total--;
			if(total<1)
				break;
			for(int i=0; i<total; i++)
			{
				col += flag;
				if(search == num)
				{
					x = row + 1;
					y = col + 1;
				}
				arr[row][col] = num--;
			}
			flag *= -1;
		}
		
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
				System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
		System.out.println(x+" "+y);
		
	}
}

// https://codepractice.tistory.com/81 풀이법 참고
// 기본 풀이법인데 시간이 많이 걸린다.. 4000ms 넘..
// 속도를 줄이는 방법을 찾아본다.