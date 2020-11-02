// Date : 2020.11.02
// Title : 맥주마시면서 걸어가기
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : BFS

package BOJ_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;


public class BOJ_BFS_13
{
	static int [] visit;
	
	
	static class Node{
		int x;
		String result;
		
		Node(int x, String result)
		{
			this.x = x;
			this.result = result;
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int total = Integer.parseInt(br.readLine());
		
		while(total-->0)
		{
			
			
			
			//
			String [] input = br.readLine().split(" ");
			int num = Integer.parseInt(input[0]);
			
			int result = Integer.parseInt(input[1]);
			visit = new int [10000];
			visit[num] = 1;
			
			Queue<Node> q = new LinkedList<Node>();
			
			q.add(new Node(num,""));
			
			while(!q.isEmpty())
			{
				Node temp = q.poll();
				
				
				if(temp.x == result)
				{
					sb.append(temp.result+"\n");
					break;
				}
				
				int d = temp.x * 2 % 10000;
				int s;
				if(temp.x==0) s = 9999;
				else s = temp.x - 1;
				int l = (temp.x % 1000) * 10 + temp.x / 1000;

				int r = (temp.x % 10) * 1000 + (temp.x / 10);

				
				if(visit[d]==0)
				{
					q.add(new Node(d,temp.result+"D"));
					visit[d] = 1;
				}
				
				if(visit[s]==0)
				{
					q.add(new Node(s,temp.result+"S"));
					visit[s] = 1;
				}
				
				if(visit[l]==0)
				{
					q.add(new Node(l,temp.result+"L"));
					visit[l] = 1;
				}
				
				if(visit[r]==0)
				{
					q.add(new Node(r,temp.result+"R"));
					visit[r] = 1;
				}
				
				
				
			}
			//
			
		}
		
		System.out.println(sb.toString());
		//System.out.println(getL(10));
		
	}
	
	// 둘다 초반 접근 잘못됨 
	public static int getL(int n)
	{
		String str = "" + n;
		
		str = str.substring(1,str.length()) + str.charAt(0);
		
		return Integer.parseInt(str);
	}
	
	public static int getR(int n)
	{
		String str = "" + n;
		
		str = str.charAt(str.length()-1) + str.substring(0,str.length()-1);
		
		return Integer.parseInt(str);
	}
}

// 숨바꼭질 문제랑 똑같다 생각해서 비슷한 방법으로 접근하였다
// 결과적으로 테스트케이스가 맞아서 제출하였는데 틀렸다
// 원인은 L,R의 알고리즘이 잘못된것
// 간단하게 풀수있는건데 괜히 복합하게 생각한것같다.