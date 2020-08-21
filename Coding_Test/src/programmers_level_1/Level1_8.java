// Date : 2020.08.20
// Title : 시저 암호
// Author : Choi Cheol Nyeong
 
package programmers_level_1;

public class Level1_8
{
	public static void main(String[] args)
	{
		Solution1_8 solution1_8 = new Solution1_8();
		System.out.println(solution1_8.solution("b c B F d", 26));
	}
	
}

class Solution1_8 {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++)
        {
            if( (s.charAt(i)>=65&&s.charAt(i)<=90)&&s.charAt(i)+n>90 )
            {
                answer+=(char)(s.charAt(i)+n-90+64);
                continue;
            }
            else if((s.charAt(i)>=97&&s.charAt(i)<=122)&&s.charAt(i)+n>122 )
            {
                answer+=(char)(s.charAt(i)+n-122+96);
                continue;
            }
            else if(s.charAt(i)==' ')
            {    answer+=' ';
                continue;
            }
            
           answer+= (char)(s.charAt(i) + n);
        }
        
        return answer;
    }
   
}