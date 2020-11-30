// Date : 2020.11.16, 20.11.30
// Title : 가장 큰 수
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : 정렬

package programmers_level_2;

import java.util.Arrays;
import java.util.Comparator;

public class Level2_31
{
	public static void main(String[] args)
	{

		Solution2_31 solution = new Solution2_31();
		System.out.println(solution.solution(new int[] {6,10,2}));
	}

}

class Solution2_31
{
	 public String solution(int[] numbers) {
	        String answer = "";
	        int len = numbers.length;
	        String [] str_numbers = new String[len];
	        
	        for(int i=0; i<len; i++)
	        {
	            //str_numbers[i] = "" + numbers[i];
	        	str_numbers[i] = String.valueOf(numbers[i]);	// 기존 거랑 이거빼고 완벽하게 일치함 
	        }
	        
	        Arrays.sort(str_numbers,new Comparator<String>(){
	           @Override
	            public int compare(String s1, String s2)
	            {
	                return (s2+s1).compareTo(s1+s2);	// 2,3 이있을때 32.compreTo(23) 이렇게 됨 그래서 양수라서 스왑
	            }
	        });
	        
	        // 이거 안해줘서 틀림
	        if(str_numbers[0].equals("0"))
	            return "0";
	        
	        
	        for(String s : str_numbers)
	            answer += s;
	        
	        return answer;
	    }
}