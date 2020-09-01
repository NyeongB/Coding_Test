// Date : 2020.09.01
// Title : K번째 수
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Sorting

package BOJ_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_Sorting_03
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int [] arr = new int[N];
		
		for(int i=0; i<N; i++)
			arr[i] = sc.nextInt();
		
		//Arrays.sort(arr); 시간 초과!!!!!
		
		arr = bubbleSort(arr);
		
		System.out.println(arr[K-1]);
		
		
		sc.close();
	}
	
	static int [] bubbleSort(int [] arr)
	{
		int len = arr.length;
		int [] result = arr;
		
		for(int i=0; i<len; i++)
		{
			for(int j=0; j<len-i-1; j++)
			{
				if(result[j]>result[j+1])
				{
					int temp = result[j];
					result[j] = result[j+1];
					result[j+1] = temp;
				}
			}
		}
		
		//for(int i=0; i<arr.length; i++)
		//	System.out.println(arr[i]);
		
		return result;
	}
	
}