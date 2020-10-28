// Date : 2020.10.26
// Title : 수 정렬하기 3
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Sorting

package BOJ_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class BOJ_Sorting_10
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int [] arr = new int[10001];	// 숫자는 10000까지라고 명시 
		
		while(n-->0)
		{
			int index = Integer.parseInt(br.readLine());
			arr[index]++;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=10000; i++)
		{
			if(arr[i]>0)	// 0 이면 한번도 증감되지않은 수라는 판단
			{
				for(int j=0; j<arr[i]; j++)	// 초기화될때 받은 수만큼 반복
				{
					sb.append(i+"\n");
				}
			}
		}
		
		System.out.println(sb.toString());
		
	}
}

// 재밌는 문제 10000000 까지 수가 있으니 확실이 O(n*n) 인 기존의 정렬로는 무리가 있다 
// 문제를 보다 답이안나와 블로그를 참고했는데
// 재밌는 방식으로 오름차순정렬한것과 같은 효과를 내고있다