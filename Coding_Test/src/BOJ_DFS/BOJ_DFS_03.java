// Date : 2020.09.04
// Title : 바이러스
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : DFS

package BOJ_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 인접행렬을 그래프로 하였고 DFS로 문제를 해결 하였다.

public class BOJ_DFS_03
{

	static int[][] mat; // 인접 행렬
	static boolean visit[]; // 방문 기록 배열
	static int answer = 0; // 연결 요소의 갯수
	static int n, m; // 정점 갯수 n, 간선 갯수 m

	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		

		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		
		int answer = 0;
		visit = new boolean[n + 1];
		mat = new int[n + 1][n + 1];

		String[] str;
		for (int i = 1; i <= m; i++)
		{
			str = br.readLine().split(" ");
			int r = Integer.parseInt(str[0]);
			int c = Integer.parseInt(str[1]);

			mat[r][c] = mat[c][r] = 1;

		}

		dfs(1);	// 정점 1로 부터 방문할수있는 간선을 탐색한다.
		
		for(int i=2; i<=n; i++)		// 1과 연결된 정점들만 방문처리되므로 1을 제외한 나머지 정점중에서 방문된것의 카운트만 증가시킨다.
		{
			if(visit[i])
				answer++;
		}
		
		System.out.println(answer);

	}

	static public void dfs(int v)
	{
		visit[v] = true; // 방문 기록

		for (int i = 1; i <= n; i++)
		{
			if (mat[v][i] == 1 && visit[i] == false) // 인접한 노드와 간선이 연결되있는지 확인과 방문을 안했다면 재귀 
				dfs(i);
		}

	}

}