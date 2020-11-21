// Date : 2020.11.21
// Title : 가장 큰 정사각형
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : DP

package programmers_level_2;


public class Level2_32
{
	public static void main(String[] args)
	{

		Solution2_32 solution = new Solution2_32();
		System.out.println(solution.solution(new int[][] {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}}));
	}

}

class Solution2_32
{
	 public int solution(int [][]board)
	    {
	        int answer = 0;
	        int row = board.length;
	        int col = board[0].length;
	        
	        int [][] map = new int[row + 1][col + 1];
	        
	        for(int i=0; i<row; i++)
	        {
	            for(int j=0; j<col; j++)
	            {
	                map[i+1][j+1] = board[i][j];
	            }
	        }
	        
	        for(int i=1; i<row+1; i++)
	        {
	            for(int j=1; j<col+1; j++)
	            {
	                if(map[i][j] !=0)
	                {
	                    // 현재 포인터가 1이면 왼쪽 오른쪽 왼쪽위 대각선중에서 최소 + 1
	                    map[i][j] = Math.min(map[i-1][j-1],Math.min(map[i-1][j],map[i][j-1])) + 1;
	                    answer = Math.max(answer, map[i][j]);
	                }
	            }
	        }

	        return answer * answer;
	    }
}