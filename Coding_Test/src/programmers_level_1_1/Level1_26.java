// Date : 2020.08.25
// Title : 평균 구하기
// Author : Choi Cheol Nyeong
// Language : Java
 
package programmers_level_1_1;

public class Level1_26
{
	public static void main(String[] args)
	{
		Solution1_26 solution1_26 = new Solution1_26();
		System.out.println(solution1_26.solution(new int[] {1,2,3,5}));
	}
	
}

class Solution1_26 {
    public double solution(int[] arr) {
        double answer = 0;
        
        for(int i=0; i<arr.length; i++)
            answer +=arr[i];
        
        return answer/arr.length;
    }
}