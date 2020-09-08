// Date : 2020.09.08
// Title : 네트워크
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : DFS
 
package programmers_level_3;

public class Level3_01
{
	static boolean [] visit;
	public static void main(String[] args)
	{
		Solution3_01 solution3_01 = new Solution3_01();
		int n = 3;
		int  [][] computers = { {1,1,0}, {1,1,0}, {0,0,1} };
		
		System.out.println(solution3_01.solution(n, computers));
	}
	
	static class Solution3_01 {
	    
	    public static int solution(int n, int[][] computers) {
	        int answer = 0;
	        visit = new boolean[n];
	        for(int i=0; i<n; i++)
	        {
	            if(visit[i]==false)
	            {
	                dfs(i,n,computers);
	                answer++;
	            }
	        }
	        
	        return answer;
	    }
	    
	    public static void dfs(int v,int n, int[][] computers)
	    {
	        visit[v]=true;
	        for(int i=0; i<n; i++)
	        {
	            if(computers[v][i]==1 && visit[i]==false)
	                dfs(i,n,computers);
	        }
	    }
	}
	
}
// 인접행렬로 dfs 하면되는 간단한 문제 bfs 로도 풀어본다. 