// Date : 2020.10.10
// Title : 촌수 계산
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : DFS

package BOJ_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_DFS_08
{
	static int [][] map;
	static int [] visit;
	static int result;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		map = new int[n+1][n+1];
		
		String [] str = br.readLine().split(" ");
		int s = Integer.parseInt(str[0]);
		int e = Integer.parseInt(str[1]);
		
		int edge = Integer.parseInt(br.readLine());
		
		while(edge-- >0)
		{
			str = br.readLine().split(" ");
			int x = Integer.parseInt(str[0]);
			int y = Integer.parseInt(str[1]);
			
			map[x][y] = map[y][x] = 1;
		}
		visit = new int[n+1];
		for(int i=1; i<=n; i++)
		{
			
			if(map[s][i]==1)
			{
				//System.out.println("시작"+s+" "+i);
				visit[s] = 1;
				visit[i] = 1;
				dfs(i, e, 1,n);
			}
		}
		
		if(result==0)
		{
			System.out.println(-1);
		}
		else
		System.out.println(result);
		
	}
	
	public static void dfs(int end, int dest, int count,int n)
	{
		//System.out.println(end+" "+count);
		if(end == dest)
		{
			result = count;
			return;
		}
		
		for(int i=1; i<=n; i++)
		{
			if(map[end][i]==1 && visit[i]==0)
			{
				visit[i] = 1;
				dfs(i,dest,count+1,n);
			}
		}
		
		
	}
	
}
// 가중치가 있는 탐색 dfs로 푸는게 유리한것같다
// 안보고 풀었으나 다시 풀어봐야할것같다 살짝 헤멨다
/*
12
2 11
11
1 10
1 4
1 3
1 2
4 11
4 12
2 5
2 6
2 7
7 8
7 9
테스트 케이스
*/
