// Date : 2020.10.14
// Title : 숫자판 점프
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : DFS

package BOJ_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_DFS_10
{
	
	static int [][] map = new int[5][5];
	static int [][] visit = new int[5][5];
	static String result;
	static int [] dx = {0,0,1,-1};
	static int [] dy = {1,-1,0,0};
	static ArrayList<String> list = new ArrayList<String>();
	
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for(int i=0; i<5; i++)
		{
			String [] str = br.readLine().split(" ");
			for(int j=0; j<str.length; j++)
			{
				
				map[i][j] = Integer.parseInt(str[j]);
			}
			
		}
		
		for(int i=0; i<5; i++)
		{
			for(int j=0; j<5; j++)
			{
				result = "";
				//System.out.println(i+", "+j+"에서 시작~!!!!!!!!");
				dfs(i,j,0);
			}
		}
		
		System.out.println(list.size());
		
		/*
		 * for(String s : list) System.out.println(s);
		 */
	}
	
	
	public static void dfs(int a, int b, int depth)
	{
		
		result += map[a][b];
		
		if(depth==5)
		{
			if(!list.contains(result))
			{
				//System.out.println("x : "+a+" y : "+b+" depth : " + depth+" !!");
				
				list.add(result);
			}
			return;
		}
		
		for(int i=0; i<4; i++)
		{
			int x = a + dx[i];
			int y = b + dy[i];
			
			if(x>=0&&y>=0&&x<5&&y<5)
			{
				
					//System.out.println("x : "+x+" y : "+y+" depth : " + depth);
					
					dfs(x,y,depth+1);
					
					result = result.substring(0,depth+1);
					
				
			}
		}
	}
	
}

// 보자마자 dfs로 접근해야겠다 생각한문제
// 00부터 44까지 모든곳부터 출발해 문자열길이가 6이되면 출력을한다 
// 이때 중요한것은 list에서 이미 들어있는건지 아닌지의 판단과
// 갔던길을 되돌아오는 서브스트링 표현이 제일 중요하다
// 70퍼문제라기엔 좋은문제인듯하다