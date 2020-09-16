// Date : 2020.09.16
// Title : 숫자 카드
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Sorting

package BOJ_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class BOJ_Sorting_07
{
	
	static int n, m;
    static int arr[];
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		
		String [] str = br.readLine().split(" ");
		for(int i=0; i<n; i++)
		{
			arr[i] = Integer.parseInt(str[i]);
			
		}
		
		Arrays.sort(arr);
		
		m = Integer.parseInt(br.readLine()); 
		
		
		
		StringBuffer sb = new StringBuffer();
		
		str = br.readLine().split(" ");
		
		for(int i=0; i<m; i++)
		{
			int temp = Integer.parseInt(str[i]);
			
			if(binarySearch(temp))
			{
				sb.append("1 ");
			}
			else
				sb.append("0 ");
		}
		
		System.out.println(sb.toString());
	}
	
	
	  static boolean binarySearch(int num) {
	        int leftIndex = 0;
	        int rightIndex = n - 1;

	        while(leftIndex <= rightIndex){
	            int midIndex = (leftIndex + rightIndex) / 2;
	            int mid = arr[midIndex];

	            if(num < mid) rightIndex = midIndex - 1;
	            else if(num > mid) leftIndex = midIndex + 1;
	            else return true;
	        }
	        return false;
	    }
	
}

// 바이너리 서치로 해결해야하는 문제
// 처음에 단순히 어레이 리스트안에 contains 메소드를 사용하여서 문제를 해결했는데
// 그렇게 되면 최대 최대 (500,000 * 20,000,000) 번 탐색을 하게 된다
// 결과적으로 시간 초과가 났고 문제를 다시 바이너리 서치로 해결하였따.

/*
public class BOJ_Sorting_07
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		String [] str = br.readLine().split(" ");
		for(int i=0; i<n; i++)
		{
			list.add(Integer.parseInt(str[i]));
		}
		
		n = Integer.parseInt(br.readLine()); 
		
		
		int [] arr = new int[n];
		StringBuffer sb = new StringBuffer();
		
		str = br.readLine().split(" ");
		
		for(int i=0; i<n; i++)
		{
			if(list.contains(Integer.parseInt(str[i])))
			{
				sb.append("1 ");
			}
			else
				sb.append("0 ");
		}
		
		System.out.println(sb.toString());
	}
}
*/

