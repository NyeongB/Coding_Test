// Date : 2020.11.10
// Title : 조이스틱
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : 그리디

package programmers_level_2;


public class Level2_28
{
	public static void main(String[] args)
	{

		Solution2_28 solution = new Solution2_28();
		System.out.println(solution.solution("JEROEN"));
		
	}

}

class Solution2_28
{
	  public int solution(String name) {
	        int answer = 0;
	        int len = name.length();
	        String str ="";
	        for(int i=0; i<len; i++)
	            str += "A";
	        
	        int count = 0;
	        int i = 0; // 현재 인덱스
	        
	        while(true)
	        {
	            
	            if(name.charAt(i) == 'A')
	                continue;
	            
	            char temp1 = str.charAt(i);     // A인값
	            char temp2 = name.charAt(i);    // 목표값
	            
	            int alpha1 = temp2 - temp1; // A - J
	            int alpha2 = 'Z' + 1 - temp2; // Z + 1 - J
	            
	            if(alpha1<=alpha2)
	            {
	                count += alpha1;
	            }
	            else
	                count += alpha2;
	            
	            StringBuilder sb = new StringBuilder(str);
	            sb.setCharAt(i,temp2);
	            str = sb.toString();
	            //System.out.println(str);
	            if(str.equals(name))
	                break;
	            
	            
	            
	            
	            // 커서 이동 효율 좋은 쪽으로
	            int index = i+1; // 다음 커서
	            while(name.charAt(index)=='A')
	                index++;
	            
	            int cursor1 = index - i;
	            int cursor2 = len + i - index;
	            //System.out.println(cursor2);
	            if(cursor1<=cursor2)
	                count += cursor1;
	            else
	                count += cursor2;
	            
	            i = index;
	            
	            
	        }
	        
	        
	        return count;
	    }
	}

// 이거 원인 꼭 발혀낸다 4,7,8  11(시간초과)