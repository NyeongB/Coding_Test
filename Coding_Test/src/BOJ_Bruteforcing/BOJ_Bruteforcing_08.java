// Date : 2020.12.13
// Title : 백설 공주와 일곱 난쟁이
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Bruteforcing

package BOJ_Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_Bruteforcing_08
{

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [] arr = new int[9];
		
		for(int i=0; i<9; i++)
		{
			arr[i] = Integer.parseInt(br.readLine());
		}
		Arrays.sort(arr);
		
		int index_I = 0;
		int index_J = 0;
		
		for(int i=0; i<8; i++)
		{
			for(int j=i+1; j<9; j++)
			{
				int sum = 0;
				for(int k=0; k<9; k++)
				{
					if(k == i || k == j)
						continue;
					
					sum += arr[k];
					
					if(sum == 100)
					{
						index_I = i;
						index_J = j;
					}
						
				}
				
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<9; i++)
		{
			if(i == index_I || i == index_J)
				continue;
			
			sb.append(arr[i]+"\n");
		}
		
		System.out.println(sb.toString());
		
	}
}

// 정렬이 문제의 핵심이였네..
// 문제는 일곱 난장이가 아닌 인덱스를 기억했다가 
// 나중에 제외한다.