// Date : 2020.09.08
// Title : 
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : 
 
package programmers_level_2;

import java.util.Arrays;

public class Level2_14
{
	public static void main(String[] args)
	{
		Solution2_14 solution2_14 = new Solution2_14();
		System.out.println(solution2_14.solution(new int [] {50 , 50, 80, 70 }, 100));
	}
	
}

class Solution2_14 {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        
        int j = 0;
        
        for(int i = people.length - 1; j<=i; i--)
        {
            if(people[i] + people[j] <=limit)
            {
                answer++;
                j++;
            }
            else
            {
                answer++;
            }
        }
        return answer;
    }
}