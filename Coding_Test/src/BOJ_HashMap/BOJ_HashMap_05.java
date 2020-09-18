// Date : 2020.09.18
// Title : 숫자 카드 2
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Hash Map
package BOJ_HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class BOJ_HashMap_05
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str, " ");

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++)
		{
			int temp = Integer.parseInt(st.nextToken());

			if (hm.get(temp) == null)
			{
				hm.put(temp, 1);
			} 
			else
			{
				hm.put(temp, hm.get(temp) + 1);
			}

		}

		int m = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();

		str = br.readLine();

		st = new StringTokenizer(str, " ");
		for (int i = 0; i < m; i++)
		{
			int temp = Integer.parseInt(st.nextToken());

			if (hm.get(temp) != null)
			{
				sb.append(hm.get(temp)).append(" ");
			}
			else
			{
				sb.append("0 ");
			}
		}

		System.out.println(sb.toString());
	}
}

// 처음에 이분 탐색 문제인줄 알았는데 
// 해쉬맵으로 한번 풀어봤다 시간초과가 안나고 1316ms 1.3초만에 해결되었다.. 오랜만에 한번에 통과했는데 
// 이분탐색과 해쉬맵을 동시에 쓰면 어떤것인이 참고해야겠다.
