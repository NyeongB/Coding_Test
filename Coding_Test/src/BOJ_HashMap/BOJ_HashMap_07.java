// Date : 2020.10.22
// Title : 듣보잡
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Hash
package BOJ_HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class BOJ_HashMap_07
{
	public static void main(String [] args) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str = br.readLine().split(" ");
		
		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);
		
		HashMap<String, String> hm = new HashMap<String, String>();
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0; i<N; i++)
		{
			String temp = br.readLine();
			if(hm.get(temp)==null)
			{
				hm.put(temp, temp);
			}
		}
		
		for(int i=0; i<M; i++)
		{
			String temp = br.readLine();
			
			if(hm.get(temp)!=null)
			{
				list.add(temp);
			}
			
		}
		Collections.sort(list);
		System.out.println(list.size());
		for(String s : list)
			System.out.println(s);
	}
}

// 듣도와 보도에 둘다 속해있어야지 듣보잡이된다는 문제
// 처음에 듣도를 넣을때 해쉬맵에 넣고
// 보도를 입력받을때 해쉬맵에 있는거면 어레이 리스트에담고 정렬시켰다.