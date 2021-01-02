// Date : 2021.01.02
// Title : 테트로미노
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Bruteforcing

package BOJ_Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_Bruteforcing_11
{

	static int N;
	static int M;
	static int[][] map;
	static int MAX = Integer.MIN_VALUE;

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);

		map = new int[N][M];

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
				tetro_1(i, j);
				tetro_2(i, j);
				tetro_3(i, j);
				tetro_4(i, j);
				tetro_5(i, j);
			}
		}

		System.out.println(MAX);
	}

	// 테트로1 직선
	public static void tetro_1(int x, int y)
	{
		// 가로 검사
		int sum = 0;
		int count = 0;
		for (int i = 0; i < 4; i++)
		{
			int dy = y + i;

			if (dy < M)
			{
				count++;
				sum += map[x][dy];
			}
		}

		if (count == 4)
		{
			MAX = Math.max(MAX, sum);
		}

		// 세로 검사
		sum = 0;
		count = 0;
		for (int i = 0; i < 4; i++)
		{
			int dx = x + i;

			if (dx < N)
			{
				count++;
				sum += map[dx][y];
			}
		}

		if (count == 4)
		{
			MAX = Math.max(MAX, sum);
		}
	}

	// 테트로2 네모
	public static void tetro_2(int x, int y)
	{

		if (x + 1 >= N || y + 1 >= M)
			return;

		int sum = map[x][y] + map[x][y + 1] + map[x + 1][y] + map[x + 1][y + 1];

		MAX = Math.max(MAX, sum);

	}

	// 테트로3 ㄴ
	public static void tetro_3(int x, int y)
	{
		// 여덜 방향

		// 정방
		int sum = map[x][y];
		int count = 0;

		if (x + 1 < N)
			count++;
		if (x + 2 < N)
			count++;
		if (x + 2 < N && y + 1 < M)
			count++;

		if (count == 3)
			sum += map[x + 1][y] + map[x + 2][y] + map[x + 2][y + 1];

		MAX = Math.max(MAX, sum);
		// 90
		sum = map[x][y];
		count = 0;

		if (x + 1 < N)
			count++;
		if (y + 1 < M)
			count++;
		if (y + 2 < M)
			count++;

		if (count == 3)
			sum += map[x + 1][y] + map[x][y + 1] + map[x][y + 2];

		MAX = Math.max(MAX, sum);
		// 180
		sum = map[x][y];
		count = 0;

		if (x + 1 < N && y + 1 < M)
			count++;
		if (y + 1 < M)
			count++;
		if (x + 2 < N && y + 1 < M)
			count++;

		if (count == 3)
			sum += map[x + 1][y + 1] + map[x][y + 1] + map[x + 2][y + 1];

		MAX = Math.max(MAX, sum);
		// 270
		sum = map[x][y];
		count = 0;

		if (x - 1 >= 0)
			count++;
		if (y + 1 < M)
			count++;
		if (y + 2 < M)
			count++;

		if (count == 3)
			sum += map[x][y + 1] + map[x][y + 2] + map[x - 1][y + 2];

		MAX = Math.max(MAX, sum);

		// --------뒤집기
		// 정방
		sum = map[x][y];
		count = 0;

		if (y - 1 >= 0)
			count++;
		if (x + 1 < N)
			count++;
		if (x + 2 < N)
			count++;

		if (count == 3)
			sum += map[x + 1][y] + map[x + 2][y] + map[x + 2][y - 1];

		MAX = Math.max(MAX, sum);
		// 90
		sum = map[x][y];
		count = 0;

		if (x + 1 < N)
			count++;
		if (y + 1 < M)
			count++;
		if (y + 2 < M)
			count++;

		if (count == 3)
			sum += map[x + 1][y] + map[x + 1][y + 2] + map[x + 1][y + 1];

		MAX = Math.max(MAX, sum);
		// 180
		sum = map[x][y];
		count = 0;

		if (y + 1 < M)
			count++;
		if (x + 1 < N)
			count++;
		if (x + 2 < N)
			count++;

		if (count == 3)
			sum += map[x][y + 1] + map[x + 1][y] + map[x + 2][y];

		MAX = Math.max(MAX, sum);
		// 270
		sum = map[x][y];
		count = 0;

		if (x + 1 < N)
			count++;
		if (y + 1 < M)
			count++;
		if (y + 2 < M)
			count++;

		if (count == 3)
			sum += map[x + 1][y + 2] + map[x][y + 2] + map[x][y + 1];

		MAX = Math.max(MAX, sum);
	}

	// 테트로4 ㄹ
	public static void tetro_4(int x, int y)
	{
		// 네 방향
		// 정방
		int sum = map[x][y];
		int count = 0;

		if (x + 1 < N)
			count++;
		if (x + 1 < N && y+1<M)
			count++;
		if (x + 2 < N && y + 1 < M)
			count++;

		if (count == 3)
			sum += map[x + 1][y] + map[x + 1][y+1] + map[x + 2][y + 1];

		MAX = Math.max(MAX, sum);
		// 90
		sum = map[x][y];
		count = 0;

		if (x + 1 < N)
			count++;
		if (y + 1 < M)
			count++;
		if (x+1<N && y-1>=0)
			count++;

		if (count == 3)
			sum += map[x + 1][y] + map[x][y + 1] + map[x+1][y-1];

		MAX = Math.max(MAX, sum);
		// 180
		sum = map[x][y];
		count = 0;

		if (x + 1 < N)
			count++;
		if (y -1 >=0)
			count++;
		if (x + 2 < N )
			count++;

		if (count == 3)
			sum += map[x + 1][y] + map[x+1][y - 1] + map[x + 2][y -1];

		MAX = Math.max(MAX, sum);
		// 270
		sum = map[x][y];
		count = 0;

		if (x +1 <N)
			count++;
		if (y + 1 < M)
			count++;
		if (y + 2 < M)
			count++;

		if (count == 3)
			sum += map[x][y + 1] + map[x+1][y + 2] + map[x +1][y + 1];

		MAX = Math.max(MAX, sum);
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