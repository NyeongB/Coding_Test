// Date : 2020.10.17
// Title : A → B
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : BFS

package BOJ_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_BFS_10
{

	static long dest;
	static int min = 0;
	static HashMap<Long, Integer> hm = new HashMap<Long, Integer>();

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		dest = Integer.parseInt(str[1]);
		bfs(n);
		if(min == -1)
			System.out.println(min);
		else
			System.out.println(min+1);
	}

	public static void bfs(int n)
	{
		ArrayList<Long> list = new ArrayList<Long>();
		hm.put((long)n, 1);
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(n, 0));

		while (!q.isEmpty())
		{
			Point temp = q.poll();
			long next = temp.x*10+1;
			if (temp.x == dest)
			{
				min = temp.y;
				return;
			}

				if (temp.x * 2 <= dest&&!hm.containsKey(temp.x*2))
				{
					q.add(new Point(temp.x * 2, temp.y + 1));
					list.add(temp.x*2);
				}

				if (next <= dest&&!hm.containsKey(next))
				{
					q.add(new Point(next, temp.y + 1));
					list.add(next);
				}

		}
		min-=1;
	}
	
	static class Point{
		long x;
		int y;
		
		Point(long x, int y)
		{
			this.x = x;
			this.y = y;
		}
	}

}

// 많은 것을 배우는 문제
// 우선 범위가 1000000000 까지이므로 int [] visit 으로 접근할수없었다 바로 메모리초과가 뜬다
// 그다음 접근은 ArrayList에 넣은후 contain 을 하는것인데 이게 구조자체를 몰라서 써도 되는건줄알았지만 엄청난 메모리 소비가된다 결과는 시간초과
// 마지막 접근은 HashMap에 넣고 containsKey를 사용하여 방문했는지 없는지를 판단하는건데 
// 당연히 메모리 효율이 엄청좋았다.
// 문제자체는 숨바꼭질과 비슷하여 빨리 풀었으나 계속해서 에러가 났다
// 범위, 방문기록 의 범위가 클때 접근하는 법을 알게된 중요한 문제