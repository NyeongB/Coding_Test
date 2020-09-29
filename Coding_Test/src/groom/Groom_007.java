package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Groom_007
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int [] arr = new int[4];	// 1, I, l, |
		
		for(int i=0; i<input.length(); i++)
		{
			char temp = input.charAt(i);
			if(temp=='1')
				arr[0]++;
			else if(temp=='I')
				arr[1]++;
			else if(temp=='l')
				arr[2]++;
			else if(temp=='|')
				arr[3]++;
		}
		
		for(int num : arr)
			System.out.println(num);
	}
}
