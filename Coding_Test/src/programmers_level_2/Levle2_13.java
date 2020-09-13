// Date : 2020.09.14
// Title : 더 맵게
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Heap
 
package programmers_level_2;

import java.util.PriorityQueue;
import java.util.Queue;

public class Levle2_13
{
	public static void main(String[] args)
	{
		Solution2_13 solution = new Solution2_13();
		
		System.out.println(solution.solution(new int[] {1,2,3,9,10,12}, 7));
	}
	
}

class Solution2_13 {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        Queue<Integer> q = new PriorityQueue<Integer>();
        
        for(int num : scoville)
        	q.offer(num);
        
        while(q.size()>1)
        {
        	if(q.peek()>=K)
        		return answer;
        	
        	int num1 = q.poll();
        	int num2 = q.poll();
        	q.offer(num1 + num2 *2);
        	answer++;
        }
        
        if(q.peek()>=K)
            return answer;
        
        
        return -1;
    }
}
//힙은 데이터를 입력하면 자동으로 우선순위에 따라 정렬해주는 자료구조
//우선순위 큐는 이러한 힙을 이용하여 구현한 자료구조이다.
//이러한 힙의 성질을 고려해볼 때, PriorityQueue에서 데이터를 poll() 할때마다, 스코빌을 계산하여 offer()한다.