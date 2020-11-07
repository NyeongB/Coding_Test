// Date : 2020.08.20, 20.11.07
// Title : 자릿수 더하기
// Author : Choi Cheol Nyeong

package programmers_level_1;

public class Level1_15
{
	public static void main(String[] args)
	{
		Solution1_15 solution1_15 = new Solution1_15();
		System.out.println(solution1_15.solution(129));
	}

}

class Solution1_15
{

	public int solution(int n)
	{
		int answer = 0;

		while (n > 0)
		{
			answer += n % 10;
			n /= 10;
		}

		return answer;
	}
}

// 기존 코드가 7.08ms 걸린다면 이코드는 0.02 ms 걸린다.
// 문제를 푸는것만이 능사가 아닌 코드 효율을 본다