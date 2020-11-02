// Date : 2020.10.09, 2020.11.02
// Title : 별찍기 10
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Recursion

package BOJ_Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_Recursion_01
{
	static char [][] map;
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		sc.close();
		
		map = new char[n][n];
		
		for(int i=0;i<map.length;i++) {
			Arrays.fill(map[i],' ');
		}
		
		solve(n,0,0);
		
		for(int i=0;i<map.length;i++) {
			System.out.println(map[i]);
		}
	}
	
	static void solve(int n, int x, int y)
	{
		if(n == 1)
		{
			map[x][y] = '*';
			return;
		}
		
		int div = n / 3;
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				if(i == 1 && j == 1)
					continue;
				
				solve(div, (i*div) + x, (j*div) + y);
			}
		}
		
	}
}
// 분할정복, 재귀의 좋은 연습문제인것같다.
// 반복해서 익숙해지자