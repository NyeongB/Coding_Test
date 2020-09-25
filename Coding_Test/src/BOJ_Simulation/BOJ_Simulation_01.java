// Date : 2020.09.25
// Title : 트럭
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Simulation
 
package BOJ_Simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_Simulation_01
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		StringTokenizer st = new StringTokenizer(str," ");
		
		int n = Integer.parseInt(st.nextToken()); // 트럭수
		int w = Integer.parseInt(st.nextToken()); // 다리길이
		int l = Integer.parseInt(st.nextToken()); // 최대 하중
		
		str = br.readLine();
		st = new StringTokenizer(str," ");
		
		int [] arr = new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		int sum = 0;
		
		int answer = 0;
		
		for(int i=0; i<n; i++)
		{
			
			while(true)
			{
				if(q.size()==w)
				{
					sum -=q.poll();
				}
				if(sum + arr[i] <=l)
				{
					break;
				}
				q.add(0);
				answer++;
			}
			
			q.add(arr[i]);
			sum +=arr[i];
			answer++;
			
		}
		
		System.out.println(answer+w);
	}
	
}
// 큐인것은 바로 알아차렸으나 세부 구현이 너무 오래걸렸다.
// 직접 해보다가 테스트케스트 1만 통과하고 답이 안나와 접근법을 보고 해결하였다.
// 아직도 많이 부족한것같다. 꼭 다시 풀어본다.