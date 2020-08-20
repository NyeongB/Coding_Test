/*
 * Date : 2020.08.20
 * Title : 소수 찾기
 * Author : Choi Cheol Nyeong
 * */
package programmers_level_1;

public class Level1_1
{
	public static void main(String[] args)
	{
		Solution solution = new Solution();
		
		System.out.println(solution.solution(5));
	}
	
}

class Solution {
    
    public int solution(int n) {
        int answer = 0;
        
        for(int i=2; i<=n; i++)
        {
        	if(checkPrimeNumber(i))
        		answer++;
        }
        
        return answer;
    }
    
    
    
    public boolean checkPrimeNumber(int n)
    {
    	
    	for(int i=2; i<=Math.sqrt(n); i++)
    	{
    		if(n%i==0)
    			return false;
    	}
    	
    	return true;
    }
    
}
