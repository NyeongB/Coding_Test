// Date : 2020.11.10, 20.11.29
// Title : JadenCase 문자열
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : String

package programmers_level_2;

public class Level2_29
{
	public static void main(String[] args)
	{

		Solution2_29 solution = new Solution2_29();
		System.out.println(solution.solution("12kk kor   bb  abc"));

	}

}

class Solution2_29
{
	 public String solution(String s) {
	        String answer = "";
	        boolean flag = true;    // 첫번째 대문자로 변경하기위해 true로 넣고 ' '만날때 트루
	        s = s.toLowerCase();
	        
	        for(int i=0; i<s.length(); i++)
	        {
	            char temp = s.charAt(i);
	            if(temp==' ')
	            {
	                flag = true;
	                answer += ' ';  // 공백을 만날때마다 다음 문자는 대문자가됨
	                continue;
	            }
	            
	            if(flag)
	            {
	                if(!Character.isDigit(temp))
	                    temp = (char)(temp - 32);
	                flag = false;   // 한번 대문자로 만들고 그다음부턴 공백만나기전까지 소문자
	            }
	            
	            answer += temp;
	        }
	        
	        return answer;
	    }
}

// 처음에 매개변수로 받은 문자열에 스플릿으로 접근해봤는데 안됐다
// 이유는 공백문자열이 여러군대 들어갈수있기때문에
// 하나하나 바꿔줘야한다..