// Date : 2020.08.20
// Title : 문자열을 정수로 바꾸기
// Author : Choi Cheol Nyeong
 
package programmers_level_1;

public class Level1_05
{
	public static void main(String[] args)
	{
		Solution1_5 solution1_5 = new Solution1_5();
		System.out.println(solution1_5.solution("+55431"));
	}
	
}

class Solution1_5 {
    public int solution(String s) {
        int answer = 0;
        boolean flag = true;
        
        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)=='-')
                flag = false;
            else if(s.charAt(i)!='+')
                answer = answer*10 + s.charAt(i) - '0';
        }
        
        // Integer.parseInt() 를 이용하면 음수건 양수건 고대로 변환이 가능하긴함
        
        return flag==false ? -1*answer : answer;
    }
}