// Date : 2020.09.30
// Title : 직사각형에서 탈출
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.util.Scanner;

public class BOJ_Basic_17
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String [] str = sc.nextLine().split(" ");
		
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);
		int w = Integer.parseInt(str[2]);
		int h = Integer.parseInt(str[3]);
		
		// 거리를 탈출할 최솟값은 x, y, w-x, h-y 이중 최소값인것
		// 간단하니 반복문은 사용안함
		
		int min = x;
		
		if(min>y)
			min = y;
		
		if(min>w-x)
			min = w - x;
		
		if(min>h-y)
			min = h - y;
		
		System.out.println(min);
		
		sc.close();
				
	}
}