// Date : 2020.08.23
// Title : 문제2
// Author : Choi Cheol Nyeong
 
package programmers_test;

public class Test_03
{
	public static void main(String[] args)
	{
		String [] drum = {"######",">#*###","####*#","#<#>>#",">#*#*<","######"};
		
		int count=0;
		
		for(int i=0; i<6; i++)
		{
			int x = 0;
			int y = i;
			int star=0;
			while(true)
			{
				System.out.println(x+" "+y+"star:"+star);
				if(star>=2)
					break;
				if(x==5)
				{
					count++;
					break;
				}
				
				if(drum[x].charAt(y)=='#')
				{	x++; continue;}
				else if(drum[x].charAt(y)=='>')
				{	y++; continue;}
				else if(drum[x].charAt(y)=='<')
				{	y--; continue;}
				else if(drum[x].charAt(y)=='*')
				{	x++; star++; continue;}
				
				
			}
		}
		
		System.out.println(count);
	}
}
