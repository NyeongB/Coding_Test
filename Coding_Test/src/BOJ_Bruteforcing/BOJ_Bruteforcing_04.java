// Date : 2020.09.19
// Title : 
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Bruteforcing

package BOJ_Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Bruteforcing_04
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		Man[] arr = new Man[num];

		for (int i = 0; i < num; i++)
		{
			String[] str = br.readLine().split(" ");
			arr[i] = new Man(Integer.parseInt(str[0]), Integer.parseInt(str[1]));
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < num; i++)
		{
			int count = 1;

			for (int j = 0; j < num; j++)
			{
				if (i == j)
					continue;

				if (arr[i].h < arr[j].h && arr[i].w < arr[j].w) // 나보다 큰사람이 있으면 index 증가
				{
					count++;
				}

			}
			sb.append(count + " ");

		}

		System.out.println(sb.toString());

	}

	static class Man
	{
		int w;
		int h;

		public Man()
		{
			// TODO Auto-generated constructor stub
		}

		public Man(int w, int h)
		{
			this.w = w;
			this.h = h;
		}
	}
}

// 배열 두개 쓰는게 낫다..
// 비교해가면서 나보다 모든면에서 큰사람이 있다면 count++