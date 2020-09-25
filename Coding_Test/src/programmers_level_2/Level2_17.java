// Date : 2020.09.25
// Title : 카카오프렌즈 컬러링북
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : BFS
 
package programmers_level_2;

import java.util.LinkedList;
import java.util.Queue;

public class Level2_17
{
	public static void main(String[] args)
	{
		Solution2_17 solution2_17 = new Solution2_17();
		
		int [] arr = solution2_17.solution(6, 4, new int [][] {{1, 1, 1, 0}, {1, 2, 2, 0}, {1, 0, 0, 1}, {0, 0, 0, 1}, {0, 0, 0, 3}, {0, 0, 0, 3}});
		
		for(int num : arr)
			System.out.print(num+" ");
		
	}
	
	
}

class Solution2_17 {
    static int [] dx ={-1,0,1,0};
    static int [] dy ={0,1,0,-1};
    static int count;
    
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        
        int [][] visit = new int[m][n];
        
        int[] answer = new int[2];
        
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(picture[i][j]!=0 && visit[i][j]==0)
                {
                    count = 0;
                    numberOfArea++;
                    bfs(i,j,picture, visit,picture[i][j]);
                    if(count> maxSizeOfOneArea)
                        maxSizeOfOneArea = count;
                    
                }
            }
        }
        
        
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    public void bfs(int a, int b, int [][] picture, int [][] visit,int num)
    {
        Queue<XY> q = new LinkedList<>();
        q.add(new XY(a,b));
       
        while(!q.isEmpty())
        {
            XY temp = q.poll();
            for(int i=0; i<4; i++)
            {
                int x = temp.x + dx[i];
                int y = temp.y + dy[i];
                
                if(x>=0&&y>=0&&x<visit.length&&y<visit[0].length)
                {
                    if(picture[x][y]==num&&visit[x][y]==0)
                    {
                        q.add(new XY(x,y));
                        visit[x][y]=1;
                        count++;
                    }
                }
                
            }
        }
        
    }
}

class XY
{
    int x;
    int y;
    public XY(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

// 문제를 보자마자 BFS로 접근해야겠다는 느낌이 왔다. 
// 이런 느낌이 계속 있기를.. 
// 0으론 이동못하고 다른 숫자는 자신과 같은 숫자끼리 이동 가능하게 하면된다.
// 중요한건 4방향을 인지하는것과 좌표를 담을 클래스선언, BFS응용력인듯하다.
