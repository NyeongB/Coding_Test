// Date : 2020.08.25
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
        String str = "" + x;
        int num = 0;
        for(int i=0; i<str.length(); i++)
            num += str.charAt(i) - '0';
        
        if(x%num!=0)
            answer = false;
        
        return answer;
    }
}