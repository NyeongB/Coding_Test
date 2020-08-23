// Date : 2020.08.22
// Title : 순열 검사
// Author : Choi Cheol Nyeong
 
package programmers_level_1;

import java.util.Arrays;

public class Level1_16
{
	public static void main(String[] args)
	{
		Solution1_16 solution1_16 = new Solution1_16();
		
		int [] arr1 = {1,2,4,3};
		int [] arr2 = {4,2,1};
		
		System.out.println(solution1_16.solution(arr1));
		System.out.println(solution1_16.solution(arr2));
	}
	
}

class Solution1_16 {
    public boolean solution(int[] arr) {
        boolean answer = true;
        int num=1;
        Arrays.sort(arr);
        
        for(int i=0; i<arr.length; i++)
        {
            if(num++==arr[i])
                continue;
            else
                return false;
        }

        return answer;
    }
}