// Date : 2020.09.08
// Title : 올바른 괄호
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : 
 
package programmers_level_2;
import java.util.*;

public class Level2_07
{
	
	public static void main(String[] args)
	{
		Solution2_07 solution2_07 = new Solution2_07();
		String [] str = {"(())","((((","))))","()()(())"};
		
		for(int i=0; i<str.length; i++)
		{
			System.out.println(solution2_07.solution(str[i]));
		}
	}
}	
	 class Solution2_07 {
	    boolean solution(String s) {
	        boolean answer = true;
	        
	        Stack<Character> st = new Stack<>();
	        
	        for(int i=0; i<s.length(); i++)
	        {
	            char temp = s.charAt(i);
	            if(temp=='(')
	            {
	                st.push(temp);
	            }
	            else
	            {
	                if(!st.isEmpty())
	                {if(st.peek()=='(')
	                    st.pop();
	                }
	                else
	                    st.push(temp);
	            }
	        }
	        
	        if(!st.isEmpty())
	            answer = false;
	        
	        
	        return answer;
	    }
	}
	
