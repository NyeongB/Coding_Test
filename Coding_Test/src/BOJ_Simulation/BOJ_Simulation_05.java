// Date : 2020.12.30
// Title : 톱니 바퀴
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Simulation

package BOJ_Simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_Simulation_05
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		ArrayList<Integer> list4 = new ArrayList<>();

		// 톱니 초기화
		String[] str = br.readLine().split("");
		for (int i = 0; i < 8; i++)
			list1.add(Integer.parseInt(str[i]));

		str = br.readLine().split("");
		for (int i = 0; i < 8; i++)
			list2.add(Integer.parseInt(str[i]));

		str = br.readLine().split("");
		for (int i = 0; i < 8; i++)
			list3.add(Integer.parseInt(str[i]));

		str = br.readLine().split("");
		for (int i = 0; i < 8; i++)
			list4.add(Integer.parseInt(str[i]));

		int num = Integer.parseInt(br.readLine());
		
		// 회전
		while (num-- > 0)
		{
			int[] joint = new int[3];
			joint = check_join(list1, list2, list3, list4);

			str = br.readLine().split(" ");

			int number = Integer.parseInt(str[0]);		// 톱니 number
			int direction = Integer.parseInt(str[1]);	// 방향 

			if (number == 1)
			{
				list1 = roration(list1, direction);
				if (joint[0] == 1)
				{
					direction *= -1; 
					list2 = roration(list2, direction);

					if (joint[1] == 1)
					{
						direction *= -1; 
						list3 = roration(list3, direction);

						if (joint[2] == 1)
						{
							direction *= -1; 
							list4 = roration(list4, direction);
						}
					}
				}
			} else if (number == 2)
			{
				list2 = roration(list2, direction);

				if (joint[0] == 1)
				{
					direction *= -1; 
					list1 = roration(list1, direction);
				}

				if (joint[1] == 1)
				{
					if(joint[0] != 1)
						direction *= -1; 
					list3 = roration(list3, direction);
					if (joint[2] == 1)
					{
						direction *= -1; 
						list4 = roration(list4, direction);
					}
				}

			} else if (number == 3)
			{
				list3 = roration(list3, direction);
				
				if (joint[2] == 1)
				{
					direction *= -1; 
					list4 = roration(list4, direction);
				}

				if (joint[1] == 1)
				{
					if(joint[2]!=1)
						direction *= -1; 
					list2 = roration(list2, direction);
					if (joint[0] == 1)
					{
						direction *= -1; 
						list1 = roration(list1, direction);
					}
				}
			} else if (number == 4)
			{
				list4 = roration(list4, direction);
				if (joint[2] == 1)
				{
					direction *= -1; 
					list3 = roration(list3, direction);

					if (joint[1] == 1)
					{
						direction *= -1; 
						list2 = roration(list2, direction);

						if (joint[0] == 1)
						{
							direction *= -1; 
							list1 = roration(list1, direction);
						}
					}
				}
			}
		} // while문 끝

		int total = 0;

		if (list1.get(0) == 1)
			total += 1;

		if (list2.get(0) == 1)
			total += 2;

		if (list3.get(0) == 1)
			total += 4;

		if (list4.get(0) == 1)
			total += 8;

		System.out.println(total);

	}

	// 이음새 N,S 극 확인
	public static int[] check_join(ArrayList<Integer> l1, ArrayList<Integer> l2, ArrayList<Integer> l3,
			ArrayList<Integer> l4)
	{
		int[] result = new int[3]; // 1 : 연결 , 0 : 연결안됨

		// 1번과 2번 톱니
		if (l1.get(2) != l2.get(6))
			result[0] = 1;
		else
			result[0] = 0;

		// 2번과 3번 톱니
		if (l2.get(2) != l3.get(6))
			result[1] = 1;
		else
			result[1] = 0;

		// 3번과 4번 톱니
		if (l3.get(2) != l4.get(6))
			result[2] = 1;
		else
			result[2] = 0;

		return result;
	}

	public static ArrayList<Integer> roration(ArrayList<Integer> list, int r)
	{
		if (r == 1) // 시계 방향
		{
			for (int i = 0; i < 7; i++)
				list.add(list.remove(0));
		} else if (r == -1) // 반시계 방향
		{
			list.add(list.remove(0));
		}

		return list;
	}

}

// 방향 바꾸기 용이하기 톱니들은 어레이 리스트로 했고 
// 방향 회전 메스도와 이음새 연결 메소드를 따로 두었다.
// 중요한건 방향회전 
// 처음에 전부 짜놓고 매개변수로 직접 rotation * -1로 해서 누적으로 *-1이 안된게 문제였다. 이것때문에 엄청 오래걸림.. 