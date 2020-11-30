// Date : 2020.12.01
// Title : 에라토스테네스의 체
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_34
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		int num = Integer.parseInt(str[0]);
		int k = Integer.parseInt(str[1]);

		int[] arr = new int[num + 1];

		for (int i = 2; i <= num; i++) // 편의상 arr[2] ~
		{
			arr[i] = i;
		}

		int count = 0;

		while (true)
		{
			if (count == num - 1)
				break;

			for (int i = 2; i <= num; i++)
			{
				if (arr[i] != 0)	// 0인 것은 이미 방문한것
				{
					if (isPrime(arr[i]))
					{
						count++;
						if (count == k)
						{
							System.out.println(arr[i]);
							return;
						}
						arr[i] = 0;
						int temp_index = i;
						
						while (temp_index <= num)
						{
							if (arr[temp_index] != 0)
							{
								count++;
								if (count == k)
								{

									System.out.println(arr[temp_index]);
									return;
								}
								arr[temp_index] = 0;
							}
							temp_index += i;
						}
					}
				}
			}

		}

	}

	public static boolean isPrime(int n)
	{
		boolean result = true;

		for (int i = 2; i <= Math.sqrt(n); i++)
		{
			if (n % i == 0)
				return false;
		}

		return result;
	}
}