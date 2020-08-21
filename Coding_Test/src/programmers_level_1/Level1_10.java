// Date : 2020.08.21
// Title : 문자열 내 마음대로 정렬하기
// Author : Choi Cheol Nyeong
 
package programmers_level_1;

import java.util.ArrayList;
import java.util.Collections;

public class Level1_10
{
	public static void main(String[] args)
	{
		String [] strings = {"sun", "bed", "car"};
		Solution1_10 solution1_10 = new Solution1_10();
		String [] answers = solution1_10.solution(strings, 1);
		for(int i=0; i<answers.length; i++)
		{
			System.out.println(answers[i]);
		}
		
	}
	
}


class Solution1_10 {
    public String[] solution(String[] strings, int n) {
    	
        
        ArrayList<String> list = new ArrayList<String>();
        
        for(int i=0; i<strings.length; i++)
        {
            list.add(strings[i].substring(n,n+1)+strings[i]);
        }
        
        Collections.sort(list);
        String[] answer = new String[list.size()];
        for(int i=0; i<list.size(); i++)
        {
            answer[i] = list.get(i).substring(1,list.get(i).length());
        }
        
        return answer;
    }
}