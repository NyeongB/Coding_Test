// Date : 2020.09.01, 20.11.13
// Title : 좌표 정렬
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Sorting

package BOJ_Sorting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ_Sorting_02
{
	public static void main(String[] agrs) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		
		int [][] arr = new int[num][2];
		
		for(int i=0; i<arr.length; i++)
		{
			String [] temp = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(temp[0]);
			arr[i][1] = Integer.parseInt(temp[1]);
		}
		
		Arrays.sort(arr, new Comparator<int []>() {
			
			public int compare(int [] a, int [] b)
			{
				
				if(a[0] > b[0] )
					return 1;
				else if(a[0] < b[0])
					return -1;
				else
				{
					if(a[1] > b[1])
						return 1;
					else
						return -1;
				}
				
			}
		});
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<arr.length; i++)
		{
			sb.append(arr[i][0]+" "+arr[i][1]+"\n");
		}
		
		System.out.println(sb.toString());
		
		

	}
// 기존에는 class 를 만들어 값을 담았는데 int형 2차원 배열로 받아서 정렬하는게 제일 빠르다 
	/*
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
	*/
}