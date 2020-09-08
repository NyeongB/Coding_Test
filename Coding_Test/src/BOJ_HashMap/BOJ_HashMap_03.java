// Date : 2020.09.07
// Title : 비밀번호 찾기
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Hash Map
package BOJ_HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class BOJ_HashMap_03
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str = br.readLine().split(" ");
		
		int nA = Integer.parseInt(str[0]);
		int nB = Integer.parseInt(str[1]);
		
		HashMap<Integer, Integer> hmA = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> hmB = new HashMap<Integer, Integer>();
		
		str = br.readLine().split(" ");
		int [] arrA = new int [str.length];
		for(int i=0; i<nA; i++)
		{
			int num = Integer.parseInt(str[i]);
			arrA[i] = num;
			hmA.put(num,num);
		}
		
		
		str = br.readLine().split(" ");
		int [] arrB = new int [str.length];
		for(int i=0; i<nB; i++)
		{
			
			int num = Integer.parseInt(str[i]);
			arrB[i] = num;
			hmB.put(num,num);
		}
		
		
		// A 제거 
		for(int i=0; i<arrB.length; i++)
		{
			hmA.remove(arrB[i]);
		}
		
		// B 제거
		for(int i=0; i<arrA.length; i++)
		{
			hmB.remove(arrA[i]);
		}
		
		System.out.println(hmA.size()+hmB.size());
	}
}