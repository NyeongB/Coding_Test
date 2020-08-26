// Date : 2020.08.26
// Title : 예산
// Author : Choi Cheol Nyeong
// Language : Java
 
package programmers_level_1_1;

import java.util.Arrays;

public class Level1_31
{
	public static void main(String[] args)
	{
		Solution1_31 solution1_31 = new Solution1_31();
		System.out.println(solution1_31.solution(new int[] {1,3,2,4,5}, 9));
	}
	
}

class Solution1_31 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        Arrays.sort(d); // 오름차순 정렬
        
        for(int i=0; i<d.length; i++)
        {
            if(budget-d[i]>=0)
            {
                budget -= d[i]; 
                answer++;
            }
            else
                break;
        }
        
        return answer;
    }
}