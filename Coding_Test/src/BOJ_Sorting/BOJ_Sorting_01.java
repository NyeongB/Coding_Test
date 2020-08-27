// Date : 2020.08.27
// Title : 나이순 정렬
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Sotring
 
package BOJ_Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ_Sorting_01
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [][] str = new String[n][2];
		for(int i=0; i<n; i++)
		{
			str[i][0] = sc.next();
			str[i][1] = sc.next();
		}
		Arrays.sort(str,new Comparator<String[]>()
		{
			@Override
			public int compare(String [] a, String[]b)
			{
				return Integer.compare(Integer.parseInt(a[0]), Integer.parseInt(b[0]));
			}
		});
		
		for(int i=0; i<str.length; i++)
			System.out.println(str[i][0]+" "+str[i][1]);
	}
	
}