// Date : 2020.08.22
// Title : K번째 수
// Author : Choi Cheol Nyeong
 
package programmers_level_1;

import java.util.Arrays;

public class Level1_14
{
	public static void main(String[] args)
	{
		Solution1_14 solution = new Solution1_14();
		
		int [] array = {1,5,2,6,3,7,4};
		int [][] commands = {{2,5,3}, {4,4,1} , {1,7,3}};
		
		int [] result = solution.solution(array, commands);
		
		for(int i=0; i<result.length; i++)
			System.out.print(result[i]+" ");
	}
	
}

class Solution1_14 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i=0; i<commands.length; i++)
        {
            int [] temp = new int[commands[i][1]-commands[i][0]+1];
            int index=0;
            for(int j=commands[i][0]-1; j<commands[i][1]; j++)
            {
                temp[index++] = array[j];
            }
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }
        
        return answer;
    }
}