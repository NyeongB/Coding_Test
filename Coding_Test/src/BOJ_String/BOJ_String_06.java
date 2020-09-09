// Date : 2020.09.09
// Title : 단어의 개수
// Author : Choi Cheol Nyeong
// Language : Java
// classification : String
 
package BOJ_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_String_06
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine().trim();
		
		String [] arr = str.split(" ");
		
		if(str.isEmpty())
			System.out.println(0);
		else
			System.out.println(arr.length);
		
		
	}
	
}

// str.isEmpty() 가 존재하는지 처음 알았다
// 처음의 공백의 대한 조건을 주지않아서 실패했는데 
// str.isEmpty() 를 추가함으로서 간단하게 해결하였다. 