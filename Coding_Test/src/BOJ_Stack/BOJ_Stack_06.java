// Date : 2020.09.07
// Title : 스택 수열
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Stack

package BOJ_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_Stack_06
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		Stack<Integer> st = new Stack<>();

		StringBuffer sb = new StringBuffer();

		int index = 0;

		int[] arr = new int[n];
		int temp = n;
		while (temp-- != 0)
		{
			arr[index++] = Integer.parseInt(br.readLine());
		}

		index = 0;

		for (int i = 0; i < n; i++)
		{
			sb.append("+\n");
			st.push(i + 1);

			while (!st.isEmpty() && arr[index] == st.peek())
			{
				sb.append("-\n");
				st.pop();
				index++;
			}
		}
		if(st.isEmpty())
		System.out.println(sb.toString());
		else
			System.out.println("NO");
	}

}