// Date : 2020.10.09
// Title : 별찍기 10
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Recursion

package BOJ_Recursion;

import java.util.Scanner;

public class BOJ_Recursion_01
{
	static char [][] map = new char[6561][6561];
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		solve(n,0,0);
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
	
	static void solve(int n, int x, int y)
	{
		if(n==1)
		{
			map[x][y] = '*';
			return;
		}
		
		int div = n / 3;
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(j==1&&i==1)
					continue;
				
				solve(div, x + (div*i), y + (div*j));
			}
		}
		
		
	}
}
// 분할정복, 재귀의 좋은 연습문제인것같다.
// 반복해서 익숙해지자