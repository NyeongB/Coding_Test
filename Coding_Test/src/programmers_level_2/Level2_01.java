// Date : 2020.08.22
// Title : 큰 수 만들기
// Author : Choi Cheol Nyeong
 
package programmers_level_2;

import java.util.ArrayList;
import java.util.List;

public class Level2_01
{
	public static void main(String[] args)
	{
		String test1 = "1924";	// k 2
		String test2 = "1231234";	// k 3
		char ch = '9';
		//test1.replace(0, 0);
		//System.out.println(ch-'0');
		Solution solution = new Solution();
		System.out.println(solution.solution(test2, 3));
	}
	
}


class Solution {
    public String solution(String number, int k) {
        String answer = "";
        int len = number.length();
        int n = len-k;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=n; i>0; i--)
        {
            int max = 0;
            int index=0;
            String temp="";
            for(int j=0; j<len-i+1; j++)
            {
                if(max<number.charAt(j)-'0')
                {
                	max = number.charAt(j)-'0';
                    index = j;
                }
            }
            //System.out.println(number);
           for(int j=0; j<=index; j++)
           {
        	   temp +=0;
        	//  number = number.replace(number.charAt(j), '0');
           }
           for(int j=index+1; j<len; j++)
           {
        	   temp +=number.charAt(j);
           }
           number = temp;
          
           list.add(max);
          // System.out.printf("%d번째 맥스값 %d\n",i,max);
        }
        
        for(int i=0; i<list.size(); i++)
        {
        	//System.out.println(list.get(i));
        	answer +=list.get(i);
        }
        //System.out.println(answer);
        return answer;
    }
}

