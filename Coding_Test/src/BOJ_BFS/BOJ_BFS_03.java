// Date : 2020.09.20
// Title : DFS와 BFS
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

public class BOJ_BFS_03
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n,m,v;	// 정점, 간선, 시작점
		
		StringTokenizer st;
		
		String str = br.readLine();
		
		st = new StringTokenizer(str," ");
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		
		int [][] map = new int [n+1][n+1];
		int [] visit = new int [n+1];
		
		int x,y;
		
		while(m-- > 0)
		{
			str = br.readLine();
			st = new StringTokenizer(str," ");
			
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			map[x][y] = map[y][x] = 1;
			
		}
		
		
		dfs(v,n,map,visit);
		
		visit = new int [n+1];
		System.out.println();
		bfs(v,n,map,visit);
		
		
		
	}
	
	public static void dfs(int v, int n, int [][] map, int [] visit)
	{
		System.out.print(v+" ");
		visit[v] = 1;
		
		for(int i=1; i<=n; i++)
		{
			if(i==v)
				continue;
			
			if(map[v][i]==1 && visit[i]==0)
			{
				dfs(i,n,map,visit);
			}
		}
	}
	
	public static void bfs(int v, int n, int [][] map, int [] visit)
	{
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(v);
		visit[v] = 1;
		while(!queue.isEmpty())
		{
			int temp = queue.poll();
			System.out.print(temp+" ");
			for(int i=1; i<=n; i++)
			{
				if(i==temp)
					continue;
				
				if(map[temp][i]==1 && visit[i]==0)
				{
					visit[i] = 1;
					queue.offer(i);
				}
			}
		}
	}
}

// 굉장히 중요한 개념이기때문에 까먹지 않기 위하여 다시 풀어보았음
// 또한 최대 속력이라는것들 도전해보았는데 저번에 284ms 보다 빨라져 252ms가 나오긴하였음 continue 차이인듯
// 그리고 이번에는 스태틱 변수를 사용하지않고 전부 매개변수로 받아 보았다.
// 이제는 어느저도 머리속에 개념이 잡힌듯 하다.