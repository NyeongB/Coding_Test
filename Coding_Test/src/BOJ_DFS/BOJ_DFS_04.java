// Date : 2020.09.13 , 20.10.07
// Title : 유기농 배추
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : DFS

package BOJ_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_DFS_04
{
	static int T, N, M, K;	// 테스트 케이스 수, 세로, 가로, 지렁이 수
	
	static int [][] map;
	static int [][] visit;
	
	static int [] dx = new int[] {1,-1,0,0};
	static int [] dy = new int[] {0,0,1,-1};
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		while(T-->0)
		{
			String [] str = br.readLine().split(" ");
			
			M = Integer.parseInt(str[0]);
			N = Integer.parseInt(str[1]);
			K = Integer.parseInt(str[2]);
			
			map = new int[N][M];
			visit = new int[N][M];
			int count = 0;
			
			while(K-- >0)
			{
				str = br.readLine().split(" ");
				int a = Integer.parseInt(str[1]);
				int b = Integer.parseInt(str[0]);
				map[a][b] = 1;
			}
			
			
			for(int i=0; i<N; i++)
			{
				for(int j=0; j<M; j++)
				{
					if(map[i][j]==1 && visit[i][j]==0)
					{
						dfs(i,j);
						count++;
					}
				}
			}
			sb.append(count+"\n");
			
		}
		
		System.out.println(sb.toString());
		
	}
	
	public static void dfs(int a, int b)
	{
		visit[a][b] = 1;
		
		for(int i=0; i<4; i++)
		{
			int x = a + dx[i];
			int y = b + dy[i];
			
			if(x>=0 && y>=0 && x<N && y<M)
			{
				if(visit[x][y]==0 && map[x][y]==1)
				{	
					dfs(x,y);
				
				}
			}
		}
		
	}
	
	
}

// 한번에 성공하고 싶었으나 
// dy 를 복붙하는 과정에서 a + dy[i]가 되어 테스트 케이스 값이 15, 1 나왔다..
