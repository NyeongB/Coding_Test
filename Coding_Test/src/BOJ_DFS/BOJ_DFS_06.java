// Date : 2020.09.04
// Title : 
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : DFS

package BOJ_DFS;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_DFS_06
{	
	static int min = 100000;
	static int N, K;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str = br.readLine().split(" ");
		
		N = Integer.parseInt(str[0]);
		K = Integer.parseInt(str[1]);
		
		dfs(N,0);
		
		System.out.println(min);
		
		
	}
	
	static void dfs(int direct, int count)
	{
		if(direct == K)
		{
			if(min>count)
				min = count;
			return;
		}
		
		if(direct>=2*K || direct<0 || count>=K-N)
			return;
		
		dfs(direct - 1, count + 1);
		dfs(direct + 1, count + 1);
		dfs(direct * 2, count + 1);
	}
}

// bfs와 다르게 무한 루프가 발생한다.
// 되도록 이런 문제는 bfs로 접근한다. 