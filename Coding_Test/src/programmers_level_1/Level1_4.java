// Date : 2020.08.20
// Title : 약수의 합
// Author : Choi Cheol Nyeong
 
package programmers_level_1;

public class Level1_4
{
	public static void main(String[] args)
	{
		Solution1_4 solution1_4 = new Solution1_4();
		System.out.println(solution1_4.solution(12));
	}
	
}

class Solution1_4 {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=1; i<=n; i++)
        {
            if(n%i==0)
                answer += i;
        }
        
        return answer;
    }
}