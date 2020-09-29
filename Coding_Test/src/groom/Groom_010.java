package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Groom_010
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		String [] str = br.readLine().split(" ");
		int count = 0;
		String answer ="";
		for(int i=0; i<num; i++)
		{
			long temp= Long.parseLong(str[i]);
			if((temp&(temp-1))!=0)	//2의 거듭제곱 판별
			{
				count++;
				answer += (i+1)+" ";	// 해답 인덱스 
			}
		}
		
		System.out.println(count);
		System.out.println(answer);
		
	}
}
