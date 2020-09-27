// Date : 2020.09.27
// Title : 나무 자르기
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Binary Search

package BOJ_BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_BinarySearch_03
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int target = Integer.parseInt(str[1]);
		
		str = br.readLine().split(" ");
		
		int [] arr = new int[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		
		System.out.println(binarySearch(arr,target));
	}
	
	public static int binarySearch(int [] arr, int target)
	{
		int result = 0;
		
		int start = 0;
		int end = 2000000000;
		
		while(start<=end)
		{
			int mid = (start + end)/ 2;
			
			if(slice(arr,target,mid))
			{
				start = mid + 1;
			}
			else
			{
				end = mid - 1;
			}
			
			
		}
		
		result = end;
		
		
		return result;
	}
	
	public static boolean slice(int [] arr, int target, int h)
	{
		boolean result= false;
		
		long sum = 0;
		
		for(int num : arr)
		{
			sum += num - h > 0 ? num - h : 0;
		}
		
		if(sum>=target)
		{
			result = true;
		}
		
		return result;
	}
}

// 처음에 무식하게 접근했다가 바이너리 서치로 접근했는데
// 굉장히 이해가 안가고 어려웠다 
// 답지보고 이해하는쪽이였고 
// 여러번 풀어야될것같다.
// 익숙해져야지.. 