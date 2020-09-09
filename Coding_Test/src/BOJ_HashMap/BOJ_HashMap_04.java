// Date : 2020.09.09
// Title : 놀라운 문자열
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Hash Map
package BOJ_HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class BOJ_HashMap_04
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		StringBuffer sb = new StringBuffer();
		
		while(true)
		{
			String str = sc.nextLine();
			
			if(str.equals("*"))
				break;
			
			int len = str.length();
			
			boolean flag =true;
			
			for(int i=0; i<len; i++)
			{
				HashMap<String, String> hm = new HashMap<>();
				String temp = "";
				for(int j=0; j<len-1-i; j++)
				{
					temp = ""+str.charAt(j)+str.charAt(i+1+j);
					if(hm.get(temp)!=null) // 가 존재한다면
					{
						flag = false;
						continue;
					}
					hm.put(temp, temp);
				}
			}
			
				if(!flag)
				{
					
					sb.append(str+" is NOT surprising.\n");
					//break;
				}
				else
				{
					sb.append(str+" is surprising.\n");
					
				}
				
			
		}
		
		System.out.println(sb.toString());
	}
}
