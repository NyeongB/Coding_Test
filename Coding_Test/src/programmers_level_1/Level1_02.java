// Date : 2020.08.20
// Title : 수박수박수박수박수박수?
// Author : Choi Cheol Nyeong
 
package programmers_level_1;

public class Level1_02
{
	public static void main(String[] args)
	{
		Solution1_2 solution = new Solution1_2();
		
		System.out.println(solution.solution(4));
	}
	
}

class Solution1_2 {
    public String solution(int n) {
        String answer = "";
        
        for(int i=0; i<n; i++)
            answer += i%2==0 ? "수" : "박";
        
        return answer;
    }
}