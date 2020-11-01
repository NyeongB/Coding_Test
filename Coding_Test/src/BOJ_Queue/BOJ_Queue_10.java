// Date : 2020.11.01
// Title : AC
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Dequeue

package BOJ_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BOJ_Queue_10
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		Deque<Integer> dq;

		while (n-- > 0)
		{
			dq = new ArrayDeque<Integer>();
			String command = br.readLine();

			int size = Integer.parseInt(br.readLine());

			String input = br.readLine();

			String[] number = input.substring(1, input.length() - 1).split(",");

			for (int i = 0; i < size; i++)
			{
				dq.addFirst(Integer.parseInt(number[i]));
			}

			boolean sw = false; // sw -> false 정방향 , sw-> true 역방향
			boolean flag = false;

			// command 에 따라 변경
			for (int i = 0; i < command.length(); i++)
			{
				char temp = command.charAt(i);
				if (temp == 'R')
				{
					sw = !sw;
					// System.out.println(sw);
				} else if (temp == 'D')
				{

					if (dq.isEmpty())
					{
						flag = true;
						break;
					} else
					{
						if (sw)// 정방향일땐
							dq.pollFirst();
						else
							dq.pollLast();
					}

				}
			}

			if (flag)
			{
				sb.append("error\n");
				continue;
			} else
			{
				// 방향에 따른 출력
				int qsize = dq.size();

				if (size == 0)
				{
					sb.append("[]\n");
				} else
				{
					if (sw)
					{
						sb.append("[" + dq.pollFirst());
						for (int i = 1; i < qsize; i++)
						{
							sb.append("," + dq.pollFirst());
						}
						sb.append("]\n");
					} else
					{
						sb.append("[" + dq.pollLast());
						for (int i = 1; i < qsize; i++)
						{
							sb.append("," + dq.pollLast());
						}
						sb.append("]\n");
					}
				}

			}

		}

		System.out.println(sb.toString());
	}
}

// 50%