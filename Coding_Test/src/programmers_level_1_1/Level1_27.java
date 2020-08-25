// Date : 2020.08.25
// Title : 행렬의 덧셈
// Author : Choi Cheol Nyeong
// Language : Java
 
package programmers_level_1_1;

public class Level1_27
{
	public static void main(String[] args)
	{
		
		int[][] arr1 = {{1,2}, {2,3}};
		int[][] arr2 = {{3,4}, {5,6}};
		
		Solution1_27 solution1_27 = new Solution1_27();
		int [][] result = solution1_27.solution(arr1, arr2);
		for(int i=0; i<result.length; i++)
		{
			for(int j=0; j<result[0].length; j++)
				System.out.print(result[i][j]+" ");
			System.out.println();
		}
	}
	
}

class Solution1_27 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        
        int row = arr1.length;
        int col = arr1[0].length;
        
        int[][] answer = new int[row][col];
        
        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                answer[i][j] = arr1[i][j] +arr2[i][j];
            }
        }
        
        
        return answer;
    }
}