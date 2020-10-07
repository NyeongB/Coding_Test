// Date : 2020.10.07
// Title : 위장
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Hash

package programmers_level_2;

import java.util.HashMap;

public class Level2_20
{
	public static void main(String[] args)
	{
		Solution2_20 solution2_20 = new Solution2_20();
		int num = solution2_20.solution(
				new String[][] {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}});
		
		System.out.println(num);
	}

}

class Solution2_20
{
	public int solution(String[][] clothes)
	{
		int answer = 1;

		HashMap<String, Integer> hm = new HashMap<>();

		for (int i = 0; i < clothes.length; i++)
		{
			if (hm.get(clothes[i][1]) == null)
				hm.put(clothes[i][1], 1);
			else
				hm.put(clothes[i][1], hm.get(clothes[i][1]) + 1);
		}

		for (String str : hm.keySet())
		{
			answer *= (hm.get(str) + 1);
		}

		return answer - 1;
	}
}


// 해쉬맵을 이용해야 하는 경우의수 문제
// 처음 보자마자 어떻게 접근해야 되는줄은 알았다.
// 각각의 옷들의 수로 만들 수 있는 조합문제로 접근하여
// 테스트 케이스 두개만 통과하였는데.. 3가지 4가지 경우를 생각안한것이다.
// 후에 블로그를 참고하여 경우의수 공식을 보고 문제를 해결하였다.