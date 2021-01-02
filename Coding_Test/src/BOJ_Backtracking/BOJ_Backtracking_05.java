// Date : 2021.01.02
// Title : 부분수열의 합
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Backtracking
package BOJ_Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Backtracking_05
{

	static int N = 0;
	static int S = 0;
	static int count = 0;
	static int[] map;

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		N = Integer.parseInt(str[0]);
		S = Integer.parseInt(str[1]);

		str = br.readLine().split(" ");
		map = new int[N];
		for (int i = 0; i < N; i++)
		{
			map[i] = Integer.parseInt(str[i]);
		}
		dfs(0, 0);
		
		if(S==0)
			count--;
		
		System.out.println(count);

	}

	public static void dfs(int index, int sum)
	{
		if(index == N)
		{
			if(sum == S)
			{
				count++;
			}
			return;
		}
		
		dfs(index + 1, sum + map[index]);
		dfs(index + 1, sum);

	}
}