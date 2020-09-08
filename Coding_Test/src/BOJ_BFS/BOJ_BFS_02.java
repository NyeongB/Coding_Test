// Date : 2020.09.08
// Title : 섬의 갯수
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : BFS

package BOJ_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

// 우선 BFS 구현해본다.

class Node
{
	int x, y;

	public Node(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

public class BOJ_BFS_02
{
	static int[] dx =
	{ -1, -1, 0, 1, 1, 1, 0, -1 }; // 12시 부터 시계방향으로
	static int[] dy =
	{ 0, 1, 1, 1, 0, -1, -1, -1 };

	static int[][] arr; // 섬 매트릭스
	static int[][] visit; //

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		while (true)
		{
			String[] str = br.readLine().split(" ");
			int w = Integer.parseInt(str[0]);
			int h = Integer.parseInt(str[1]);

			if (w == 0 && h == 0)
				break;

			arr = new int[h][w];

			for (int i = 0; i < h; i++) // 초기화
			{
				str = br.readLine().split(" ");
				for (int j = 0; j < w; j++)
				{
					arr[i][j] = Integer.parseInt(str[j]);
				}
			}

			int count = 0;
			visit = new int[h][w];

			for (int i = 0; i < h; i++)
			{
				
				for (int j = 0; j < w; j++)
				{
					if (arr[i][j] == 1 && visit[i][j] == 0)
						bfs(h, w, i, j, ++count);
				}
			}

			sb.append(count + "\n");

		}

		System.out.println(sb.toString());

	}

	static void bfs(int h, int w, int x, int y, int count)
	{
		LinkedList<Node> q = new LinkedList<Node>();
		visit[x][y] = 1;
		q.offer(new Node(x, y));

		while (!q.isEmpty())
		{
			Node temp = q.poll();
			x = temp.x;
			y = temp.y;
			for (int i = 0; i < dx.length; i++)
			{
				int a = dx[i] + x;
				int b = dy[i] + y;
				if (0 <= a && a < h && 0 <= b && b < w)
				{
					if (arr[a][b] == 1 && visit[a][b] == 0)
					{
						q.offer(new Node(a, b));
						visit[a][b] = 1;
					}
				}

			}
		}
	}

}

// 교훈 : 입력하는 반복문 고대로 가져다 쓰지 않기.. 오류 찾느라 엄청 오래걸림 