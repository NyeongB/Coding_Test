// Date : 2020.10.11
// Title : 영역 구하기
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : DFS

package BOJ_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_DFS_09
{
	
	static int N, M ,K;
	static int [][] map;
	static int size=0;
	static int [] dx = {0,0,-1,1};
	static int [] dy = {-1,1,0,0};
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().split(" ");
		
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		K = Integer.parseInt(str[2]);
		
		map = new int[N][M];
		
		for(int i=0; i<K; i++)
		{
			str = br.readLine().split(" ");
			
			int x1 = Integer.parseInt(str[0]);
			int y1 = Integer.parseInt(str[1]);
			int x2 = Integer.parseInt(str[2]);
			int y2 = Integer.parseInt(str[3]);
			
			for(int j=y1; j<y2; j++)
			{
				for(int k=x1; k<x2; k++)
				{
					map[j][k] = 1;
				}
			}
			
		}
		
		// 초기화 끝 
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int count = 0;
		for(int i=0; i<N; i++)
		{
			for(int j=0; j<M; j++)
			{
				if(map[i][j]==0)
				{
					map[i][j] = 1;
					count++;
					
					dfs(i,j);
					list.add(size);
					
				}
				
				size = 0;
			}
		}
		
		Collections.sort(list);
		
		System.out.println(count);
		for(int num : list)
		{
			System.out.print(num + " ");
		}
	}
	
	static void dfs(int a, int b)
	{
		size++;
		for(int i=0; i<4; i++)
		{
			int x = a + dx[i];
			int y = b + dy[i];
			if(x>=0&&y>=0&&x<N&&y<M)
			{
				if(map[x][y]==0)
				{
					map[x][y] = 1;
					dfs(x,y);
				}
			}
		}
	}
}

// 2차원 배열의 구조만 적응하다 보니 현실 좌표축 x,y가 반대가 되어있어서 접근하기 매우 어려웠다.
// 앞으로 이런 구조의 문제가 나오면 전부다 거꾸로 접근해야 할것같다.
// 굉장히 좋은 문제인것같다.