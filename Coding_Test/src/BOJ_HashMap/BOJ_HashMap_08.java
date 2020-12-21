// Date : 2020.12.15
// Title : 베스트 셀러
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Hash
package BOJ_HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;


public class BOJ_HashMap_08
{

	static class Node{
		
		String str;
		int num;
		
		Node(String str, int num)
		{
			this.str = str;
			this.num = num;
		}
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		
		
		HashMap<String, Integer> hm = new HashMap<>();
		ArrayList<Node> list = new ArrayList<>();
		
		while(num-->0)		// 숫자만큼 입력받음 
		{
			String temp = br.readLine();
			
			if(hm.get(temp) == null)
			{
				hm.put(temp,1);
			}
			else
			{
				hm.put(temp,hm.get(temp)+1);	// 같은게 있으면 기존거에 +1 
			}
			
		}
		
		
		for(String s : hm.keySet())
		{
			list.add(new Node(s,hm.get(s)));	// 해쉬의 키만큼 리스트에 넣음 
		}
		
		Collections.sort(list,new Comparator<Node>()
		{

			@Override
			public int compare(Node o1, Node o2)
			{
				if(o1.num < o2.num)					// 정렬 기준 1. 숫자가 큰게 앞으로 (내림차순), 2. 숫자가 같으면 알파벳 순대로(오름차순)
					return 1;
				else if (o1.num == o2.num)
				{
					return o1.str.compareTo(o2.str);
				}
				else
					return -1;
			}
		});
		
		System.out.println(list.get(0).str);
		
		
	}
}