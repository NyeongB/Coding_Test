// Date : 2020.10.09
// Title : 섬의 갯수
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : DFS

package BOJ_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_DFS_07
{
	static int N, M;
	static int [][] map;
	static int [][] visit;
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true)
		{
			String [] str = br.readLine().split(" ");
			
			N = Integer.parseInt(str[1]);
			M = Integer.parseInt(str[0]);
			
			if(N == 0 || M == 0)
				break;
			
			map = new int[N][M];
			visit = new int[N][M];
			int count = 0;
			
			// 초기화
			for(int i=0; i<N; i++)
			{
				str = br.readLine().split(" ");
				for(int j=0; j<str.length; j++)
				{
					map[i][j] = Integer.parseInt(str[j]);
				}
			}
			
			// 탐색
			for(int i=0; i<N; i++)
			{
				for(int j=0; j<M; j++)
				{
					if(visit[i][j]==0 && map[i][j] == 1)
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
	
	static void dfs(int a, int b)
	{
		visit[a][b] = 1;
		
		for(int i=0; i<8; i++)
		{
			int x = a + dx[i];
			int y = b + dy[i];
			if(x>=0 && y>=0 &&x<N && y<M)
			{
				if(map[x][y]==1 && visit[x][y]==0)
				{
					dfs(x,y);
				}
			}
		}
	}
	
	static int [] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
	static int [] dy = {0, 1, 1, 1, 0, -1, -1 ,-1};
}