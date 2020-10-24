// Date : 2020.10.24
// Title : 리모컨
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Bruteforcing

package BOJ_Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;


public class BOJ_Bruteforcing_06
{
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		int count = Integer.parseInt(br.readLine());

		int min =  Math.abs(num - 100);

		HashSet<Integer> hs = new HashSet<Integer>();

		String[] str = br.readLine().split(" ");

		for (int i = 0; i < str.length; i++)
		{
			hs.add(Integer.parseInt(str[i]));
		}

		// 전체 브루트 포스
		for (int i = 0; i <= 500000; i++)
		{
			String temp = "" + i;
			int len = temp.length();
			boolean flag = true;

			for (int j = 0; j < temp.length(); j++)
			{
				int temp1 = temp.charAt(j) - '0';
				// System.out.println(temp1);
				if (hs.contains(temp1))
				{
					flag = false;
					break;
				}
			}

			if (flag)
			{
				if (min > Math.abs(i - num) + len)	// 버튼 누른게 최소이면
				{
					min = Math.abs(i - num) + len;
				}

			}

		}
		

		System.out.println(min);

	}

}



/*
public class BOJ_Bruteforcing_06
{
	
	static int arr[];	//리모콘에 넣을 남아있는 번호들
	static int N;		// 채널
	static int min = 5000000;	// 최솟값
	static final int current = 100;	// 채널 100 고정
	
	static int len;
	
	static int [] result;
	
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		len = (""+N).length();
		//System.out.println(len);
		result = new int[len];
		int count = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		arr = new int[10-count];
		
		int index = 0;
		
		if(count!=0)
		{String [] str = br.readLine().split(" ");
		
		for(int i=0; i<count; i++)
			list.add(Integer.parseInt(str[i]));
		}
		Collections.sort(list);
		
		for(int i=0; i<10; i++)
		{
			if(!list.contains(i))
				arr[index++] = i;
			
		}
		
		recursion(0);
		//System.out.println(min);
		min = Math.min(Math.abs(current-N), min);
		
		System.out.println(min);
		
		
		
	}
	
	public static void recursion(int count)
	{
		if(count==len)
		{
			String number="";
			// 길이가 갖춰졌으면 
			// +, - 절대값 길이 찾음 
			for(int n : result)
			{
				number += n;
			}
			int num = Integer.parseInt(number);
			  System.out.println("len:"+len+"num:"+num); if(Math.abs(N-num)+len<min) {
			  System.out.println(Math.abs(N-num)+len); }
			 
			min = Math.min(Math.abs(N-num)+len,min);
			return;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			result[count] = arr[i];
			recursion(count + 1);
			//result[count] = arr[i]; 빼주긴데 상관없음 덮어쓸거라
		}
	}
}
*/
// 속상하다 
/*

1555
8
0 1 3 4 5 6 7 9
일때
888과 버튼 3이 670 나오고
2222랑 버튼 4가 671 나오면서
답이 틀렸다..
원인이라면 나의 안일한 무조건 들어온 자리수와 같을 것이단 생각으로
재귀를 통해 길이가 같을때만 했기 때문이다.
앞으로 문제 범위를 보고 가능하다면 간단하게 짜는게 맞는것같다.
다시풀어본다

*/
