// Date : 2020.12.26
// Title : 암기왕
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Binary Search

package BOJ_BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_BinarySearch_06
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] str;
		int T = Integer.parseInt(br.readLine()); // Test case 갯수

		while (T-- > 0)
		{
			int N = Integer.parseInt(br.readLine());

			str = br.readLine().split(" ");

			int[] arr = new int[N];

			for (int i = 0; i < N; i++)
			{
				arr[i] = Integer.parseInt(str[i]);
			}

			Arrays.sort(arr);	// 이분 탐색은 정렬이 되어있어야함 

			int M = Integer.parseInt(br.readLine());

			str = br.readLine().split(" ");

			for (int i = 0; i < M; i++)
			{
				int num = Integer.parseInt(str[i]);
				
				if (binary_search(arr, num)) // 값이 있으면
				{
					sb.append("1\n");
				} 
				else
				{
					sb.append("0\n");
				}
			}

		}

		System.out.println(sb.toString());

	}

	public static boolean binary_search(int[] arr, int num)
	{
		int start = 0;				// 시작 인덱스
		int end = arr.length - 1;	// 끝 인덱스

		while (start <= end)
		{
			int mid = (start + end) / 2;	// 가운데 인덱스랑 맞으면 리턴, 작으면 엔드값 줄이고, 크면 스타트 값 늘림 

			if (arr[mid] == num)
			{
				return true;
			} else if (num < arr[mid])
			{
				end = mid - 1;
			} else
			{
				start = mid + 1;
			}
		}

		return false;

	}

}
