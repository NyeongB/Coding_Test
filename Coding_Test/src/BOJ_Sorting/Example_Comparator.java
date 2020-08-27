package BOJ_Sorting;

import java.util.Arrays;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Example_Comparator
{
	public static void main(String[] args)
	{
		int [] arr = new int[] {2,7,1,6,4,9,0,5,3,8};
		
		String [] str = new String[] {"d","a","c","b","e"};
		
		for(int i=0; i<str.length; i++)
		{
			System.out.print(str[i]);
		}
		System.out.println();
		
		Arrays.sort(str,new Comparator<String>()
		{
			@Override
			public int compare(String a, String b)
			{
				return b.compareTo(a);
//				return a.compareTo(b);
			}
		});
		
		for(int i=0; i<str.length; i++)
		{
			System.out.print(str[i]);
		}
		System.out.println();
		
		
		for(int i=0; i<arr.length; i++) // 정렬 안했을때
		{	
			if(i!=0)
			System.out.print(", "+arr[i]);
			else
			System.out.print(arr[i]);
		}
		System.out.println();
		Integer [] arr1 = new Integer[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			arr1[i] = arr[i];
		}
		
		Arrays.sort(arr1,Collections.reverseOrder());
		for(int i=0; i<arr.length; i++) // 내림차순 정렬 
		{	
			if(i!=0)
			System.out.print(", "+arr1[i]);
			else
			System.out.print(arr1[i]);
		}	
		System.out.println();
		
		for(int i=0; i<arr.length; i++) // 오름차순 정렬
		{	
			if(i!=0)
			System.out.print(", "+arr[i]);
			else
			System.out.print(arr[i]);
		}		
	}
}

