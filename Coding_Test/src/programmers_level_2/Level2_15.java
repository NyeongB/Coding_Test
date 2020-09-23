// Date : 2020.09.23
// Title : 짝지어 제거하기
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Stack
 
package programmers_level_2;

import java.util.Stack;

public class Level2_15
{
	public static void main(String[] args)
	{
		Solution2_15 solution2_15 = new Solution2_15();
		System.out.println(solution2_15.solution("abbaccabba"));
	}
	
}

class Solution2_15
{
    public int solution(String s)
    {
        int answer = 0;
        
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<s.length(); i++)
        {
            char temp = s.charAt(i);
            if(st.isEmpty())
            {
                st.push(temp);
            }
            else if(st.peek() == temp)
            {
                st.pop();
            }
            else
            {
                st.push(temp);
            }
        }
        
        if(st.isEmpty())
            answer = 1;
    

        return answer;
    }
}

// 스택을 바로 생각했다면 쉽게 접근할수있는 문제