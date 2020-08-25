// Date : 2020.08.25
// Title : 핸드폰 번호 가리기
// Author : Choi Cheol Nyeong
// Language : Java
 
package programmers_level_1_1;

public class Level1_29
{
	public static void main(String[] args)
	{
		Solution1_29 solution1_29 = new Solution1_29();
		String str = solution1_29.solution("01099659257");
		System.out.println(str);
	}
	
}

class Solution1_29 {
    public String solution(String phone_number) {
        String answer = "";
        
        int totalNum = phone_number.length();
        for(int i=0; i<totalNum-4; i++)
        {
            answer+="*";
        }
        return answer+phone_number.substring(totalNum-4,totalNum);
    }
}