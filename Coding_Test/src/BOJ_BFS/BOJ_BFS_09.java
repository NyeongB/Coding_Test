// Date : 2020.10.16
// Title : 연구소
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

public class BOJ_BFS_09
{
	
	static int [][] map;
	static int [][] visit;
	static int N, M;
	static int [] dx = {1,-1,0,0};
	static int [] dy = {0,0,1,-1};
	static int max = 0;
	
	static int [][] mapCopy;
	static int [][] visitCopy;
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().split(" ");
		
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		
		map = new int[N][M];
		visit = new int[N][M];
		mapCopy = new int[N][M];
		visitCopy = new int[N][M];
		
		for(int i=0; i<N; i++)
		{
			str = br.readLine().split(" ");
			
			for(int j=0; j<str.length; j++)
			{
				map[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		
		
		
		recursion(0);
		System.out.println(max);
		
	}
	
	public static void recursion(int count)
	{
		if(count==3)
		{
			// 벽을 세개 놓았을때 bfs 시작
			// bfs가 바이러스상태로 바꾸니깐 복사해서 진행함.
			for(int i=0; i<N; i++)
			{
				
				for(int j=0; j<M; j++)
				{
					mapCopy[i][j] = map[i][j];
					visitCopy[i][j] = visit[i][j];
				}
			}
			
			bfs();
			return;
		}
		
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<M; j++)
			{
				if(visit[i][j]==0 && map[i][j]==0)
				{
					visit[i][j] = 1;
					map[i][j] = 1;
					recursion(count + 1);
					visit[i][j] = 0;	// 다시 되돌리기
					map[i][j] = 0;
				}
			}
		}
	}
	
	
	public static void bfs()
	{
		Queue<Point> q = new LinkedList<Point>();
		
		// 전체를 돌면서 2가 있나 확인
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<M; j++)
			{
				if(mapCopy[i][j]==2)
				{
					q.add(new Point(i,j));
				}
			}
		}
		
		while(!q.isEmpty())
		{
			Point temp = q.poll();
			
			for(int i=0; i<4; i++)
			{
				int nx = temp.x + dx[i];
				int ny = temp.y + dy[i];
				
				if(nx>=0&&ny>=0&&nx<N&&ny<M)
				{
					if(mapCopy[nx][ny]==0 && visitCopy[nx][ny]==0)
					{
						mapCopy[nx][ny] = 2;
						visitCopy[nx][ny] = 1;
						q.add(new Point(nx,ny));
					}
				}
			}
		}
		
		// 다 돌린후 안전영역의 갯수 체크
		int cnt = 0;
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<M; j++)
			{
				if(mapCopy[i][j]==0)
				{
					cnt++;
				
				}
			}
		}
		
		max = Math.max(cnt, max);
		
	}
}

// 우선 막힘없이 술술 풀리는데 
// 1 1 1 을 세개 넣은 상태로 bfs 돌리기전에 map 자체를 복사해 두는 경우 처음엔 mapCopy = map 으로 진행하였는데
// 이렇게 진행할경우 주소값자체가 복사되는 것이여서 하나하나 일일이 값을 대입해주는 쪽으로 방향을 바꿔보았다
// 그결과 바로 문제 해결