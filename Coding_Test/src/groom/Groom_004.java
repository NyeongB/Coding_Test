package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Groom_004
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int count = 0;
		int answer = 0;
		
		for(int i=0; i<input.length(); i++)
		{
			char temp = input.charAt(i);
			
			if(temp=='o')
			{
				count++;
				answer += count;
			}
			else if(temp=='x')
			{
				count = 0;
			}
		}
		
		System.out.println(answer);
	}
}
