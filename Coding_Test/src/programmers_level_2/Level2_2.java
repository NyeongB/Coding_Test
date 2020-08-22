// Date : 2020.08.22
// Title : 124 나라의 숫자
// Author : Choi Cheol Nyeong
 
package programmers_level_2;

public class Level2_2
{
	public static void main(String[] args)
	{
		Solution2_2 solution2_2 = new Solution2_2();
		
		System.out.println(solution2_2.solution(10));
	}
	
}

class Solution2_2 {
    public String solution(int n) {
        String answer = "";
        
        while(n > 0)
        {
          int  r = n % 3;
           n = n / 3;
            
            if(r==0)
            {
                r = 4;
                n--;
            }
            
            answer = r + answer;
        }
        
        return answer;
    }
}