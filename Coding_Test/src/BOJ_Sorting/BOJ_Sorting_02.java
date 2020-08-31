// Date : 2020.09.01
// Title : 좌표 정렬
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Sorting

package BOJ_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ_Sorting_02
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<XY> list = new ArrayList<XY>();
		
		for(int i=0; i<n; i++)
		{
			list.add(new XY(sc.nextInt(), sc.nextInt()));
		}
		
		Collections.sort(list,new Comparator<XY>()	// 스왑 1 스왑 안할려면 -1
		{
			public int compare(XY a, XY b)
			{
				if(a.getX()==b.getX())
				{
					if(a.getY()>b.getY())
						return 1;
					else if(a.getY()<b.getY())
						return -1;
					else
						return -1;
				}
				else if (a.getX()>b.getX())
					return 1;
				else
					return -1;
				
			}
		});
				
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<n; i++)
		{
			sb.append(list.get(i).getX()+" "+list.get(i).getY()+"\n");
		}
		
		System.out.println(sb.toString());
		sc.close();
				
				
	}
}

class XY
{
	int x,y;
	
	public XY(int x, int y)	// 사용자 정의 생성자
	{
		this.x = x;
		this.y = y;
	}
	
	public int getX() 
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
}