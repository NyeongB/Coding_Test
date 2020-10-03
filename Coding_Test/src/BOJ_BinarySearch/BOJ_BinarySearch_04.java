// Date : 2020.10.03
// Title : 먹을 것인가 먹힐 것인가
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Binary Search

package BOJ_BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_BinarySearch_04
{
	public static void main(String[] args) throws IOException
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int [] arrA;
		int [] arrB;
		String [] str;
		while(t-->0)
		{
			str = br.readLine().split(" ");
			int count = 0;
			int numA = Integer.parseInt(str[0]);
			int numB = Integer.parseInt(str[1]);
			
			arrA = new int[numA];
			
			str = br.readLine().split(" ");
			for(int i=0; i<numA; i++)
			{
				arrA[i] = Integer.parseInt(str[i]);
			}
			
			str = br.readLine().split(" ");
			for(int i=0; i<numA; i++)
			{
				for(int j=0; j<str.length; j++)
				{
					int temp = Integer.parseInt(str[j]);
					if(arrA[i]>temp)
						count++;
				}
			}
			
			sb.append(count+"\n");
		}
		
		System.out.println(sb.toString());
	}
}

/*
완전 탐색으로 시관초과
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int [] arrA;
		int [] arrB;
		String [] str;
		while(t-->0)
		{
			str = br.readLine().split(" ");
			int count = 0;
			int numA = Integer.parseInt(str[0]);
			int numB = Integer.parseInt(str[1]);
			
			arrA = new int[numA];
			
			str = br.readLine().split(" ");
			for(int i=0; i<numA; i++)
			{
				arrA[i] = Integer.parseInt(str[i]);
			}
			
			str = br.readLine().split(" ");
			for(int i=0; i<numA; i++)
			{
				for(int j=0; j<str.length; j++)
				{
					int temp = Integer.parseInt(str[j]);
					if(arrA[i]>temp)
						count++;
				}
			}
			
			sb.append(count+"\n");
		}
		
		System.out.println(sb.toString());
*/
