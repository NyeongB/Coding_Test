// Date : 2020.10.10
// Title : 적록색약
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : BFS

package BOJ_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_BFS_08
{
	
	static int n;
	static char [][] map;
	static int[][] visit;
	
	static int [] dx = {0,0,-1,1};
	static int [] dy = {1,-1,0,0};
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		map = new char[n][n];
		for(int i=0; i<n; i++)
		{
			String [] str = br.readLine().split("");
			
			for(int j=0; j<str.length; j++)
			{
				map[i][j] = str[j].charAt(0);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		visit = new int[n][n];
		int count = 0;
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(visit[i][j]==0)
				{
					bfs_basic(map[i][j], i, j);
					count++;
				}
			}
		}
		
		sb.append(count+" ");
		
		//-----------------적록환자 bfs
		visit = new int[n][n];
		count = 0;
		
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(map[i][j]=='G')
				{
					map[i][j] = 'R';
				}
			}
		}
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(visit[i][j]==0)
				{
					bfs_basic(map[i][j], i, j);
					count++;
				}
			}
		}
		
		sb.append(count);
		System.out.println(sb.toString());
	}
	
	static void bfs_basic(char col,int a, int b)
	{
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(a,b,col));
		visit[a][b] = 1;
		
		while(!q.isEmpty())
		{
			Node temp = q.poll();
			
			for(int i=0; i<4; i++)
			{
				int x = temp.x + dx[i];
				int y = temp.y + dy[i];
				
				if(x>=0&&y>=0&&x<n&&y<n)
				{
					if(map[x][y] == temp.col && visit[x][y] ==0)
					{
						q.add(new Node(x,y,temp.col));
						visit[x][y] = 1;
					}
				}
			}
		}
	}
	
	
	
	static class Node{
		int x, y;
		char col;
		
		Node(int x, int y, char col)
		{
			this.x = x;
			this.y = y;
			this.col = col;
		}
	}
	
}

// class Node를 구현하여 컬러와 좌표를 담았고 BFS를 사용하였다
// 움직일 방향과 색이 같고, 방문하지않았으면 큐에넣고 진행하였다
// 적록색약의 표현은 탐색할 map 자체를 바꿔버린거로 해결하였는데 더 좋은 방법이 있을것같다.