// Date : 2020.08.24
// Title : 콜라츠 추측
// Author : Choi Cheol Nyeong
// Language : Java
 
package programmers_level_1_1;

public class Level1_24
{
	public static void main(String[] args)
	{
		Solution1_24 solution1_24 = new Solution1_24();
		System.out.println(solution1_24.solution(626331));
	}
	
}

class Solution1_24 {
    public int solution(long num) {
        int answer = 0;
        
        
        while(num!=1)
        {
            if(answer==500)
                return -1;
            if(num%2==0)
                num /=2;
            else
                num = num*3 +1;
            answer++;
            
        }
        
        return answer;
    }
}