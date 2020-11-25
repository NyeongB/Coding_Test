// Date : 2020.11.25
// Title : 점수 계산
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Sorting

package BOJ_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class BOJ_Sorting_11
{

	static class Data
	{

		int index;
		int num;

		public Data(int index, int num)
		{
			this.index = index;
			this.num = num;
		}
	}

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Data> list = new ArrayList<>();

		for (int i = 0; i < 8; i++)
		{
			list.add(new Data(i, Integer.parseInt(br.readLine())));
		}

		Collections.sort(list, new Comparator<Data>()
		{

			@Override
			public int compare(Data o1, Data o2)
			{
				if (o1.num < o2.num)
					return 1;
				else
					return -1;
			}

		});

		int[] arr = new int[5];

		int sum = 0;

		for (int i = 0; i < 5; i++)
		{
			arr[i] = list.get(i).index;
			sum += list.get(i).num;
		}
		Arrays.sort(arr);
		System.out.println(sum);
		for (int n : arr)
			System.out.print((n + 1) + " ");

	}
}
// 좀 지저분한게 푼거같은데
// 인덱스와 점수를 같이가져가기엔 이방법이 최고인것같다..