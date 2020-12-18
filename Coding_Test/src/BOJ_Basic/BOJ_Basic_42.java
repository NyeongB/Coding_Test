// Date : 2020.12.18
// Title : 행렬 곱셈
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_42
{
	public static void main(String[] args) throws IOException
	{

		int[][] arr1 = new int[100][100]; // 최댓값만큼
		int[][] arr2 = new int[100][100];
		int[][] result = new int[100][100];

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);

		for (int i = 0; i < N; i++)
		{
			str = br.readLine().split(" ");
			for (int j = 0; j < M; j++)
			{
				arr1[i][j] = Integer.parseInt(str[j]);
			}
		}

		str = br.readLine().split(" ");

		M = Integer.parseInt(str[0]);
		int K = Integer.parseInt(str[1]);

		for (int i = 0; i < M; i++)
		{
			str = br.readLine().split(" ");
			for (int j = 0; j < K; j++)
			{
				arr2[i][j] = Integer.parseInt(str[j]);
			}
		}

		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < K; j++)
			{
				for (int k = 0; k < M; k++)
				{
					result[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}

		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < K; j++)
			{
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}
}
