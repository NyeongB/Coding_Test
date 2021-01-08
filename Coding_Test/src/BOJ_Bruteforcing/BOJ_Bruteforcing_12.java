// Date : 2021.01.08
// Title : 2048
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Bruteforcing

package BOJ_Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_Bruteforcing_12
{

	static int N;
	static int[][] map;
	static int MAX = Integer.MIN_VALUE;

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		N = Integer.parseInt(str[0]);
		map = new int[N][N];
		for (int i = 0; i < N; i++)
		{
			str = br.readLine().split(" ");

			for (int j = 0; j < N; j++)
			{
				map[i][j] = Integer.parseInt(str[j]);
			}
		}

		dfs(0);
		System.out.print(MAX);

	}

	public static void dfs(int count)
	{
		// 최대 판별
		if (count == 5)
		{
			for (int i = 0; i < N; i++)
			{

				for (int j = 0; j < N; j++)
				{
					if (map[i][j] > MAX)
					{
						MAX = map[i][j];
					}
				}
			}

			return;
		}

		int copy[][] = new int[N][N];	
		
		for (int i = 0; i < N; i++)
			copy[i] = map[i].clone();	// 현재것을 한번 저장했다가 

		for (int i = 0; i < 4; i++)
		{
			move(i);
			dfs(count + 1);

			for (int a = 0; a < N; a++)
				map[a] = copy[a].clone();	// 이전의 dfs 한번 돌고 재귀 끝나고 한번 해줘야 다음에들이 순수한것부터 진행할수있다

		}

	}

	public static void move(int dir)
	{
		switch (dir)
		{
		// 위로 몰기
		case 0:
			for (int i = 0; i < N; i++)
			{
				int index = 0;
				int block = 0;
				for (int j = 0; j < N; j++)
				{
					if (map[j][i] != 0)
					{
						if (block == map[j][i])
						{
							map[index - 1][i] = block * 2;
							block = 0;
							map[j][i] = 0;
						} else
						{
							block = map[j][i];
							map[j][i] = 0;
							map[index][i] = block;
							index++;
						}
					}
				}
			}
			break;
		// 왼쪽으로 몰기
		case 1:
			for (int i = 0; i < N; i++)
			{
				int index = N - 1;
				int block = 0;
				for (int j = N - 1; j >= 0; j--)
				{
					if (map[j][i] != 0)
					{
						if (block == map[j][i])
						{
							map[index + 1][i] = block * 2;
							block = 0;
							map[j][i] = 0;
						} else
						{
							block = map[j][i];
							map[j][i] = 0;
							map[index][i] = block;
							index--;
						}
					}
				}
			}
			break;
		// 왼쪽으로 몰기
		case 2:
			for (int i = 0; i < N; i++)
			{
				int index = 0;
				int block = 0;
				for (int j = 0; j < N; j++)
				{
					if (map[i][j] != 0)
					{
						if (block == map[i][j])
						{
							map[i][index - 1] = block * 2;
							block = 0;
							map[i][j] = 0;
						} else
						{
							block = map[i][j];
							map[i][j] = 0;
							map[i][index] = block;
							index++;
						}
					}
				}
			}
			break;
		// 오른쪽으로 몰기
		case 3:
			for (int i = 0; i < N; i++)
			{
				int index = N - 1;
				int block = 0;
				for (int j = N - 1; j >= 0; j--)
				{
					if (map[i][j] != 0)
					{
						if (block == map[i][j])
						{
							map[i][index + 1] = block * 2;
							block = 0;
							map[i][j] = 0;
						} else
						{
							block = map[i][j];
							map[i][j] = 0;
							map[i][index] = block;
							index--;
						}
					}
				}
			}
			break;
		}
	}

}

/*
 * 어제 5시간 투자하고 못풀었음 원인은 전역변수를 통해 값이 축적되는데 그것을 재귀함수 끝나고 풀어줘야 하는것과 상하좌우로 쌓는부분에서 조금
 * 문제가 있었던것같다 오래 걸린 이유는 8가지 반례를 찾았는데 그중에서 하나만 안되길래 숫자 쌓기에는 문제가 없는줄 알았다..
 */
