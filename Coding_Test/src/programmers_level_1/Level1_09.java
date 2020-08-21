// Date : 2020.08.21
// Title : 문자열 내 p와 y의 개수
// Author : Choi Cheol Nyeong
 
package programmers_level_1;

public class Level1_09
{
	public static void main(String[] args)
	{
		Solution1_9 solution1_9 = new Solution1_9();
		System.out.println(solution1_9.solution("PPYYPYPPYY"));
	}
	
}

class Solution1_9 {
    boolean solution(String s) {
        boolean answer = true;
        
        int count = 0;
        
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch=='p' || ch=='P')
                count++;
            else if(ch=='y' || ch=='Y')
                count--;
        }
        if(count!=0)
            answer = false;

        return answer;
    }
}