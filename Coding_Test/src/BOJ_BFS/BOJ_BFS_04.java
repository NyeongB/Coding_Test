// Date : 2020.09.24
// Title : 현수막
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : BFS

package BOJ_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_BFS_04
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		int [] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
		int [] dy = {-1, 0, 1, 1, 1, 0, -1, -1};
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		int count = 0;
		
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int [][] map = new int[x][y];
		int [][] visit = new int[x][y];
		
		for(int i=0; i<x; i++)
		{
			str = br.readLine();
			st = new StringTokenizer(str," ");
			for(int j=0; j<y; j++)
			{
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		for(int i=0; i<x; i++)
		{
			for(int j=0; j<y; j++)
			{
				if(map[i][j]==1 && visit[i][j] ==0)
				{
					count++;
					bfs(map,visit,dx,dy,i,j);
				}
			}
		}
		
		System.out.println(count);
		
	}
	
	public static void bfs(int [][] map, int [][] visit, int [] dx, int [] dy,int i, int j)
	{
		visit[i][j] = 1;
		Queue<XY> q = new LinkedList<XY>();
		
		q.offer(new XY(i,j));
		
		while(!q.isEmpty())
		{
			XY temp = q.poll();
			for(int k=0; k<8; k++)
			{
				int x = temp.x + dx[k];
				int y = temp.y + dy[k];
				
				if(x>=0 && y>=0 && x<map.length && y<map[0].length)
				{
					if(map[x][y]==1 && visit[x][y]==0)
					{
						visit[x][y]=1;
						q.add(new XY(x,y));
					}
				}
			}
			
		}
	}
	
	static class XY
	{
		int x;
		int y;
		
		public XY(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
	}

	
}


// 기본 BFS 문제 8방향으로 이동범위를 체크해주는게 관건이다.