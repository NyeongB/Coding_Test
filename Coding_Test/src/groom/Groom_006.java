package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Groom_006
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		
		
		for(int i=0; i<num; i++)
		{
			for(int j=0; j<num-1-i; j++)
				System.out.print(" ");
			
			for(int j=0; j<2*(i+1)-1; j++)
				System.out.print("*");
			
			System.out.println();
		}
		
	}
}
