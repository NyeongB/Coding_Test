// Date : 2020.09.07
// Title : 비밀번호 찾기
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Hash Map
package BOJ_HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_HashMap_02
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		HashMap<String, String> hm = new HashMap<String, String>();
		
		for(int i=0; i<n; i++)
		{
			str = br.readLine().split(" ");
			hm.put(str[0], str[1]);
		}
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<m; i++)
		{
			sb.append(hm.get(br.readLine())+"\n");
		}
		
		System.out.println(sb.toString());
	}
}