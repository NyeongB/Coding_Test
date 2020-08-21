// Date : 2020.08.20
// Title : 서울에서 김서방 찾기
// Author : Choi Cheol Nyeong
 
package programmers_level_1;

public class Level1_03
{
	public static void main(String[] args)
	{
		Solution1_3 solution1_3 = new Solution1_3();
		
		String [] str = {"Jane", "Kim"};
		
		System.out.println(solution1_3.solution(str));
	}
	
}

class Solution1_3 {
    public String solution(String[] seoul) {
        String answer = "";
        
        for(int i=0; i<seoul.length; i++)
        {
            if(seoul[i].equals("Kim"))
            {   answer ="김서방은 "+i+"에 있다";
                }
        }
        
        return answer;
    }
}