// Date : 2020.10.22
// Title : 랜선 자르기
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Binary Search

package BOJ_BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_BinarySearch_05
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str = br.readLine().split(" ");
		
		int k = Integer.parseInt(str[0]);
		int n = Integer.parseInt(str[1]);
		
		long [] arr = new long[k];
		
		for(int i=0; i<k; i++)
		{
			arr[i] = Long.parseLong(br.readLine());
		}
		
		
		
		
		long left = 0;
		long right = (long)Math.pow(2,31)-1;
		long max = 0;
		
		while(left<=right)
		{
			//System.out.println(left+" "+right);
			int count = 0;
			long mid = ( left + right ) / 2;
			
			for(long num : arr)
			{
				count += num / mid;
			}
			
			if(n<=count)
			{
				left = mid + 1;
				
				max = Math.max(mid, max);
			}
			else
			{
				right = mid - 1;
			}
			
		}
		
		System.out.println(max);
		
	}
}

// 범위를 최대까지 하지않아서 런타임에러가 계속났다