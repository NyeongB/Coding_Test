// Date : 2020.09.11 , 20.09.26
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
	        
	        int temp = arr[0];
	        ArrayList<Integer> list = new ArrayList<Integer>();
	        list.add(temp);
	        for(int i=1; i<arr.length; i++)
	        {
	            if(arr[i]!=temp)
	            {
	                temp = arr[i];
	                list.add(temp);
	            }
	        }
	        
	        int [] answer = new int[list.size()];
	        
	        for(int i=0; i<answer.length; i++)
	            answer[i] = list.get(i);
	            
	        
	        

	        return answer;
	    }
	  /*
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
    */
}