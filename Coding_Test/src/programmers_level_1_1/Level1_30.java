// Date : 2020.08.25, 20.11.08
// Title : 하샤드 수
// Author : Choi Cheol Nyeong
// Language : Java
 
package programmers_level_1_1;

public class Level1_30
{
	public static void main(String[] args)
	{
		Solution1_30 solution1_30 = new Solution1_30();
		System.out.println(solution1_30.solution(11));
		System.out.println(solution1_30.solution(18));
	}
	
}

class Solution1_30 {
	   public boolean solution(int x) {
	        boolean answer = true;
	        
	        int num = x;
	        int total = 0;
	        
	        while(x>0)
	        {
	            total += x%10;
	            x /=10;
	        }
	        
	        if((num%total)!=0)
	            answer = false;
	        
	        return answer;
	    }
	}