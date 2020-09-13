// Date : 2020.09.11
// Title : 같은 숫자는 싫어
// Author : Choi Cheol Nyeong
// Language : Java

package programmers_level_1_1;

import java.util.*;

public class Level1_38
{
	public static void main(String[] args)
	{
		Solution1_38 solution1_38 = new Solution1_38();
		
		int [] answer = solution1_38.solution(new int[] {1,1,3,3,0,1,1});
		
		for(int num : answer)
			System.out.print(num+" ");
	}

}

class Solution1_38 {
    public int[] solution(int []arr) {
        
        LinkedList<Integer> q = new LinkedList<>();
        
        for(int num : arr)
        {
            if(q.isEmpty())
            {
                q.offer(num);
            }
            else if(q.peekLast()!=num)
            {
                q.offer(num);
            }
        }
        
        int[] answer = new int[q.size()];
        
        int len = q.size();
        
        for(int i=0; i<len; i++)
        {
            answer[i] = q.poll();
        }
        
        return answer;
    }
}