// Date : 2021.01.04
// Title : 생태학
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Hash
package BOJ_HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class BOJ_HashMap_09
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		StringBuilder sb = new StringBuilder();

		String input = br.readLine();
		int count = 0;
		
		while (true)
		{
			hm.put(input, hm.getOrDefault(input, 0) + 1);

			input = br.readLine();
			count++;
			if (input == null || input.length() == 0)
				break;
		}

		String[] arr = new String[count];
		int index = 0;
		for (String s : hm.keySet())
		{
			arr[index++] = s;
		}

		Arrays.sort(arr);

		for (String s : arr)
		{
			double per = (double)(hm.get(s) * 100.0) / count;
			sb.append(s + String.format("%.4f", per)).append("\n");
		}

		System.out.println(sb.toString());

	}
}