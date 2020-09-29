package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Groom_011
{

	static int [] temp;
	static int [][] map;
	static int n;
	static int m;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().split(" ");
		
		n = Integer.parseInt(str[1]);
		m = Integer.parseInt(str[0]);
		
		map = new int[n][m];
		
		for(int i=0; i<n; i++)
		{
			str = br.readLine().split(" ");
			for(int j=0; j<m; j++)
			{
				map[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		if(check())	// 달걀 부화 실패
		{
			System.out.print(-1);
			return;
		}
		
		bfs();	// 부화기 가동
		
		// 이번엔 부화를 시키고 부화가 안된곳을 찾음 
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				if(map[i][j]==0)// 하나라도 부화안된다면
				{
					System.out.println(-1);
					return;
				}
			}
		}
		
		System.out.println(temp[2]);	// 마지막 으로 찍힌 부화날이 스태틱 변수이 있음으로
		
		
		
	}
	
	public static void bfs()
	{
		Queue<int []> q = new LinkedList<>();
		
		int [] dx = new int[]{1,-1,0,0};
		int [] dy = new int[]{0,0,1,-1};	// 동서남북
		
		for(int i=0; i<n; i++)	// 전체를 돌면서 시작점으로 쓰일수있는 달걀이 있는 지 체크 
		{
			for(int j=0; j<m; j++)
			{
				if(map[i][j]==1)
				{
					q.add(new int[]{i,j,0});	// 첫날은 1일로 안쳐서 0을 넣어둠 
				}
			}
		}
		
		
		
		while(!q.isEmpty())
		{
			temp = q.poll();
			
			for(int i=0; i<4; i++)
			{
				int x = temp[0] + dx[i];
				int y = temp[1] + dy[i];
				
				if(x>=0&&y>=0&&x<n&&y<m)	// 범위를 만족한다면
				{
					if(map[x][y]==0)	// 갈곳이 0이라면
					{
						q.offer(new int[]{x,y,temp[2]+1});
						map[x][y]=1;	// 다시 방문 못하게 넣어둠 
					}
				}
			}
			
		}
		
	}
	
	public static boolean check()	// 달걀이 부화 가능한지 못한지 체크하는 메소드
	{
		boolean flag = false;
		int count = 0;
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<m; j++)
			{
				if(map[i][j]==0)
					count++;
			}
		}
		
		if(count==n*m)	// 모든 칸에 달걀이 부화하지 않았다면
			flag = true;
		
		return flag;
	}
}
