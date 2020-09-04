// Date : 2020.09.04
// Title : DFS와 BFS
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : DFS

package BOJ_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class BOJ_DFS_01
{
	
	// 모든 메소드에서 사용하기 위해서 전역으로 설정한다.
	static boolean [] visit; // 방문 기록 
	static int [][] mat; // 인접행렬
	static int N,M,V; //정점의 개수 N, 간선의 개수 M, 탐색을 시작할 정점의 번호 V
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String [] str = br.readLine().split(" ");
		
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		V = Integer.parseInt(str[2]);
		
		mat = new int [N+1][N+1];	// 행과 열의 인덱스를 1부터 시작하기위해 기존 크기보다 +1 크기로 만듬 , 전부 0으로 초기화됨 
		visit = new boolean[N+1]; // 전역으로 했으니 전부 false 로 초기화됨 
		
		
		for(int i=1; i<=M; i++) // 간선의 수만큼 입력받음 
		{
			str = br.readLine().split(" ");
			int r = Integer.parseInt(str[0]);
			int c = Integer.parseInt(str[1]);
			mat[r][c] = mat[c][r] =1;		// 인접 행렬이므로 2,1 1,2.. 등등 이 같이 1로 초기화
		}
		
		/* 확인
 		 * for(int i=1; i<=N; i++) { for(int j=1; j<=N; j++) {
		 * System.out.print(mat[i][j] + " "); } System.out.println(); }
		 */
		
		dfs(V);
		
		for(int i=1; i<=N; i++)	// dfs에서 사용한 visit 배열 초기화 
			visit[i] = false;
		
		System.out.println();
		
		bfs(V);
		
		
		
	}
	
	static void dfs(int v)
	{
		System.out.print(v+" ");	
		visit[v] = true; 		// 매개변수로 들어온 값 찍고, 방문기록 
		
		for(int i=1; i<=N; i++)	 // 현재 정점을 부터 뻗어난 정점 오름 차순으로 체크
		{
			if(mat[v][i]==1&&visit[i]==false) // 간선이 존재하고 방문하지 않았으면 재귀
				dfs(i);
		}
		
	}
	
	static void bfs(int v)
	{
		LinkedList<Integer> q = new LinkedList<Integer>();	// 큐로 사용할 링크트 리스트 선언
		q.offer(v);	// 현재 값넣고
		System.out.print(q.peek()+" "); // 들어있는 값 찍은다음
		visit[v] = true;	// 방문기록 
		while(!q.isEmpty())	// 큐에 아무것도 없을떄까지 돌린다.
		{
			int temp = q.poll();		// 가장앞에있는 갚 추출후 그 정점으로 부터 뻗어진 간선 체크 
			for(int i=1; i<=N; i++)
			{
				if(mat[temp][i]==1 && visit[i]==false)
				{
					q.offer(i);		// 방문후에 큐에 넣어놓고 계속 돌림 
					System.out.print(i+" ");
					visit[i] = true;
				}
			}
		}
	}
}