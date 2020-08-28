// Date : 2020.08.27
// Title : H-Index
// Author : Choi Cheol Nyeong
// Language : Java
 
package programmers_level_2;

import java.util.Arrays;

public class Level2_05
{
	public static void main(String[] args)
	{
		Solution2_5 solution2_5 = new Solution2_5();
		System.out.println(solution2_5.solution(new int[] {3,0,6,1,5}));
	}
	
}


class Solution2_5 {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        int n = citations.length;
        int h = 0;
        
        for(int i=0; i<n; i++)
        {
            h = n - i;
            if(citations[i]>=h)
            {
                answer = h;
                break;
            }
        }
        
        return answer;
    }
}