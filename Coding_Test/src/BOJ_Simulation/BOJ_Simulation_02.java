// Date : 2020.09.28
// Title : 공 바꾸기
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Simulation
 
package BOJ_Simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Simulation_02
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		int [] arr = new int[n];
		
		for(int i=1; i<=n; i++)
			arr[i-1] = i;
		
		while(m-->0)
		{
			str = br.readLine().split(" ");
			int i = Integer.parseInt(str[0]) - 1;
			int j = Integer.parseInt(str[1]) - 1;
			if(i==j)
				continue;
			
			arr[i] = arr[i] ^ arr[j];
			arr[j] = arr[j] ^ arr[i];
			arr[i] = arr[i] ^ arr[j];
		}
		
		for(int num : arr)
			System.out.print(num + " ");
	}
	
}

// 같은 인덱스를 저런식으로 스왑하면 0 으로 변환됨 
// i,j인덱스가 같으면 어차피 스왑을 하지않으니 continue로 흐름 제어한다.