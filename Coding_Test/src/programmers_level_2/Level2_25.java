// Date : 2020.11.03
// Title : 다리를 지나는 트럭
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Queue

package programmers_level_2;

import java.util.LinkedList;
import java.util.Queue;

public class Level2_25
{
	public static void main(String[] args)
	{

		Solution2_25 solution = new Solution2_25();
		System.out.println(solution.solution(100, 100, new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }));
	}

}

class Solution2_25
{
	public int solution(int bridge_length, int weight, int[] truck_weights)
	{
		int answer = 0;

		int time = 0; // 걸리는 시간
		int max = 0; // 현재 올라온 트럭들 무게
		int index = 0; // 들어갈 트럭을 가르킴
		Queue<Truck> q = new LinkedList<>();

		while (index < truck_weights.length) // 해당 조건을 만족하게되면 마지막 트럭이 다리 위에 올라감
		{
			time++;

			// 트럭이 지나갔을때 큐에서 제거
			if (!q.isEmpty() && time - q.peek().in_time == bridge_length) // 트럭이 지나갔다면?
			{
				max -= q.poll().weight; // 통나무에서 트럭제거
			}

			// 트럭이 들어갈수있을때 큐에 넣기
			int current = truck_weights[index];
			if (max + current <= weight) // 올라온 트럭들과 지금 넣을려고하는 트럭의 무게가 최대 하중보다 낮을때
			{
				index++; // 다음트럭
				max += current; // 현재 트럭 통나무에 올림
				q.add(new Truck(current, time));

			}

		}

		answer = time + bridge_length; // 걸린 시간 + 마지막 트럭이 갈시간(bridge_length)

		return answer;
	}

	static class Truck
	{
		int weight;
		int in_time;

		Truck(int weight, int in_time)
		{
			this.weight = weight;
			this.in_time = in_time;
		}
	}
}