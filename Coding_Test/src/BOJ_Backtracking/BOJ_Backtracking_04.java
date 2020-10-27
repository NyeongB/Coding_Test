// Date : 2020.10.27
// Title : 로또
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Backtracking
package BOJ_Backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Backtracking_04
{
	
	static StringBuilder sb = new StringBuilder();
	
	static int [] arr;		// 로또 수들 기록
	static int [] result = new int[6];	// 결과값 저장
	static int [] visit;	// 방문기록
	
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		String [] str;
		
		while(true)
		{
			str = br.readLine().split(" ");
			
			int n = Integer.parseInt(str[0]);
			
			if(n == 0)
				break;
			
			visit = new int[n];
			arr = new int[n];
			
			for(int i=1; i<str.length; i++)	// 초기화 작업
			{
				arr[i-1] = Integer.parseInt(str[i]);
			}
			
			dfs(0,0);
			sb.append("\n");
			
			
			
			
		}
		
		System.out.println(sb.toString());
	}
	
	
	// dfs
	public static void dfs(int index, int depth)
	{
		if(depth == 6)	// 6개만 출력
		{
			for(int i=0; i<6; i++)
			{
				sb.append(result[i]+" ");
			}
			sb.append("\n");
			
			return ;
		}
		
		
		for(int i=index; i<arr.length; i++)
		{
			if(visit[i]==0)
			{
				visit[i] = 1;
				result[depth] = arr[i];
				dfs(i, depth + 1);
				visit[i] = 0;
			}
		}
		
		
	}
	
}

// 조합느낌으로 접근했다.