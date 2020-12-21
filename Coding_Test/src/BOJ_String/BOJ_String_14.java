// Date : 2020.12.21
// Title : Hashing
// Author : Choi Cheol Nyeong
// Language : Java
// classification : String
 
package BOJ_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_String_14
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		String [] arr = new String[str.length()];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = str.substring(i);
		}
		
		Arrays.sort(arr);
		
		for(String s : arr)
			System.out.println(s);
		
	}
	
}

// substring 이 매개변수가 하나만 받는다면 해당 인덱스 뒤로 모든 배열을 포함한다
// 따라서 for 반복문동안 i 값 증가로 하게되면 모든 접두사를 받을 수 있다.