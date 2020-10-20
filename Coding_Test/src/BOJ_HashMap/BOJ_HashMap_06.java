// Date : 2020.10.20
// Title : 나는야 포켓몬 마스터 이다솜
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Hash Map
package BOJ_HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_HashMap_06
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		HashMap<String, Integer> hmName = new HashMap<String, Integer>();
		HashMap<Integer, String> hmNumber = new HashMap<Integer, String>();
		
		StringBuilder sb = new StringBuilder();

		for(int i=0; i<n; i++)
		{
			String s = br.readLine();
			if(hmName.get(s)==null)
			{
				hmName.put(s,i+1);
				hmNumber.put(i+1,s);
			}
		}
		
		for(int i=0; i<m; i++)
		{
			String s = br.readLine();
			
			if(Character.isDigit(s.charAt(0)))
			{
				sb.append(hmNumber.get(Integer.parseInt(s)));
			}
			else
			{
				sb.append(hmName.get(s));
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}

// 해시를 두개쓰면 풀수있는 간단한 문제
// 더 좋은 방법이 있나 찾아본다..