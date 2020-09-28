package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Groom_003
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int n = Integer.parseInt(input);
		StringBuilder sb = new StringBuilder();
		
		while(n-- >0)
		{
			int count = 0;
			input = br.readLine();
			
			for(int i=0; i<input.length(); i++)
			{
				char temp = input.charAt(i);
				if(temp=='a'||temp=='e'||temp=='i'||temp=='o'||temp=='u'
					|| temp=='A'||temp=='E'||temp=='I'||temp=='O'||temp=='U')
				{
					sb.append(temp);
					count++;
				}
			}
			if(count==0)
				sb.append("???");
			
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
