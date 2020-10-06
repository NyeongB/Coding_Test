package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Groom_022
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int min = Integer.parseInt(st.nextToken());
		while(st.hasMoreTokens())
		{
			int temp = Integer.parseInt(st.nextToken());
			if(min>temp)
					min = temp;
		}
		System.out.print(min);
	}
}
