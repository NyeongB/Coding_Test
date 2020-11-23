// Date : 2020.11.02
// Title : 섬 연결하기
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : 

package programmers_level_3;



public class Level3_09
{

	public static void main(String[] args)
	{
		Solution3_09 solution = new Solution3_09();
		System.out.println(solution.solution(4,new int[][] { { 0, 1, 1 }, { 0, 2, 2 }, { 1, 2, 5 }, { 1, 3, 1 }, { 2, 3, 8 } }));
	}

}

class Solution3_09 {
	
	

    static boolean [] visited;
    static int [][] map;
    
    public int solution(int n, int[][] costs) {
        int answer = 0;
        
         visited = new boolean[n];
         map = new int[n][n];
        
        for(int i=0; i<costs.length; i++)
        {
            int x = costs[i][0];
            int y = costs[i][1];
            int cost = costs[i][2];
            
            map[x][y] = map[y][x] = cost;
        }
        visited[0] = true;
        answer = prim(0,1);
        
        return answer;
    }
    
    public int prim(int result, int count)
    {
        if(count == map.length)
        {
            return result;
        }
        
        int min_index = 0;
        int min = 9999;
        for(int i=0; i<map.length; i++)
        {
            if(visited[i])
            {
                for(int j=0; j<map.length; j++)
                {
                    if(map[i][j]>0 && !visited[j])
                    {
                        if(min > map[i][j])
                        {
                            min = map[i][j];
                            //System.out.println(min);
                            min_index = j;
                        }
                    }
                }
            }
        }
        count++;
        result += min;
        //System.out.println(min_index);
        visited[min_index] = true;
        return prim(result, count);
        
    }
	
	/*
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
		System.out.println("둘러볼수있는것들");
		for(int i=0; i<visit.length; i++)
		{
			
			if(visit[i]==1)
			{
				System.out.print(i+" ");
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
		System.out.println();
		System.out.println(minIndex+ " "+min);
		
		visit[minIndex] = 1;
		answer += min;
		count++;
		
		
		
		return recursion(map, visit, answer, count);
	}
	*/
}

// 처음에 dfs 로접근하다가 0 -> 1 -> 3-> 2  이렇게 밖에 접근을 못하니깐 0 -> 2 의 직접적인 연결이 불가능하였따
// 참고하여 풀었는데 이방식으로하면 이미 방문했던 곳으로부터 가지를 칠수있어서 좋은 것을 배워간다.