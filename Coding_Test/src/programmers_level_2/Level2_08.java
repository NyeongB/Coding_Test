// Date : 2020.09.09
// Title : 최댓값과 최솟값
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : basic
 
package programmers_level_2;
import java.util.*;

public class Level2_08
{
	
	public static void main(String[] args)
	{
		Solution2_08 solution2_08 = new Solution2_08();
		
		String s = "-1 -2 -3 -4";
		System.out.println(solution2_08.solution(s));
		
	}
}	
	 

class Solution2_08 {
    public String solution(String s) {
        String answer = "";
        
        String [] str = s.split(" ");
        
        int [] arr = new int[str.length];
        
        for(int i=0; i<str.length; i++)
        {
            arr[i] = Integer.parseInt(str[i]);
        }
        
        Arrays.sort(arr);
        
        answer = ""+ arr[0];
        answer += " " + arr[str.length-1];
        
        return answer;
    }
}	
