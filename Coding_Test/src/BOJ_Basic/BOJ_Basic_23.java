// Date : 2020.10.22
// Title : 통계학
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BOJ_Basic_23
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		int [] arr = new int[num];
		
		for(int i=0; i<num; i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(arr);
		
		// 산술평균
		int total = 0;
		for(int n : arr)
			total += n;
		System.out.println(String.format("%.0f", total/(double)num));
		
		// 중앙값
		System.out.println(arr[num/2]);
		
		// 최빈값
		int [] minArr = new int [8002];
		int max = 0;
		
		for(int n : arr)
		{
			if(n<0)
			{
				minArr[4000+Math.abs(n)]++;
				if(max<minArr[4000+Math.abs(n)])
				{
					max = minArr[4000+Math.abs(n)];
				}
				
			}
			else
			{	
				minArr[n]++;
				if(max<minArr[n])
				{
					max = minArr[n];
				}
			}
		}
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<minArr.length; i++)
		{
			if(max==minArr[i])
			{
				if(i>4000)
				{
					list.add((i-4000)*-1);
				}
				else
				{
					list.add(i);
				}
			}
		}
		
		Collections.sort(list);
		
		if(list.size()>=2)
		{
			System.out.println(list.get(1));
		}
		else
			System.out.println(list.get(0));
		
		
		// 범위
		if(num==1)
			System.out.println(0);
		else
			System.out.println(arr[num-1] - arr[0]);
		
	}
}

// String.format("%.0f",값)
// 최빈값이 중요