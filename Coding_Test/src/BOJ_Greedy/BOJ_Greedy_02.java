// Date : 2020.08.30
// Title : 전자레인지
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Greedy
 

/*
 * 버튼 A, B, C에 지정된 시간은 각각 5분, 1분, 10초이다.
 * */
package BOJ_Greedy;

import java.util.Scanner;

public class BOJ_Greedy_02
{
	public static void main(String[] args)
	{
		int [] mins = new int[] {300, 60, 10}; // A,B,C 각각 300초, 60초, 10초
		
		Scanner sc= new Scanner(System.in);
		
		int [] answer = new int[3];
		
		int num = sc.nextInt();
		
		
			for(int i=0; i<mins.length; i++) 
			{
				answer[i] += num/mins[i];
				num = num%mins[i];
			}
		
		
		if(num!=0)	// 제시된 3개의 버튼으로 T초를 맞출 수 없으면 음수 -1 출력
			System.out.println(-1);
		else 
		{
		for(int n : answer)
			System.out.print(n+" ");
		}
	}
	
}