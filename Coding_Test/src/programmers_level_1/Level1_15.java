
// Date : 2020.08.20
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

class Solution1_15 {
    public int solution(int n) {
        int answer = 0;

        String num = "" + n;
        
        for(int i=0; i<num.length(); i++)
        {
            answer += num.charAt(i)-'0';
        }

        return answer;
    }
}
