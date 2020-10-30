// Date : 2020.10.30
// Title : 맥주마시면서 걸어가기
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : BFS

package BOJ_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_BFS_12
{

	static int[] visit;
	static int[][] map;
	static int n;

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int total = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		while (total-- > 0)
		{
			n = Integer.parseInt(br.readLine()); // 편의점 수

			int[] arrX = new int[n + 2]; // 집 편의점*N, 목적지
			int[] arrY = new int[n + 2];

			for (int i = 0; i < n + 2; i++)
			{
				String[] str = br.readLine().split(" ");
				arrX[i] = Integer.parseInt(str[0]);
				arrY[i] = Integer.parseInt(str[1]);
			}

			map = new int[n + 2][n + 2];
			visit = new int[n + 2];

			for (int i = 0; i < n + 2; i++)
			{
				for (int j = i + 1; j < n + 2; j++)
				{
					if (Math.abs(arrX[i] - arrX[j]) + Math.abs(arrY[i] - arrY[j]) <= 1000)
					{
						map[i][j] = 1;
						map[j][i] = 1;
					}
				}
			}
			// 판별과정
			boolean flag = bfs();
			/*
			 * for(int i=0; i<n+1; i++) { int result = 0;
			 * 
			 * result += arrX[i+1] - arrX[i]; result += arrY[i+1] - arrY[i];
			 * 
			 * if(result > 1000) { flag = false; break; } }
			 */
			if (flag)
				sb.append("happy\n");
			else
				sb.append("sad\n");

		}

		System.out.println(sb.toString());
	}

	public static boolean bfs()
	{
		boolean result = false;

		Queue<Integer> q = new LinkedList<Integer>();

		q.add(0);

		visit[0] = 1;

		while (!q.isEmpty())
		{
			int temp = q.poll();
			if (temp == n + 1)
				return true;

			for (int i = 0; i < n + 2; i++)
			{

				if (map[temp][i] == 1 && visit[i] == 0)
				{
					visit[i] = 1;
					q.add(i);
				}
			}
		}

		return result;
	}
}

// 처음엔 그냥 단순히 배열에 넣고 
// 다음인덱스와 현재 인덱스가 1000이 넘어가버리면 실패하는식으로했는데
// 이렇게되면 문제가 이전값과 연결된건 판단하지 못한다
// 그래서 인접행렬 느낌으로 연결됐는지 안됐는지를 판단하고 bfs를 돌린다.