// Date : 2020.09.07
// Title : 소트인사이드
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Sorting

package BOJ_Sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_Sorting_05
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		Integer [] arr = new Integer[str.length()];
		
		for(int i=0; i<str.length(); i++)
			arr[i] = str.charAt(i)-'0';
		
		Arrays.sort(arr,Collections.reverseOrder());
		
		str = "";
		
		for(int i=0; i<arr.length; i++)
			str += arr[i];
		
		System.out.println(str);
		
		
	}
}