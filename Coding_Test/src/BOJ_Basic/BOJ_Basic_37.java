// Date : 2020.12.08
// Title : 인공지능 시계
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_37
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String [] str = br.readLine().split(" ");
		
		int HH = Integer.parseInt(str[0]);
		int MM = Integer.parseInt(str[1]);
		int SS = Integer.parseInt(str[2]);
		
		int input_time = Integer.parseInt(br.readLine());
		
		
		int input_HH, input_MM, input_SS;
		
		input_SS = input_time % 60;
		input_MM = input_time / 60;
		input_HH = input_MM / 60;
		input_MM = input_MM % 60;
		
		
		SS = input_SS + SS;
		if(SS>=60)
		{
			SS -= 60;
			MM += 1;
		}
		
		MM = input_MM + MM;
		
		if(MM>=60)
		{
			MM -= 60;
			HH +=1;
		}
		
		HH = (HH + input_HH) % 24;
		
		System.out.printf("%d %d %d",HH,MM,SS);
		
		
	}
}