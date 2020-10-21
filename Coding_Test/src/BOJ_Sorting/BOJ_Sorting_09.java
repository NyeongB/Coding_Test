// Date : 2020.10.21
// Title : 좌표 압축
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Sorting

package BOJ_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class BOJ_Sorting_09
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String [] str = br.readLine().split(" ");
		
		int [] arr1 = new int[n];
		int [] arr2 = new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr1[i] = arr2[i] = Integer.parseInt(str[i]);
		}
		Arrays.sort(arr2);
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		int index = 0;
		
		for(int i=0; i<n; i++)
		{
			if(hm.get(arr2[i])==null)
			{
				hm.put(arr2[i],index++);
			}
			else
				continue;
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++)
		{
			sb.append(hm.get(arr1[i])+" ");
		}
		
		System.out.println(sb.toString());
	}
}
// 다시 꼭 풀어보도록 한다.
// 이렇게 시간 초과 날거같은 문제는 왜 항상 어레이 리스트로 접근하는 바보같은 나..

// 망코드
/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		String [] str = br.readLine().split(" ");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<str.length; i++)
		{
			if(!list.contains(Integer.parseInt(str[i]))) // 없으면 넣는다.
			{
				list.add(Integer.parseInt(str[i]));
			}
		}
		
		Collections.sort(list);
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<n; i++)
		{
			sb.append(list.indexOf(Integer.parseInt(str[i]))).append(" ");
		}
		System.out.println(sb.toString());
*/
