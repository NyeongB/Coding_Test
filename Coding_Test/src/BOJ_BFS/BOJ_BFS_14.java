// Date : 2020.11.03
// Title : 케빈 베이컨의 6단계 법칙
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : BFS

package BOJ_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_BFS_14
{
	static int[][] map;
	static int[] visit;
	static int[] result;
	static int n;

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int min = Integer.MAX_VALUE;

		String[] input = br.readLine().split(" ");

		n = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);

		map = new int[n + 1][n + 1];
		result = new int[n + 1];

		while (m-- > 0)
		{
			input = br.readLine().split(" ");
			int a = Integer.parseInt(input[0]);
			int b = Integer.parseInt(input[1]);

			map[a][b] = map[b][a] = 1;

		}

		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= n; j++)
			{
				visit = new int[n + 1];
				if (i == j)
					continue;

				result[i] += bfs(i, j);
			}
		}
		int ans = 0;
		for (int i = 1; i <= n; i++)
		{
			if (min > result[i])
			{
				min = result[i];
				ans = i;
			}
		}

		System.out.println(ans);

	}

	public static int bfs(int s, int e)
	{
		visit[s] = 1;
		Queue<Integer> q = new LinkedList<Integer>();

		for (int i = 1; i <= n; i++)
		{
			if (map[s][i] == 1)
			{
				q.add(i);
				visit[i] = 1;
			}
		}
		int cnt = 1;
		while (!q.isEmpty())
		{

			int q_size = q.size();
			while (q_size-- > 0)
			{
				int temp = q.poll();

				if (temp == e)
					return cnt;

				for (int i = 1; i <= n; i++)
				{
					if (map[temp][i] == 1 && visit[i] == 0)
					{
						q.add(i);
						visit[i] = 1;
					}
				}

			}
			cnt++;

		}

		return 0;
	}
}

// 새로운 유형의 bfs
// 연결된거에서 가는법 최소값? 
// 이렇게 안하면 1 -> 5 갈때 4가 나올수도있다 
// 이렇게하면 1 - 4 - 5 해서 2가 나오는 반면 