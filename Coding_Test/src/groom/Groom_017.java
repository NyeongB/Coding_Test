package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Groom_017
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String [] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[0]);
		int term = Integer.parseInt(str[1]);
		
		ArrayList<Man> list = new ArrayList<>();
		
		for(int i=0; i<n; i++)
		{
			list.add(new Man(i+1,false));
		}
		int index = 0;
		int count = 0;
		String answer ="";
		while(true)
		{
			if(count==n-2)
				break;
			
			Man temp = list.get(index);
			if(temp.dead)
			{
				index = (index+1)%n;
			}
			else
			{
				list.get(index).dead = true;
				for(int j=0; j<term; j++)
				{
					index = (index+1)%n;
					if(list.get(index).dead)
						j--;
				}
				count++;
			}
			
		}
		
		for(int i=0; i<n; i++)
		{
			if(!list.get(i).dead)
				answer += list.get(i).num +" ";
		}
		
		System.out.println(answer.trim());
		
	}
}

class Man
{
	boolean dead;
	int num;
	
	public Man(int num, boolean dead)
	{
		this.num = num;
		this.dead = dead;
	}
}