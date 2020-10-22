// Date : 2020.10.22
// Title : 음계
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_25
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str = br.readLine().split(" ");
		
		int [] arr = new int[8];	// 기존 배열
		int [] arrASC = {1,2,3,4,5,6,7,8};	// 오름차순
		int [] arrDESC = {8,7,6,5,4,3,2,1};	// 내림차순
		
		int a = 0;
		int b = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = Integer.parseInt(str[i]);
			if(arr[i]==arrASC[i])
			{
				a++;
			}
			else if(arr[i]==arrDESC[i])
			{
				b++;
			}
		}
		
		
		if(a==8)
		{
			System.out.println("ascending");
		}
		else if(b==8)
			System.out.println("descending");
		else
			System.out.println("mixed");
		
	}
}

// 와 아직 멀었다 스트링 비교로 푼사람도 있네
/*
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String ascending = "1 2 3 4 5 6 7 8";
		String descending= "8 7 6 5 4 3 2 1";
		String output = input.equals(ascending) ? 
				"ascending" : (input.equals(descending) ? "descending" : "mixed");
		System.out.println(output);

*/
