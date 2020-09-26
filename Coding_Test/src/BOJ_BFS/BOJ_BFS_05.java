// Date : 2020.09.26
// Title : 미로 탐색
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : BFS

package BOJ_BFS;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class BOJ_BFS_05
{
	
	static int [] dx = {1,-1,0,0};
	static int [] dy = {0,0,1,-1};
	static int [][] map;
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		
		map = new int[n+1][m+1];
		
		for(int i=1; i<=n; i++)
		{
			str = br.readLine().split("");
			for(int j=1; j<=m; j++)
			{
				map[i][j] = Integer.parseInt(str[j-1]);
			}
		}
		
		
		
		bfs(1,1);
		
		
		System.out.println(map[n][m]);
	}
	
	public static void bfs(int a, int b)
	{
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(a,b));
		
		while(!q.isEmpty())
		{
			Point temp = q.poll();
			
			
			for(int i=0; i<4; i++)
			{
				int x = temp.x + dx[i];
				int y = temp.y + dy[i];
				
				if(x>=1&&y>=1&&x<map.length&&map[0].length>y)
				{
					if(map[x][y]==1)
					{
						map[x][y] = map[temp.x][temp.y] +1;
						q.add(new Point(x,y));
					}
				}
			}
			
			
		}
	}
	
	
}
/*
BFS로 푼 최단경로 문제
누적합으로 문제를 해결하였다
누적합으로 하니 이미 방문한 좌표는 1이 아니기때문에
따로 방문 기록을 하지않아도 문제 해결이 가능하다.
awt패키지의 Point 클래스를 사용하여 좌표를 담아보았다.
*/