// Date : 2020.09.23
// Title : 문자열 반복
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_Basic_13
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		while(n-- >0)
		{
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str," ");
			int num = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			
			for(int i=0; i<s.length(); i++)
			{
				for(int j=0; j<num; j++)
				{
					sb.append(s.charAt(i));
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
		
		
	}
}

// time : 80ms