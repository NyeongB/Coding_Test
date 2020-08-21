// Date : 2020.08.21
// Title : 가운데 글자 가져오기
// Author : Choi Cheol Nyeong
 
package programmers_level_1;

public class Level1_11
{
	public static void main(String[] args)
	{
		Solution1_11 solution1_11 = new Solution1_11();
		System.out.println(solution1_11.solution("abcd"));
	}
	
}

class Solution1_11 {
    public String solution(String s) {
        String answer = "";
        
        int len = s.length();
        int mid = len/2;
        
        if(len%2==0)
        {
            answer = s.substring(mid-1,mid+1);
        }
        else
        {
            answer = s.substring(mid,mid+1);
        }
        
        return answer;
    }
}