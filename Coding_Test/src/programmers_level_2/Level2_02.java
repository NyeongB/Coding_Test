// Date : 2020.08.22, 20.11.03
// Title : 124 나라의 숫자
// Author : Choi Cheol Nyeong
 
package programmers_level_2;

public class Level2_02
{
	public static void main(String[] args)
	{
		Solution2_2 solution2_2 = new Solution2_2();
		
		System.out.println(solution2_2.solution(10));
	}
	
}

class Solution2_2 {
public String solution(int n) {
        
        String [] arr = new String[]{"4", "1", "2"};	// String 과 int 결합에서 시간초과 나서
        
        String answer = "";
        
        while(n>0)
        {
            int r = n % 3;
            n = n / 3;
            if(r == 0)
            {
                n--;
            }
            
            answer = arr[r] + answer;
        }
        return answer;
    }
}