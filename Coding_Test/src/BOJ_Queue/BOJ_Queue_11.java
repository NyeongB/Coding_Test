// Date : 2020.11.03
// Title : 트럭
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Queue

package BOJ_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_Queue_11
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		String [] input = br.readLine().split(" ");
		
		int n = Integer.parseInt(input[0]);	// 트럭수
		int w = Integer.parseInt(input[1]);	// 통나무 길이
		int l = Integer.parseInt(input[2]);	// 최대 하중
		
		input = br.readLine().split(" ");
		
		int [] trucks = new int [n];
		
		for(int i=0; i<n; i++)
			trucks[i] = Integer.parseInt(input[i]);
		
		
		int index = 0;
		int time = 0;
		int space = 0;
		
		Queue<Truck> q = new LinkedList<Truck>();
		
		while(index < n)
		{
			time++;
			
			// 트럭이 넘어가면 큐에서 빼기
			if(!q.isEmpty() && time - q.peek().in_time == w)
			{
				space -= q.poll().weight;
			}
			
			// 들어갈수있으면 큐에 넣기(통나무위에 올리기)
			int next_truck = trucks[index];
			if( next_truck + space <= l)
			{
				q.add(new Truck(next_truck, time));
				index++;
				space += next_truck;
			}
			
			
		}
		
		System.out.println(time + w);	// index가 n 보다 커진순간 탈출이여서 맨 마지막의 움직임은 추가되지않는다. 고로 + w 더함
		
		
	}
	
	static class Truck{
		int weight;
		int in_time;
		
		Truck(int weight, int in_time)
		{
			this.weight = weight;
			this.in_time = in_time;
		}
	}

}