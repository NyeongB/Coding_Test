// Date : 2020.09.11
// Title : 나누어 떨어지는 숫자 배열
// Author : Choi Cheol Nyeong
// Language : Java

package programmers_level_1_1;

import java.util.*;

public class Level1_39
{
	public static void main(String[] args)
	{
		Solution1_39 solution = new Solution1_39();
		
		int [] answer = solution.solution(new int[] {5, 9, 7, 10},5);
		
		for(int num : answer)
			System.out.print(num+" ");
	}

}

class Solution1_39 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = new int [arr.length];
        
        int count = 0;
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]%divisor == 0)
            {
                count++;
                answer[i] = arr[i];
            }
        }
        
        if(count==0)
            return new int[]{-1};
        
        Arrays.sort(answer);
        
        int [] result = new int [count];
        
        for(int i=0; i<count; i++)
        {
            result[i] = answer[arr.length - count +i];  // 오름 차순 정렬했을때 앞의 0을 제외한 시작부 arr 크기 - count 부터 배열 시작 
        }
        
        return result;
    }
}