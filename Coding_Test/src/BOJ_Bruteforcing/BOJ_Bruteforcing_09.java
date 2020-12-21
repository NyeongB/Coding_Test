// Date : 2020.12.16
// Title : 카드 놓기
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Bruteforcing,DFS, HashSet

package BOJ_Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class BOJ_Bruteforcing_09
{
	
	static String str = "";
	static boolean [] visited;
	static int [] arr;
	static int sum_count;
	static HashSet<String> hs = new HashSet<>();
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		sum_count = Integer.parseInt(br.readLine());
		
		arr = new int[num];
		visited = new boolean[num];
		
		for(int i=0; i<num; i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		dfs(0);
		
		System.out.println(hs.size());
		
	}
	
	public static void dfs(int count)
	{
		if(count == sum_count)
		{
			hs.add(str);
			return;
		}
		
		String temp = str;
		
		for(int i=0; i<arr.length; i++)
		{
			if(!visited[i])
			{
				visited[i] = true;
				str += arr[i];
				
				dfs(count + 1);
				
				visited[i] = false;
				str = temp;
				
			}
		}
	}
}


// 2 ~ 4 카드 선택을 어떻게 하려다가 재귀로 접근하였다
// 또한 카운트가 맞아 떨어질때의 값을 해쉬셋에 저장하여 중복이 된다하더라도 하나만 들어가게 하여 결과가 나온다
