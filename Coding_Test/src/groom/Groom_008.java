package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Groom_008
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().split(" ");
		
		int cenX = Integer.parseInt(str[0]);
		int cenY = Integer.parseInt(str[1]);
		int r = Integer.parseInt(str[2]);
		r = r*r;
		int min=100000;
		int minCount=0;
		
		for(int i=0; i<5; i++)
		{
			str = br.readLine().split(" ");
			int tempX = Integer.parseInt(str[0]);
			int tempY = Integer.parseInt(str[1]);
			int tempR = (int)Math.pow((cenX-tempX),2) + (int)Math.pow((cenY-tempY),2);
			if(tempR>r)	// 도달하지 못한경우
				continue;
			
			if(tempR-r<min)
			{
				minCount = i+1;
				min = tempR-r;
			}
		}
		
		
		if(min==100000) // 도달하지못해서 min 의 값이 변하지 않은경우 
			System.out.println(-1);
		else
		System.out.println(minCount);
		
	}
}
