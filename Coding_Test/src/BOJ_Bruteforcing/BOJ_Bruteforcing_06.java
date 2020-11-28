// Date : 2020.11.28
// Title : 리모컨
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Bruteforcing

package BOJ_Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Bruteforcing_06
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int target_num = Integer.parseInt(br.readLine());
		int num_count = Integer.parseInt(br.readLine());
		int[] broken = new int[10]; // 0 ~ 9
		if (num_count > 0)
		{
			String[] str = br.readLine().split(" ");

			for (String s : str)
				broken[Integer.parseInt(s)]++; // 0이 아니면 브로큰
		}

		if (target_num == 100) // 100 이면 움직일 필요가없음
		{
			System.out.println(0);
			return;
		} else
		{
			String closer = "";
			String temp_num = "";
			int min = Integer.MAX_VALUE;

			for (int i = 0; i < 1000000; i++)
			{
				boolean flag = true;
				temp_num = "" + i;
				for (int j = 0; j < temp_num.length(); j++)
				{
					if (broken[temp_num.charAt(j) - '0'] > 0)
					{
						flag = false;
						break;
					}
				}

				if (flag)
				{
					if (min > Math.abs(Integer.parseInt(temp_num) - target_num)) // 가장 가까운수 찾기
					{
						min = Math.abs(Integer.parseInt(temp_num) - target_num);
						closer = "" + temp_num;
					}
				}

			}

			/////////////////// 구하기 단계

			// System.out.println(closer);

			int result1 = Math.abs(target_num - 100); // 다 고장났을때 +,-로 가는길

			if (closer.equals(""))
				System.out.println(result1);
			else
			{
				int result2 = Math.abs(target_num - Integer.parseInt(closer)) + closer.length();
				if (result1 > result2)
					System.out.println(result2);
				else
					System.out.println(result1);
			}

		}

	}
}

// 정말 오래걸린문제 
// 85%부분에서 런타임에러를 찾는것도 오래걸렸다.. 이게 문제에서 입력 카운터가 0일떄도있는데 그때 split해버려서 그렇다..
// 핵심은 리모콘으로 갈수있는 가장 가까운 수를 찾아내는것 또한 500,000 에서 모든게 다 고장나고 999,999에서 시작할수도있기에 
// 브루트포스에 범위도 잘 확인해야한다.