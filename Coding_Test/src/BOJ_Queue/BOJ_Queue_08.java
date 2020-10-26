// Date : 2020.10.26
// Title : 프린터 큐
// Author : Choi Cheol Nyeong
// Language : Java
// classification : queue

package BOJ_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BOJ_Queue_08
{
	public static void main(String[] agrs) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		while(n-->0) {
			
			String [] str = br.readLine().split(" ");
			
			int size = Integer.parseInt(str[0]);	// 배열의 사이즈
			int index = Integer.parseInt(str[1]);	// 궁금한 인덱스
			
			int [] arr = new int[size];
			int count = 0;							// 몇번째 출력한건지를 체클해주는 count
			
			// 우선순위 입력
			str = br.readLine().split(" ");
			
			for(int i=0; i<str.length; i++)
			{
				arr[i] = Integer.parseInt(str[i]);
			}
			
			Queue<Integer> q= new LinkedList<Integer>();
			
			for(int i=0; i<size; i++)
			{
				q.add(i);
			}
			
			while(!q.isEmpty())
			{
				int temp = q.peek();	// 가장 앞에것을 확인하고 
				boolean flag = false;
				
				// 나보다 큰것이 있는지 확인
				for(int i=0; i<size; i++)
				{
					if(arr[temp]<arr[i])
					{
						flag = true;
					}
				}
				
				// 나보다 큰것이 있다면?
				if(flag)
				{
					temp = q.poll();	// 맨뒤로 넣고
					q.add(temp);
				}
				else
				{
					q.poll();
					// 없다면 출력
					count++;	// 출력카운터 증가
					arr[temp] = 0;	// 출력했으니 제일 작다고 판단
					if(temp==index)	// 원하는 인덱스랑 맞으면 append
					{
						sb.append(count+"\n");
						
					}
				}
				
				
			}
			
			
		}
		
		System.out.println(sb.toString());
		
	}

}

// 한번에 성공해서 굉장히 뿌듯한 프린터 큐 구현
// 핵심은 우선순위가 높은것이 있는지 없는지 판단을 배열의 전체 탐색을 통해서 진행하였고
// 출력이 된이후엔 우선순위를 죽이기 위해 0 으로 대입했다.