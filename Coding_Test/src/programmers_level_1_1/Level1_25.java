// Date : 2020.08.25
// Title : x만큼 간격이 있는 n개의 숫자
// Author : Choi Cheol Nyeong
// Language : Java
 
package programmers_level_1_1;

public class Level1_25
{
	public static void main(String[] args)
	{
		Solution1_25 solution1_25 = new Solution1_25();

		long [] result = solution1_25.solution(2, 5);
		
		for(int i=0; i<result.length; i++)
			System.out.print(result[i]+" ");
		
	}
	
}

class Solution1_25 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i=0; i<n; i++)
        {
            if(i==0)
                answer[i] = x;
            else
                answer[i] = answer[i-1] + x;
        }
        
        return answer;
    }
}