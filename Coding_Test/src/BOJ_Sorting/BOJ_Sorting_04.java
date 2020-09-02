// Date : 2020.09.02
// Title : 수 정렬하기2
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Sorting

package BOJ_Sorting;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;

public class BOJ_Sorting_04
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		Integer [] arr = new Integer[n];
		
		for(int i=0; i<n; i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		//Arrays.sort(arr,Collections.reverseOrder()); desc
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int result : arr)
			sb.append(result+"\n");
			System.out.println(sb.toString());
	}
}
/*
for 문 안에서 println으로 접근하니 시간초과가 떴는데 스트링 빌더랄 사용하니 시간초과 문제가 해결되었다.
하지만 내장 되어있는 sort 를 사용하기보단 직접 q sort 를 구현해서 다시한번 풀어본다. 

 */