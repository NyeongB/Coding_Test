// Date : 2020.10.12
// Title : 3진법 뒤집기
// Author : Choi Cheol Nyeong
// Language : Java

package programmers_level_1_1;


public class Level1_41
{
	public static void main(String[] args)
	{
		
		Solution1_41 solution1_41 = new Solution1_41();
		System.out.println(solution1_41.solution(45));
	}

}

class Solution1_41 {
    public int solution(int n) {
        int answer = 0;
        
        String str = "";
        
        while(n>0)
        {
            int r = n%3;
            n = n / 3;
            str = r + str;
        }
        //System.out.println(str);
        
        for(int i=0; i<str.length(); i++)
        {
            answer += Math.pow(3,i) * (str.charAt(i) - '0');
        }
        
        return answer;
    }
}

// 기본적인 진법문제