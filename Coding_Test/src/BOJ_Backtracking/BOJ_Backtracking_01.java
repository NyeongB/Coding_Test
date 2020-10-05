// Date : 2020.10.05
// Title : 모든 순열
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Backtracking
package BOJ_Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Backtracking_01
{
	static int [] arr;
	static int [] output;
	static int [] visit;
	static int n,r;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = r = Integer.parseInt(br.readLine());
		arr = new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i] = i + 1;
		}
		
		output = new int[n];
		visit = new int[n];
		
		perm(0);
	}
	
	static void perm(int depth)
	{
		if(depth == r)
		{
			for(int i=0; i<n; i++)
			{
				System.out.print(output[i]+" ");
			}
			System.out.println();
			return;
		}
		
		
		for(int i=0; i<n; i++)
		{
			if(visit[i] == 0)
			{
				visit[i] = 1;
				output[depth] = arr[i];
				perm(depth + 1);
				visit[i] = 0;
			}
		}
		
	}
}
