// Date : 2020.09.01
// Title : 
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_03
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int maxNum = 0;

		int totalNum = 0;

		for (int i = 0; i < 4; i++)
		{
			String[] input = br.readLine().split(" ");
			int s = Integer.parseInt(input[0]);
			int e = Integer.parseInt(input[1]);

			totalNum += e - s;

			if (totalNum > maxNum)
			{
				maxNum = totalNum;
			}

		}

		System.out.println(maxNum);

	}
}