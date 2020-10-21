// Date : 2020.10.21
// Title : 피보나치 함수
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Dynamic Programming
 
package BOJ_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_DP_04
{
	static int [] arr = new int[41];
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int num = Integer.parseInt(br.readLine());
		
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i=2; i<41; i++)
		{
			arr[i] = arr[i-2] + arr[i-1];
		}
		
		while(num-- >0)
		{
			int temp = Integer.parseInt(br.readLine());
			sb.append(getNum(temp)).append("\n");
			
		}
		
		System.out.println(sb.toString());
	}
	
	public static String getNum(int index)
	{
		String result ="";
		if(index ==0)
		{
			result = "1 0";
		}
		else if(index == 1)
		{
			result = "0 1";
		}
		else
		{
			result = arr[index-1] +" " + arr[index];
		}
		
		return result;
	}
	
}

// DP는 점화식
// 어떤식으로 수열이 이루어질까 항상 고민