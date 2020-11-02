// Date : 2020.11.02
// Title : 섬 연결하기
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : 

package programmers_level_3;

import java.util.HashSet;

public class Level3_09
{

	public static void main(String[] args)
	{
		Solution3_09 solution = new Solution3_09();
		System.out.println(solution.solution(4,new int[][] { { 0, 1, 1 }, { 0, 2, 2 }, { 1, 2, 5 }, { 1, 3, 1 }, { 2, 3, 8 } }));
	}

}

class Solution3_09 {
	public int solution(int n, int[][] costs)
	{
		int answer = 0;
		
		int [] visit = new int[n];
		int [][] map = new int [n][n];
		
		
		for(int i=0; i<costs.length; i++)
		{
			map[costs[i][0]][costs[i][1]] = costs[i][2];
			map[costs[i][1]][costs[i][0]] = costs[i][2];
		}
		
		visit[0] = 1;
		answer = recursion(map, visit, 0, 1);
		
		
		return answer;
	}
	public int recursion(int [][] map, int [] visit,int answer, int count)
	{
		
		if(count == visit.length)
		{
			return answer;
		}
		
		int min = Integer.MAX_VALUE;
		int minIndex = 0;
		
		for(int i=0; i<visit.length; i++)
		{
			if(visit[i]==1)
			{
				for(int j=0; j<map.length; j++)
				{
					if(map[i][j]>0 && visit[j]==0 && min > map[i][j])
					{
						min = map[i][j];
						minIndex = j;
					}
				}
			}
		}
		
		visit[minIndex] = 1;
		answer += min;
		count++;
		
		
		
		return recursion(map, visit, answer, count);
	}
	
}

// 처음에 dfs 로접근하다가 0 -> 1 -> 3-> 2  이렇게 밖에 접근을 못하니깐 0 -> 2 의 직접적인 연결이 불가능하였따
// 참고하여 풀었는데 이방식으로하면 이미 방문했던 곳으로부터 가지를 칠수있어서 좋은 것을 배워간다.