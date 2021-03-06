// Date : 2021.01.09
// Title : 테트로미노
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Bruteforcing

package BOJ_Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_Bruteforcing_13
{

	static int N;
	static int M;
	static int[][] map;
	static int[][] visited;
	static int sum;
	static int MAX = Integer.MIN_VALUE;

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);

		map = new int[N][M];
		visited = new int[N][M];

		for (int i = 0; i < N; i++)
		{
			str = br.readLine().split(" ");
			for (int j = 0; j < M; j++)
			{
				map[i][j] = Integer.parseInt(str[j]);
			}
		}

		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < M; j++)
			{
				// 모든 좌표에서 테트리미노 최대값 검사
				/*
				 * tetro_1(i, j); tetro_2(i, j); tetro_3(i, j); tetro_4(i, j);
				 */
				
				// ㄴ, ㄹ, ㅣ, ㅁ 검사
				dfs(i, j, 0);
				
				// ㅗ 검사
				tetro_5(i, j);
			}
		}

		System.out.println(MAX);
	}
	
	static int [] dx = {0,0,1,-1};
	static int [] dy = {1,-1,0,0};
	
	public static void dfs(int a, int b, int count)
	{
		if( count == 4)
		{
			MAX = Math.max(MAX, sum);
			return;
		}
		
		for(int i=0; i<4; i++)
		{
			int nx = dx[i] + a;
			int ny = dy[i] + b;
			
			if(nx>=0&&nx<map.length&&ny>=0&&ny<map[0].length)	// map 범위 내에서만 이동 가능
			{
				if(visited[nx][ny]==0)
				{
					visited[nx][ny] = 1;	// 방문
					sum += map[nx][ny];
					
					dfs(nx, ny, count + 1);
					
					// 다시 돌아감
					visited[nx][ny] = 0;
					sum -= map[nx][ny];
				}
			}
		}
		
		
	}
	
	
	// 테트로5 ㅗ
	public static void tetro_5(int x, int y)
	{
		// 네방향을 봐야함

		// 정방
		int sum = map[x][y];
		int count = 0;

		if (x + 1 < N)
			count++;
		if (y + 1 < M && x + 1 < N)
			count++;
		if (x + 1 < N && y - 1 >= 0)
			count++;

		if (count == 3)
			sum += map[x + 1][y + 1] + map[x + 1][y] + map[x + 1][y - 1];

		MAX = Math.max(MAX, sum);

		// 90도 회전
		sum = map[x][y];
		count = 0;

		if (x + 1 < N)
			count++;
		if (y + 1 < M && x + 1 < N)
			count++;
		if (x + 2 < N)
			count++;

		if (count == 3)
			sum += map[x + 2][y] + map[x + 1][y + 1] + map[x + 1][y];

		MAX = Math.max(MAX, sum);
		// 180도 회전
		sum = map[x][y];
		count = 0;

		if (x + 1 < N && y + 1 < M)
			count++;
		if (y + 1 < M)
			count++;
		if (y + 2 < M)
			count++;

		if (count == 3)
			sum += map[x][y + 2] + map[x + 1][y + 1] + map[x][y + 1];

		MAX = Math.max(MAX, sum);

		// 270도 회전
		sum = map[x][y];
		count = 0;

		if (x + 1 < N && y - 1 >= 0)
			count++;
		if (x + 1 < N)
			count++;
		if (x + 2 < N)
			count++;

		if (count == 3)
			sum += map[x + 1][y] + map[x + 2][y] + map[x + 1][y - 1];

		MAX = Math.max(MAX, sum);
	}

}

// 5개의 도형 4칸씩 차지하는 노가다를 했다.

// 가장 중요한것은 map의 범위를 넘어서는 인덱스를 건드리지 않게 사전에 방지해야한다.
// ㅡ,ㅁ 은 비교적 간단한데 , ㄴ,ㄹ,ㅗ 자체가 확인해야할 방향이 많다
// 처음엔 간단하게 메소드구현해서 회전식으로 접근하려했지만 생각이 나지않아 모든 케이스를 확인하는식으로 접근하였다.

// 다시 풀어보니 'ㅗ' 을 제외한 모든 모양이 dfs로 4번 방문할때 나온다는걸 파악 다시 구현 