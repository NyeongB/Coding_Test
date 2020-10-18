// Date : 2020.10.18
// Title : Z
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Recursion

package BOJ_Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Recursion_02
{

	static int[][] map;
	static int count = 0;
	static int r, c;

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int size = (int) Math.pow(2, n);
		map = new int[size][size];
		r = Integer.parseInt(str[1]);
		c = Integer.parseInt(str[2]);

		recur(size * size, 0, 0);
		System.out.println(map[r][c]);

		/*
		 * for(int i=0; i<size; i++) { for(int j=0; j<size; j++) {
		 * System.out.printf("%4d ",map[i][j]); } System.out.println(); }
		 */

	}

	static void recur(int n, int x, int y)
	{
		if (x > r || y > c)
		{
			return;
		}
		if (n == 1)
		{
			map[x][y] = count++;

			return;
		}

		int div = n / 4;

		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				recur(div, x + i * (int) Math.sqrt(div), y + j * (int) Math.sqrt(div));
			}
		}
	}
}

// 흐름이 정확하고 필요한 값 이상으로 계산하지 못하게했음에도 메모리 초과가 난다.
// 다음에 다시 답지를 참고하여 풀어본다...