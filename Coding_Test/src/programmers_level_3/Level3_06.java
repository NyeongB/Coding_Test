// Date : 2020.10.24
// Title : N으로 표현
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Heap

package programmers_level_3;

import java.util.Collections;
import java.util.PriorityQueue;

public class Level3_06
{

	public static void main(String[] args)
	{
		Solution3_06 solution3_06 = new Solution3_06();
		System.out.println(solution3_06.solution(5, 12));
	}

}
class Solution3_06 {
    
    static int answer= -1;
    static int number;
    static int N;
    
    public int solution(int N, int number) {
        
        this.number = number;
        this.N = N;
        
        recursion(0,0);
        return answer;
    }
    
    public void recursion(int count, int result)
    {
        int n = N;
        if(count>8)
        {
            answer = -1;
            return;
        }   
        
        if(result == number)
        {
            if(answer == -1 || answer > count)
            {
                answer = count;
            }
            return;
        }
        
        for(int i=1; i<9-count; i++)
        {
            recursion(count+i, result + n);
            recursion(count+i, result * n);
            recursion(count+i, result / n);
            recursion(count+i, result - n);
            
            n = n *10 + N;
        }
        
    }
}

// 재귀로 접근
// 5, 55, 555로 가는게 중요
// count가 8보다 크면 전부 -1