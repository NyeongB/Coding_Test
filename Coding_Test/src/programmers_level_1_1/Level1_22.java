// Date : 2020.08.24
// Title : 제일 작은 수 제거하기
// Author : Choi Cheol Nyeong
// Language : Java
 
package programmers_level_1_1;

public class Level1_22
{
	public static void main(String[] args)
	{
		int [] arr = new int[]	{1,2,4,3};
		
		Solution1_22 solution1_22 = new Solution1_22();
		
		int [] result = solution1_22.solution(arr);
		
		for(int i=0; i<result.length; i++)
			System.out.print(result[i]);
	}
	
}

class Solution1_22 {
    public int[] solution(int[] arr) {
        int num = arr.length;
        
        if(num==1)
            return new int[]{-1};
        
        int[] answer = new int[num-1];
        
        int index=0;
        
        int min = arr[0];
        
        for(int i=1; i<num; i++)
        {
            min = Math.min(min,arr[i]);
        }
        
        for(int i=0; i<num; i++)
        {
            if(arr[i]==min)
                continue;
            answer[index++] = arr[i];
        }
        
        
        return answer;
    }
}