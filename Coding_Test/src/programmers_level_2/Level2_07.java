// Date : 2020.09.08, 20.11.11, 20.11.29
// Title : 올바른 괄호
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Stack

package programmers_level_2;

import java.util.*;

public class Level2_07
{

	public static void main(String[] args)
	{
		Solution2_07 solution2_07 = new Solution2_07();
		String[] str =
		{ "(())", "((((", "))))", "()()(())" };

		for (int i = 0; i < str.length; i++)
		{
			System.out.println(solution2_07.solution(str[i]));
		}
	}
}

class Solution2_07
{
	  boolean solution(String s) {
	        boolean answer = true;

	        Stack<Integer> st = new Stack<>();		// 아무거나 들어있는지 없는지 유무라 Integer로 해봤다
	        
	        char [] arr = s.toCharArray();
	        
	        for(int i=0; i<arr.length; i++)
	        {
	            if(arr[i] =='(')
	                st.push(0);
	            else
	            {
	                
	                
	                if(st.isEmpty())
	                {
	                    answer = false;
	                    break;
	                }
	                
	                if(arr[i]==')')
	                    st.pop();
	            }
	        }
	        
	        if(!st.isEmpty())
	            answer = false;

	        return answer;
	    }
}