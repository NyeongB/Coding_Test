// Date : 2020.01.09
// Title : 인하니카 공화국 
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Recursion

package BOJ_Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Recursion_04
{
	
	static int [][] map;
	static boolean [][] visited;
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String [] str = br.readLine().split(" ");
		
		int T = Integer.parseInt(str[0]);
		
		while(T-- >0)
		{
			str = br.readLine().split(" ");
			int N = Integer.parseInt(str[0]);
			int M = Integer.parseInt(str[1]);
			
			map = new int[N+1][N+1];
			visited = new boolean[N+1][N+1];
			
			while(M-- >0)
			{
				str = br.readLine().split(" ");
				int i,j,k;
				i = Integer.parseInt(str[0]);
				j = Integer.parseInt(str[1]);
				k = Integer.parseInt(str[2]);
				map[i][j] = map[j][i]= k;
			}
			
			
			int result = recursion(1,Integer.MAX_VALUE);
			
			if(result !=Integer.MAX_VALUE)
				sb.append(result);
			else
				sb.append(0);
			
			sb.append("\n");
			
		}
		System.out.println(sb.toString());
	}// end main
	
	public static int recursion(int now, int parent)
	{
		
		int child = 0;
		boolean flag = false;
		
		for(int i=1; i<map.length; i++)
		{
			if(map[now][i]>0 && !visited[now][i])
			{
				visited[now][i] = visited[i][now] = true;
				//System.out.println(now+" "+i+" "+map[now][i]);
				child += recursion(i, map[now][i]);
				flag = true;
			}
		}
		
		if(!flag) {
			//System.out.println("pa reture : "+ parent);
			return parent;
		}
		//System.out.println("주체 "+now + "c :"+child+" p: "+parent);
		int result = Math.min(child, parent);
		//System.out.println(result+"!!!!!!!");
		return result;
	}
}

// flag를 잘못줘서 계속 오류나다가 성공
// 핵심은 현재 내가 갈 수 있는곳 파악하고 재귀로 리턴된 값을 쌓은다음 부모와 비교해본다