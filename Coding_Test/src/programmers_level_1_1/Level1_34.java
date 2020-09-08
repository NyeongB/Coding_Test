// Date : 2020.09.08
// Title : 크레인 인형뽑기 게임
// Author : Choi Cheol Nyeong
// Language : Java

package programmers_level_1_1;

import java.util.*;

public class Level1_34
{
	public static void main(String[] args)
	{
		int [][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int [] moves = {1,5,3,5,1,2,1,4};
		
		Solution1_34 solution1_34 = new Solution1_34();
		System.out.println(solution1_34.solution(board, moves));
		
	}

}

class Solution1_34
{

	static int[][] temp;

	public int solution(int[][] board, int[] moves)
	{
		int answer = 0;
		temp = board;

		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < moves.length; i++)
		{
			int num = get(moves[i]);
			//System.out.println(num);
			if (num != 0)
			{
				if (!st.isEmpty())
				{
					if (st.peek() == num)
					{
						st.pop();
						answer += 2;
					} else
						st.push(num);
				} else
					st.push(num);
			}

		}

		return answer;
	}

	public int get(int n)
	{
		int result = 0;

		for (int i = 0; i < temp.length; i++)
		{
			if (temp[i][n - 1] != 0)
			{
				int num = temp[i][n - 1];
				temp[i][n - 1] = 0;
				return num;
			}
		}

		return result;
	}
}

// ※교훈 문제를 잘 읽자...
// 터진 인형의 갯수인데 엄하게 남은 인형인줄알고...
// 문제를 잘 읽자... 