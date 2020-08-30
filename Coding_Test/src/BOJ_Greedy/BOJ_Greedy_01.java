// Date : 2020.08.30
// Title : 동전 0
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Greedy
 
package BOJ_Greedy;

import java.util.Scanner;

public class BOJ_Greedy_01
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		String [] str = sc.nextLine().split(" ");
		
		int num = Integer.parseInt(str[0]);
		int total = Integer.parseInt(str[1]);
		
		int [] coins = new int [num]; 
		
		int answer =0;
		
		for(int i=0; i<num; i++)
		{
			coins[i] = Integer.parseInt(sc.nextLine());
		}
		
		int index = num-1;
		
		while(total>0)
		{
			if(total/coins[index]!=0)
			{
				int temp = total/coins[index];
				
				answer+=temp;
				total = total%coins[index];
			}
			index--;
		}
		System.out.println(answer);
		
		
	}
	
}