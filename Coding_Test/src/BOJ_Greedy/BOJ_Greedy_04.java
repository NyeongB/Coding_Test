// Date : 2020.08.31
// Title : 회의실 배정
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Greedy

package BOJ_Greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ_Greedy_04
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Conference> list = new ArrayList<Conference>();
		
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			list.add(new Conference(sc.nextInt(), sc.nextInt()));
		}
		
		
		Collections.sort(list, new Comparator<Conference>() // start 값 정렬 
			{
					public int compare(Conference a , Conference b)
					{
						int num1 = a.getStart();
						int num2 = b.getStart();
						
						if(num1>num2)
							return 1;
						else if(num1<num2)
							return -1;
							return num1 - num2;
					}
					
			});
		
		Collections.sort(list, new Comparator<Conference>() // end 값 정렬 
		{
			public int compare(Conference a , Conference b)
			{
				int num1 = a.getEnd();
				int num2 = b.getEnd();
				
				if(num1>num2)
					return 1;
				else if(num1<num2)
					return -1;
					return num1 - num2;
			}
			
		});
		int s=0;
		int e=-1;
		int count =0;
		for(int i=0; i<n; i++)
		{
			//System.out.println(list.get(i).getStart()+" "+list.get(i).getEnd());
			
			s = list.get(i).getStart();
			
			if(s>=e)
			{
				e = list.get(i).getEnd();
				count++;
			}
					
		}
		System.out.println(count);
		
	}

}

class Conference
{
	int start, end;
	
	public Conference(int start, int end)	// 사용자 정의 생성자
	{
		this.start = start;
		this.end = end;
	}

	public int getStart()
	{	
		return start; 
	}

	public int getEnd()
	{
		return end;
	}

}