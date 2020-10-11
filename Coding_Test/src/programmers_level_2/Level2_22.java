// Date : 2020.10.11
// Title : 가장 큰 수
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Sorting
 
package programmers_level_2;

import java.util.Arrays;
import java.util.Comparator;

public class Level2_22
{
	public static void main(String[] args)
	{
		Solution2_22 solution2_22 = new Solution2_22();
		System.out.println(solution2_22.solution(new int [] {1,2,12,10,11,3,30}));
	}
	
}

class Solution2_22 {
    public String solution(int[] numbers) {
        String answer = "";
        
        String [] str = new String[numbers.length];
        
        for(int i=0; i<str.length; i++)
        {
            str[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(str, new Comparator<String>(){
          public int compare(String a, String b)
           {
               return (b+a).compareTo(a+b);
           }
        });
        
        if(str[0].charAt(0) == '0')
            return "0";
        else
        {
            for(String s : str)
                answer += s;
        }
        
        return answer;
    }
}

// 정말 중요한 문제인것같다.
// 우선 그냥 내림차순으로 정렬하게 되면 3과 30일때 제대로 처리가 되지않는다
// 그렇기에 두개가 더한값의 크기를 통해 비교를해야되는 중요한 문제인것같다.