// Date : 2020.08.30, 20.10.09
// Title : 요세푸스 문제
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Queue
 
package BOJ_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_Queue_02
{
	public static void main(String [] agrs) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);
		
		int [] arr = new int[n];
		
		Queue<Integer> q = new LinkedList<>();
		
		for(int i=1; i<=n; i++)
			q.add(i);
		
		int index = 0;
		
		while(!q.isEmpty())
		{
			for(int i=0; i<k-1; i++)
			{
				int temp = q.poll();
				q.add(temp);
			}
			arr[index++] = q.poll();
		}
		
		System.out.print("<"+arr[0]);
		
		for(int i=1; i<n; i++)
		{
			System.out.print(", "+arr[i]);
		}
		
		System.out.print(">");
		
	}
}