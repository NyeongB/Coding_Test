// Date : 2020.08.24
// Title : 이상한 문자 만들기
// Author : Choi Cheol Nyeong
 
package programmers_level_1;

public class Level1_19
{
	public static void main(String[] args)
	{
		Solution1_19 solution1_19 = new Solution1_19();
		System.out.println(solution1_19.solution("try hello world"));
	}
	
}

class Solution1_19 {
    public String solution(String s) {
        String answer = "";
        int flag=-1;
        for(int i=0; i<s.length(); i++)
        {
            char temp = s.charAt(i);
            flag++;
            if(temp==' ')
            {
                answer+=" ";
                flag = -1;
            }
            else
            {
                if(flag%2==0)
                    answer+=Character.toUpperCase(temp);
                else
                    answer+=Character.toLowerCase(temp);
            }
        }
        
        return answer;
    }
}