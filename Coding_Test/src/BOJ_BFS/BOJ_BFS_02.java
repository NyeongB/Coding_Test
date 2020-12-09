// Date : 2020.09.08, 20.12.08
// Title : 섬의 갯수
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : BFS

package BOJ_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class BOJ_BFS_02
{
	static int[] dx = { -1, -1, 0, 1, 1, 1, 0, -1 }; // 12시 부터 시계방향으로
	static int[] dy = { 0, 1, 1, 1, 0, -1, -1, -1 };

	static int [][] map;
	static boolean [][] visited;

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		while(true)
		{
			int N = 0;
			int M = 0;
			int count = 0;
			String [] str = br.readLine().split(" ");
			N = Integer.parseInt(str[0]);
			M = Integer.parseInt(str[1]);
			
			if(N ==0 && M == 0)
				break;
			map = new int[M][N];
			visited = new boolean[M][N];
			
			
			
			for(int i=0; i<M; i++)
			{
				str = br.readLine().split(" ");
				for(int j=0; j<N; j++)
				{
					map[i][j] = Integer.parseInt(str[j]);
				}
			}
			
			
			for(int i=0; i<M; i++)
			{
				for(int j=0; j<N; j++)
				{
					if(map[i][j] == 1 && visited[i][j] == false)
					{
						bfs(i,j);
						count++;
					}
				}
			}
			
			sb.append(count+"\n");
			
		}
		
		
		System.out.println(sb.toString());
		
	}
	
	static void bfs(int a, int b)
	{
		Queue<int []> q = new LinkedList<int []>();
		
		
		q.add(new int[] {a,b});
		visited[a][b] = true;
		
		while(!q.isEmpty())
		{
			int [] temp = q.poll();
			
			
			for(int i=0; i<8; i++)
			{
				int x = dx[i] + temp[0];
				int y = dy[i] + temp[1];
				
				if(x>=0&&y>=0&&x<map.length&&y<map[0].length)
				{
					
				
				
				if(map[x][y] == 1 && !visited[x][y])
				{
					q.add(new int[] {x,y});
					visited[x][y] = true;
				}
				
				}
			}
			
		}
	}

	
	

}

// 교훈 : 입력하는 반복문 고대로 가져다 쓰지 않기.. 오류 찾느라 엄청 오래걸림 
// BFS로 다시 풀어봄