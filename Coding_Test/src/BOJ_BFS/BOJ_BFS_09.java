// Date : 2020.10.16, 21.01.03
// Title : 연구소
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : BFS

package BOJ_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_BFS_09
{
	static int N, M;
	static int[][] map;
	static int[][] copy;

	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };

	static int result = 0;

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");

		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		map = new int[N][M];
		copy = new int[N][M];

		for (int i = 0; i < N; i++)
		{

			str = br.readLine().split(" ");
			for (int j = 0; j < M; j++)
			{
				map[i][j] = Integer.parseInt(str[j]);
			}
		}
		wall(0);

		System.out.println(result);

	}

	// 벽 쌓기
	public static void wall(int count)
	{
		if (count == 3)
		{
			/*
			 * for(int i=0; i<N; i++) { for(int j=0; j<M; j++) {
			 * System.out.print(copy[i][j]+" "); } System.out.println(); }
			 * System.out.println();
			 */

			// 이때 bfs로 바이러스 탐색

			copy(); // 이떄 벽 3개 쌓은 케이스를 복사

			for (int i = 0; i < N; i++)
			{
				for (int j = 0; j < M; j++)
				{
					if (copy[i][j] == 2)
					{
						bfs(i, j);
					}
				}
			}

			result = Math.max(result, check());

			return;
		}

		// 벽 쌓기

		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < M; j++)
			{
				if (map[i][j] == 0)
				{
					map[i][j] = 1;
					wall(count + 1);
					map[i][j] = 0;
				}
			}
		}

	}

	// 연구소 카피
	public static void copy()
	{
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < M; j++)
			{
				copy[i][j] = map[i][j];
				// copy_visited[i][j] = visited[i][j];
			}
		}
	}

	// 안전 영역 갯수 체크
	public static int check()
	{

		int result = 0;

		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < M; j++)
			{
				if (copy[i][j] == 0)
					result++;
			}
		}

		return result;

	}


	// 바이러스 증식
	public static void bfs(int x, int y)
	{
		int[] node = new int[]
		{ x, y };
		Queue<int[]> q = new LinkedList<>();
		q.add(node);

		while (!q.isEmpty())
		{
			int[] temp = q.poll();

			for (int i = 0; i < 4; i++)
			{
				int nx = dx[i] + temp[0];
				int ny = dy[i] + temp[1];

				if (nx >= 0 && nx < N && ny >= 0 && ny < M)
				{
					if (copy[nx][ny] == 0)
					{
						copy[nx][ny] = 2; // 바이러스 전이
						q.add(new int[]
						{ nx, ny });
					}
				}
			}
		}
	}
}

// 벽 3개 놓은것을 전체 탐색하는 브루트포스와
// 그떄마다 맵을 카피
// 그리고 바이러스 증식하는 bfs가 함께 필요한 문제