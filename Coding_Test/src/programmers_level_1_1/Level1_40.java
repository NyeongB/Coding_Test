// Date : 2020.09.11
// Title : 나누어 떨어지는 숫자 배열
// Author : Choi Cheol Nyeong
// Language : Java

package programmers_level_1_1;

import java.util.*;

public class Level1_40
{
	public static void main(String[] args)
	{
		Solution1_40 solution = new Solution1_40();
		
		int [] answer = solution.solution(new int[] {2,1,3,4,1});
		
		for(int num : answer)
			System.out.print(num+" ");
	}

}

class Solution1_40 {
    public int[] solution(int[] numbers) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<numbers.length-1; i++)
        {
            for(int j=i+1; j<numbers.length; j++)
            {
                int temp = numbers[i] + numbers[j];
                if(!list.contains(temp))
                {
                    list.add(temp);
                }
            }
        }
        Collections.sort(list);
        int[] answer = new int [list.size()];
        for(int i=0; i<answer.length; i++)
        {
            answer[i] = list.get(i);
        }
        return answer;
    }
}

// Set을 이용해서 풀어보는것도 좋을것같다.