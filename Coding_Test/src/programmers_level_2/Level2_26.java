// Date : 2020.11.06
// Title : 땅따먹기
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : 

package programmers_level_2;


public class Level2_26
{
	public static void main(String[] args)
	{

		Solution2_26 solution = new Solution2_26();
		int [][] land = new int[][] {{1,2,3,5},{5,6,7,8},{4,3,2,1}};
		System.out.println(solution.solution(land));
	}

}

class Solution2_26
{
	 int solution(int[][] land) {
		 
	        int answer = 0;
	        
	        int n = land.length;
	        
	        int [][] result = new int[n+1][4];
	        
	        for(int i=0; i<n; i++)
	        {
	            result[i+1][0] = Math.max(Math.max(result[i][1] , result[i][2])
	                                               , result[i][3]) + land[i][0];
	            
	            result[i+1][1] = Math.max(Math.max(result[i][0] , result[i][2])
	                                               , result[i][3]) + land[i][1];
	            
	            result[i+1][2] = Math.max(Math.max(result[i][0] , result[i][1])
	                                               , result[i][3]) + land[i][2];
	            
	            result[i+1][3] = Math.max(Math.max(result[i][0] , result[i][1])
	                                               , result[i][2]) + land[i][3];
	            
	        }

	        answer = Math.max(Math.max(Math.max(result[n][0],result[n][1]), result[n][2]), result[n][3]);
	        
	        return answer;
	    }
	}
// 컨셉은 자기자신을 제외한값의 맥스값과 자기자신과 N+1까지 쌓는것