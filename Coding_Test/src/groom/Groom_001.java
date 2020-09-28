package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Groom_001
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		int index = 0;
		while(num>0)
		{
			index = 0;
			while((int)Math.pow(2,index)<=num)
			{
				index++;
			}
			
			num -= Math.pow(2,--index);
			list.add(index);
		}
		
		System.out.println(list.size());
		Collections.sort(list);
		
		for(int i=0; i<list.size()-1; i++)
			System.out.print(list.get(i)+" ");
		System.out.print(list.get(list.size()-1));
		
	}
}
