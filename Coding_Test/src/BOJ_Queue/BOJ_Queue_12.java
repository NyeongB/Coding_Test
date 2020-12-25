// Date : 2020.12.25
// Title : 크리스마스 선물
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Queue

package BOJ_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class BOJ_Queue_12
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());	// 오름차순으로 가장 비싼게 우선순위가 높도록
		
		int num = Integer.parseInt(br.readLine());
		
		for(int i=0; i<num; i++)
		{
			String [] input = br.readLine().split(" ");
			// 아이들 만날때
			if(input[0].equals("0"))
			{
				if(q.isEmpty())	// 선물이 없다면
				{
					sb.append("-1\n");
				}
				else			// 선물이 있다면
				{
					sb.append(q.poll()+"\n");
				}
			}
			
			
			// 선물 충전
			else
			{
				int temp_num = Integer.parseInt(input[0]);
				
				for(int j=0; j<temp_num; j++)
				{
					q.add(Integer.parseInt(input[j+1]));
				}
			}
			
			
		}
		
		System.out.println(sb.toString());
		
	}

}