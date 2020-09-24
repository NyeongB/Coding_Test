// Date : 2020.09.24
// Title : 이장님 초대
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Sorting

package BOJ_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_Sorting_08
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		String [] str = br.readLine().split(" ");
		
		int [] arr = new int [n];
		
		for(int i=0; i<n; i++)
		{
			arr[i] = Integer.parseInt(str[i]);
		}
		
		Arrays.sort(arr);
		int index = 0;
		for(int i=n; i>0; i--)
		{
			arr[index++] += i+1;
		}
		
		int max = arr[0];
		
		for(int i=1; i<n; i++)
		{
			if(max<arr[i])
				max = arr[i];
		}
		System.out.println(max);
	}
}