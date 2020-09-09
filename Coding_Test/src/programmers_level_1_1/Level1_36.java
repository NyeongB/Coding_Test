// Date : 2020.09.09
// Title : 키패드 누르기
// Author : Choi Cheol Nyeong
// Language : Java

package programmers_level_1_1;

import java.util.*;

public class Level1_36
{
	public static void main(String[] args)
	{
		int[] numbers =
		{ 1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5 };
		String hand = "left";
		Solution1_36 solution1_34 = new Solution1_36();

		System.out.println(solution1_34.solution(numbers, hand));
	}

}

class Solution1_36
{
	public String solution(int[] numbers, String hand)
	{
		String answer = "";

		// 위치 좌표 초기화
		HashMap<String, XY> hm = new HashMap<String, XY>();
		hm.put("1", new XY(0, 0));
		hm.put("2", new XY(0, 1));
		hm.put("3", new XY(0, 2));
		hm.put("4", new XY(1, 0));
		hm.put("5", new XY(1, 1));
		hm.put("6", new XY(1, 2));
		hm.put("7", new XY(2, 0));
		hm.put("8", new XY(2, 1));
		hm.put("9", new XY(2, 2));
		hm.put("*", new XY(3, 0));
		hm.put("0", new XY(3, 1));
		hm.put("#", new XY(3, 2));

		String nowL = "*"; // 첫 시작 손가락 위치
		String nowR = "#";

		for (int i = 0; i < numbers.length; i++)
		{
			int num = numbers[i];
			if (num == 1 || num == 4 || num == 7) // 특정 숫자는 특정 손가락으로 밖에 쓸수없기때문에
			{
				answer += "L";
				nowL = "" + num;
				continue;

			} else if (num == 3 || num == 6 || num == 9)
			{
				answer += "R";
				nowR = "" + num;
				continue;

			}

			String s = "" + num; // 가야될 위치와 좌,우 엄치 손가락의 현재 위치중 가까운것을 비교
			int x = hm.get(s).x;
			int y = hm.get(s).y;

			int xL = hm.get(nowL).x;
			int yL = hm.get(nowL).y;

			int xR = hm.get(nowR).x;
			int yR = hm.get(nowR).y;

			int l = Math.abs(x - xL) + Math.abs(y - yL);
			int r = Math.abs(x - xR) + Math.abs(y - yR);
			// System.out.println("i :"+i+" l " + l + " r "+r);
			if (l == r)
			{
				// System.out.println("x " + x + " y "+y);
				if (hand.equals("left"))
				{
					answer += "L";
					nowL = "" + num;
				} else
				{
					answer += "R";
					nowR = "" + num;
				}
			} else if (l < r)
			{
				answer += "L";
				nowL = "" + num;
			} else if (l > r)
			{
				answer += "R";
				nowR = "" + num;
			}
		}
		return answer;
	}
}

class XY
{
	int x, y;

	public XY(int x, int y)
	{
		this.x = x;
		this.y = y;
	}
}

// 레벨 1이지만 카카오 문제라 까다롭다.
// 위치에 대한 좌표로 접근하고 해당 키, 밸류를 해쉬맵을 사용하였지만 다른 방법도 고민하면 좋을것같다. 