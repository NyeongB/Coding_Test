// Date : 2020.11.09
// Title : 기능개발
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : 큐

package programmers_level_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Level2_27
{
	public static void main(String[] args)
	{

		Solution2_27 solution = new Solution2_27();
		int [] arr = solution.solution(new  int []{93,30,55}, new int[] {1,30,5});
		
		for(int n : arr)
			System.out.println(n);
	}

}

class Solution2_27
{
	  public int[] solution(int[] progresses, int[] speeds) {
	        int[] answer = {};
	        
	        ArrayList<Integer> list = new ArrayList<>();    // 초를 담을 것들 7 3 9 ... 
	        Queue<Integer> q = new LinkedList<>();
	        
	        for(int i=0; i<progresses.length; i++)
	        {
	            int total = 100 - progresses[i];
	            int day = total / speeds[i];
	            if(total % speeds[i] !=0)   // 나머지가 있다면 1을 키움 
	                day++;
	            
	            q.add(day);
	            
	        }
	        int temp = 0;
	        while(!q.isEmpty())
	        {
	            int count = 1;
	             temp = q.poll();   // 가장앞에있는거 뺌 
	            
	            if(!q.isEmpty())
	            {
	                while(temp >= q.peek() )    // 가장 최근에 것이 얘보다 작으면 성립 
	                {
	                    count++;
	                    q.poll();
	                    if(q.isEmpty()) // 예외 처리 
	                        break;
	                }
	                
	            }
	            
	            list.add(count);
	        }
	        
	        answer = new int[list.size()];
	        
	        int index = 0;
	        
	        for(int num : list)
	            answer[index++] = num;
	        
	        return answer;
	    }
	}