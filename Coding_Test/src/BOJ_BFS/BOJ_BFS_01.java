// Date : 2020.09.04
// Title : 연결 요소의 개수
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : BFS

package BOJ_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

// 인접행렬을 그래프로 하였고 BFS로 문제를 해결하였다. 
// DFS로도 풀어본다.

public class BOJ_BFS_01
{

	static int[][] mat; // 인접 행렬
	static boolean visit[]; // 방문 기록 배열
	static int answer = 0; // 연결 요소의 갯수
	static int n, m; // 정점 갯수 n, 간선 갯수 m

	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().split(" ");
		
		n = Integer.parseInt(str[0]);
		m = Integer.parseInt(str[1]);
		
		visit = new boolean[n+1];
		mat = new int[n+1][n+1];
		
		for(int i=1; i<=m; i++)
		{
			str = br.readLine().split(" ");
			int r = Integer.parseInt(str[0]);
			int c = Integer.parseInt(str[1]);
			
			mat[r][c] = mat[c][r] = 1;
			
		}
		
		/*
		 * for(int i=1; i<=n; i++) { for(int j=1; j<=n; j++)
		 * System.out.print(mat[i][j]+" "); System.out.println(); }
		 */
		
		System.out.println(bfs());
		
		
	}
	
	
	
	
	static int bfs() 
	{
		int result =0;
		
		for(int i=1; i<=n; i++)
		{
			LinkedList<Integer> q = new LinkedList<Integer>();
			
			if(visit[i]==false)
			{
				result++;		// 정점 i로 부터 시작한거는 한번만 체크 
				q.offer(i);
			visit[i] = true;
			while(!q.isEmpty())
			{
				int temp = q.poll();
				for(int j=1; j<=n; j++)
				{
					if(visit[j]==false && mat[temp][j]==1)
					{
						visit[j] = true;
						q.offer(j);
					}
				}
			}
			}
		}
		
		
		return result;
	}
}