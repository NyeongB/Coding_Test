// Date : 2020.08.20
// Title : 문자열 내림차순으로 배치하기
// Author : Choi Cheol Nyeong
 
package programmers_level_1;

import java.util.Arrays;
import java.util.Collections;

public class Level1_6
{
	public static void main(String[] args)
	{
		Solution1_6 solution1_6 = new Solution1_6();
		System.out.println(solution1_6.solution("faFdAfB"));
	}
	
}



class Solution1_6 { // Collections.reverse() 는 정렬된것들만 가능함
    public String solution(String s) {
        String answer = "";
        
        String [] str = s.split("");
        
        Arrays.sort(str);
        
        Collections.reverse(Arrays.asList(str));
        
        answer = String.join("",str);   // 어레리를 다시 스트링으로
        
        return answer;
    }
}