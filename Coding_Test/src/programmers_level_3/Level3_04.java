// Date : 2020.10.08
// Title : 여행결로
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : BFS

package programmers_level_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Level3_04
{
	public static void main(String[] args)
	{
		Solution3_04 solution3_04 = new Solution3_04();
		String[] str = solution3_04.solution(new String[][]
		{
				{ "ICN", "SFO" },
				{ "ICN", "ATL" },
				{ "SFO", "ATL" },
				{ "ATL", "ICN" },
				{ "ATL", "SFO" } });

		for (String s : str)
		{
			System.out.println(s);
		}
	}

}

class Solution3_04
{

	class Node
	{
		String x, y;

		Node(String x, String y)
		{
			this.x = x;
			this.y = y;
		}
	}

	public String[] solution(String[][] tickets)
	{
		String[] answer = new String[tickets.length + 1];

		ArrayList<Node> list = new ArrayList<Node>();

		Queue<Node> q = new LinkedList<>();

		ArrayList<Node> list2 = new ArrayList<Node>();

		for (int i = 0; i < tickets.length; i++)
		{
			list.add(new Node(tickets[i][0], tickets[i][1]));
		}

		Collections.sort(list, new Comparator<Node>()
		{

			@Override
			public int compare(Node o1, Node o2)
			{
				if (o1.x.equals(o2.x))
				{
					return o1.y.compareTo(o2.y);
				}

				return o1.x.compareTo(o2.x);
			}
		});

		int[] visit = new int[tickets.length];
		int index = 0;
		int cnt = 0;
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).x.equals("ICN"))
			{
				if (cnt > 0)
					break;
				index = i;
				for (int j = 0; j < list.size(); j++)
				{
					if (list.get(index).y.equals(list.get(j).x))
					{
						cnt++;
					}
				}

			}
		}

		q.add(new Node(list.get(index).x, list.get(index).y));

		visit[index] = 1;
		while (!q.isEmpty())
		{

			Node temp = q.poll();
			list2.add(new Node(temp.x, temp.y));
			for (int i = 0; i < list.size(); i++)
			{
				if (temp.y.equals(list.get(i).x) && visit[i] == 0)
				{
					System.out.println(i);
					visit[i] = 1;
					q.add(new Node(list.get(i).x, list.get(i).y));
					break;
				}
			}

		}
		System.out.println(list2.size());

		for (int i = 0; i < answer.length - 1; i++)
		{
			answer[i] = list2.get(i).x;
		}
		answer[answer.length - 1] = list2.get(answer.length - 2).y;

		return answer;
	}
}

// 너무나도 하드 코딩인거같다..
// 75.0 / 100.0
// 다음에 블로그 보고 참고하면서 한다.