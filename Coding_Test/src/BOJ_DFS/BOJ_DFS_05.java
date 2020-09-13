// Date : 2020.09.13
// Title : 안전 영역
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : DFS

package BOJ_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_DFS_05
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[][] map = new int[n][n];

		int[] dx ={ 1, 0, -1, 0 };
		int[] dy ={ 0, 1, 0, -1 };

		int max = 0; // 비의 최댓값.

		int maxResult = 1; // 결과의 최댓값.

		for (int i = 0; i < n; i++)	// 초기화 
		{
			String[] str = br.readLine().split(" ");
			for (int j = 0; j < n; j++)
			{
				map[i][j] = Integer.parseInt(str[j]);
				if (max < map[i][j])
					max = map[i][j];
			}
		}

		for (int k = 1; k <= max; k++)
		{

			int[][] visit = new int[n][n];
			int result = 0;					// 빗물의 양이 1~max 까지 케이스를 다봐야하기때문에 케이스마다 초기화 

			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					if (map[i][j] > k && visit[i][j] == 0)
					{
						dfs(i, j, dx, dy, map, visit, n, k);
						result++;
					}
				}
			}

			if (maxResult < result)
				maxResult = result;

		}

		System.out.println(maxResult);

	}

	public static void dfs(int x, int y, int[] dx, int[] dy, int[][] map, int[][] visit, int n, int k)
	{
		visit[x][y] = 1; // 방문 처리

		for (int i = 0; i < 4; i++)
		{
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && ny >= 0 && nx < n && ny < n)

				if (visit[nx][ny] == 0 && map[nx][ny] > k)
				{
					dfs(nx, ny, dx, dy, map, visit, n, k);
				}
		}
	}

}

// 비의 양은 1~ 높이의 최댓값까지 조사하는건 맞지만
// 왜 남은 지역의 최댓값을 0으로 시작하면 틀리고 1로 시작하면 맞는지 이해가 가지 않는 문제.. 
// 다음에 다시 와서 풀어보록한다. 기본적인 dfs는 충분히 익힌 느낌이다.