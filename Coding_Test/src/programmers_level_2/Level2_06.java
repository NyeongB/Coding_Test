// Date : 2020.08.28
// Title : 프린터
// Author : Choi Cheol Nyeong
// Language : Java
 
package programmers_level_2;

import java.util.Collections;
import java.util.PriorityQueue;

public class Level2_06
{
	public static void main(String[] args)
	{
		Solution2_06 solution2_06 = new Solution2_06();
		System.out.println(solution2_06.solution(new int[] {1,1,9,1,1,1},0));
	}
	
}
class Solution2_06 {
    public int solution(int[] priorities, int location) {
        int answer = 1;
        
        PriorityQueue p = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int n : priorities)
        {
            p.add(n);
        }
        
        while(!p.isEmpty())
        {
            for(int i=0; i<priorities.length; i++)
            {
                if(priorities[i]==(int)p.peek())
                {
                    if(location==i)
                        return answer;
                    p.poll();
                    answer++;
                }
            }
        }
        
        return answer;
    }
}