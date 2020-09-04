// Date : 2020.09.04
// Title : 단어 수학
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Greedy

package BOJ_Greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ_Greedy_06
{

	// static Integer [] alpa = new Integer[26];
	// 객체 배열이기 때문에 null 로 전체 초기화됨
	// int 형 배열이면 0으로 초기화 되는것과 다르게

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());

		Integer[] alpa = new Integer[26];
		for (int i = 0; i < 26; i++)
			alpa[i] = 0;
		
		
		while(n-- >0)
		{
			String str = sc.next();
			for(int i=0; i<str.length(); i++)
			{
				alpa[str.charAt(i)-'A'] += (int)Math.pow(10, str.length()-1-i);
			}
		}

		int count = 9;

		Arrays.sort(alpa, new Comparator<Integer>()
		{
			@Override
			public int compare(Integer a, Integer b)
			{
				if (b > a)
					return 1;
				else if (a > b)
					return -1;
				else
					return 0;

			}
		});

		//for (int i = 0; i < alpa.length; i++)
			//System.out.println(alpa[i]);

		int result = 0;
		for (int i = 0; i < alpa.length; i++)
		{

			result += alpa[i] * count--;
			//System.out.println("result:" + result);
		}
		System.out.println(result);

	}

}
// 백트래킹으로도 다시 풀어본다. 