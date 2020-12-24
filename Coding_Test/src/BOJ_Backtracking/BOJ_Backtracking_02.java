// Date : 2020.10.05, 20.12.24
// Title : N과 M(1)
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Backtracking
package BOJ_Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Backtracking_02
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N, M;
		
		String [] str = br.readLine().split(" ");
		
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		
		int [] arr = new int[N];	// 1,2,3..
		
		for(int i=0; i<N; i++)
			arr[i] = i+1;
		
		int [] result = new int[M];	// 결과
		StringBuilder sb = new StringBuilder(); // 결과 출력용
		boolean [] visited = new boolean[N];	// 방문기록 
		
		permutation(0, arr, result, sb, visited, N, M);
		
		System.out.println(sb.toString());
	}
	
	public static void permutation(int depth, int [] arr, int [] result, StringBuilder sb, boolean[] visited, int N, int M)
	{
		if(M == depth)
		{
			for(int i=0; i<M; i++)
			{
				sb.append(result[i]+" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=0; i<N; i++)
		{
			if(!visited[i])
			{
				visited[i] = true;	// 방문기록 
				
				result[depth] = arr[i];	// 현재 뎊스에 넣기
				
				permutation(depth + 1, arr, result, sb, visited, N, M);	// 뎊스 올리고 재귀
				
				visited[i] = false;	// 방문기록 해제
			}
		}
	}
	
}
// nPr의 순열 문제이다