// Date : 2020.08.24
// Title : 자연수 뒤집어 배열로 만들기
// Author : Choi Cheol Nyeong

package programmers_level_1;

public class Level1_20
{
	public static void main(String[] args)
	{
		Solution1_20 solution1_20 = new Solution1_20();
		int [] arr = solution1_20.solution(12345);
		
		for(int i=0; i<arr.length; i++)
			System.out.print(arr[i]);
	}

}

class Solution1_20
{
	public int[] solution(long n)
	{
		String str = "" + n;
		int num = str.length();
		int[] answer = new int[num];
		int index = 0;
		for (int i = num - 1; i >= 0; i--)
		{
			answer[index++] = str.charAt(i) - '0';
		}
		return answer;
	}
}