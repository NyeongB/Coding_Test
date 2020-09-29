package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Groom_013
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<input.length(); i++)
		{
			sb.append(input.substring(0,i+1));
			if(i!=input.length()-1)	// 구름의 문제점을 피하기위해 마지막줄은 개행처리를 하지않는다...
				sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
}
