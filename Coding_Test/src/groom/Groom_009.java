package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Groom_009
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().split(" ");
		
		int num = Integer.parseInt(str[0]);
		
		StringBuilder sb = new StringBuilder();
		
		while(num-->0)
		{
			str = br.readLine().split(" ");
			int x = Math.abs(Integer.parseInt(str[0]));
			int y = Math.abs(Integer.parseInt(str[1]));
			int count = Integer.parseInt(str[2]);
			
			int temp = x+y;
			
			if(temp%2!=count%2 || count<temp)	// 둘다 같은 홀수, 짝수인지, 도달가능한 거리인지 체크 
			{
				sb.append("NO").append("\n");
				continue;
			}
			
			sb.append("YES").append("\n");
			
			
			
		}
		
		System.out.println(sb.toString());
	}
}
