// Date : 2020.08.30, 20.11.13
// Title : 잃어버린 괄호
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Greedy
 
package BOJ_Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Greedy_03
{
	public static void main(String[] agrs) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split("\\-");

		// 첫 번째는 무조건 + , 나머지는 무조건 -

		int total = 0;

		String[] temp = str[0].split("\\+");

		for (String s : temp)
			total += Integer.parseInt(s);

		for (int i = 1; i < str.length; i++)
		{
			temp = str[i].split("\\+");

			for (String s : temp)
				total -= Integer.parseInt(s);

		}

		System.out.println(total);

}	// 다시 풀때는 따로 메소드를 빼서 plus 부분의 처리를 하지않고 한꺼번에 했다.
	/*
	public static void main(String[] args) throws IOException
	{
		//55-50+40 min -> -35
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str = br.readLine().split("\\-");
		
		int answer = 0;
		
		for(int i=0; i<str.length; i++)
		{	
			
			if(i==0)
				answer += plus(str[i]);
			else
			{
				answer -=plus(str[i]);
			}
		}
		
		System.out.println(answer);
	}
	
	public static int plus(String s)
	{
		int result = 0;
		
		String [] temp = s.split("\\+");
		result = Integer.parseInt(temp[0]);
		for(int i=1; i<temp.length; i++)
			result += Integer.parseInt(temp[i]);
		
		return result;
	}
	*/
	
}


/*

초기에 한 방식
이방법으로 하면 백준에선 자꾸 런타임 에러가 뜬다.. 
30분째 해멘결과 컴파일러 차이같다는 결론을 내렸다. 
첫 문자가 0 으로 시작한것때문인가 
왜 메소드로 만들어서 하면 되는거지.. 
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		//55-50+40 min -> -35
		
		Scanner sc = new Scanner(System.in);
		
		String [] str = sc.nextLine().split("-");
		
		int answer = 0;
		answer += Integer.parseInt(str[0]);
		for(int i=1; i<str.length; i++)
		{	
			//System.out.println(str[i]);
			String [] temp = str[i].split("\\+");
			
			for(int j=0; j<temp.length; j++)
				answer-=Integer.parseInt(temp[j]);
			
			
		}
		
		System.out.println(answer);
	}
	
}
*/