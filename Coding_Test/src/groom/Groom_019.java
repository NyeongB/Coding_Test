package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Groom_019
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int temp = num;
		while(true)
		{
			String str = "" + temp;
			temp = 0;
			for(int i=0; i<str.length(); i++)
			{
				int n = Integer.parseInt(str.substring(i,i+1));
				//System.out.println(n);
				temp += n*n;
			}
			//System.out.println(temp);
		
			if(temp == num || temp == 1 || temp ==4)
				break;
		}
		
		if(temp == 1)
		{
			System.out.print(num+" is Happy Number.");
		}
		else
		{
			System.out.print(num+" is Unhappy Number.");
		}
	}
}
