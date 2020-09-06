// Date : 2020.09.06
// Title : 제로
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Stack
 
package BOJ_Stack;

import java.util.Scanner;
import java.util.Stack;

public class BOJ_Stack_04
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		Stack<Integer> st = new Stack<>();
		
		for(int i=0; i<n; i++)
		{
			int temp = sc.nextInt();
			if(temp==0)
				st.pop();
			else
				st.push(temp);
			
		}
		
		int sum = 0;
		
		for(int num : st)
			sum += num;
		
		System.out.println(sum);
	}
	
}