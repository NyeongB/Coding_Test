// Date : 2020.09.28
// Title : 종이 자르기
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class BOJ_Basic_15
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str = br.readLine().split(" ");
		
		int n = Integer.parseInt(str[1]);	// 세로 1
		int m = Integer.parseInt(str[0]);	// 가로 0
		
		ArrayList<Integer> hori = new ArrayList<Integer>();
		ArrayList<Integer> verti = new ArrayList<Integer>();
		
		
		
		
		int count = Integer.parseInt(br.readLine());
		
		while(count-->0)
		{
			str = br.readLine().split(" ");
			if(str[0].equals("0"))	// 가로
			{
				hori.add(Integer.parseInt(str[1]));
			}
			else if(str[0].equals("1"))	// 세로
			{
				verti.add(Integer.parseInt(str[1]));
			}
		}
		
		Collections.sort(hori);
		Collections.sort(verti);
		
		int maxHori = 0;
		int maxVerti = 0;
		
		int index = 0;
		
		for(int i=0; i<hori.size(); i++)
		{
			int l = 0;
			for(int j=index; j<hori.get(i); j++ )
			{
				l++;
			}
			//System.out.println("hori : " + l);
			index += l;
			if(maxHori<l)
			{
				maxHori=l;
			}
		}
		
		int l = 0;
		//System.out.println(index);
		for(int i=index; i<n; i++)
		{
			l++;
		}
		//System.out.println(l);
		if(maxHori<l)
			maxHori = l;
		
		index = 0;
		
		for(int i=0; i<verti.size(); i++)
		{
			int k = 0;
			for(int j=index; j<verti.get(i); j++ )
			{
				k++;
			}
			//System.out.println("verti : " + k);
			index += k;
			if(maxVerti<k)
			{
				maxVerti=k;
			}
		}
		
		l = 0;
		
		for(int i=index; i<m; i++)
		{
			l++;
		}
		if(maxVerti<l)
			maxVerti = l;
		
		//System.out.println("maxHori : "+maxHori);
		//System.out.println("maxVerti : "+maxVerti);
		
		System.out.println(maxVerti*maxHori);
		
		
	}
}

// 약간 하드코딩 느낌으로 가로와 세로를 나눈다음 
// 계속해서 최대값을 바탕으로 문제를 접근하였다.
// 아마 이렇게 푼사람 없을거같은 느낌이 든다..