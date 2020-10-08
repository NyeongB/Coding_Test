// Date : 2020.10.08
// Title : 숨바꼭질
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : BFS

package BOJ_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_BFS_06
{
	static int [] visit = new int[100001];
	static int k;
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		k = Integer.parseInt(str[1]);
		
		System.out.println(bfs(n));
		
	}
	
	public static int bfs(int n)
	{
		int depth = 0;
		
		Queue<Node> q = new LinkedList<>();
		
		visit[n] = 1;
		
		q.add(new Node(n,0));
		
		while(!q.isEmpty())
		{
			Node temp = q.poll();
			int x = temp.x;
			int y = temp.y;
			
			if(x == k)
			{
				depth = y;
				break;
			}
			if(x - 1 >=0 && visit[x-1]==0)
			{
				visit[x-1] = 1;
				q.add(new Node(x-1,y+1));
			}
			if(x + 1 <=100000 && visit[x+1]==0)
			{
				visit[x+1] = 1;
				q.add(new Node(x+1,y+1));
			}
			if(x * 2 <=100000 && visit[x * 2]==0)
			{
				visit[x * 2] = 1;
				q.add(new Node(x * 2,y+1));
			}
			
		}
		
		return depth;
	}
	
	static class Node{
		int x,y;
		
		Node(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
	}
}