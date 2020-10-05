package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Groom_021
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String  str = br.readLine();
		char ch = br.readLine().charAt(0);
		
		int cnt = 0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==ch)
				cnt++;
		}
		
		System.out.println(cnt);
		
	}
}
