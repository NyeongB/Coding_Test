// Date : 2020.10.27, 20.12.23
// Title : 로또
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Backtracking
package BOJ_Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Backtracking_04
{
	
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		
		while(true)
		{
			String [] str = br.readLine().split(" ");
			
			int n = Integer.parseInt(str[0]);
			
			if(n == 0)
				break;
			

			int [] result = new int[6];
			int [] arr = new int[n];
			boolean [] visited = new boolean[n];
			
			for(int i=1; i<n+1; i++)
			{
				arr[i-1] = Integer.parseInt(str[i]);
			}
			
			
			
			
			dfs(0,0, result, arr, visited, sb);
			
			sb.append("\n");
			
			
		}
		
		
		
		System.out.println(sb.toString());
	}
	
	public static void dfs(int index, int depth, int [] result, int [] arr, boolean [] visited, StringBuilder sb)
	{
		if(depth == 6)
		{
			for(int i=0; i<6; i++)
			{
				sb.append(result[i]+" ");
			}
			sb.append("\n");
			return;
		}
		
		
		for(int i = index; i<arr.length; i++)
		{
			if(!visited[i])
			{
				visited[i] = true;
				result[depth] = arr[i];
				dfs(i,depth + 1, result, arr, visited,sb);
				
				visited[i] = false;
			}
		}
		
		
		
	}
}

// 조합느낌으로 접근했다.
// 2달만에 다시 풀어봤는데 디버깅이 쉽지않았다.