package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Groom_012
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String answer = "No";
		
		int index1 = input.indexOf("12");
		int index2 = input.indexOf("21");
		
		if(index1>=0 && index2>=0) // 둘다 존재하고
		{
			// 최초로 나온걸 자른 뒤에도 존재 해야함
			if(index1<index2) // 12가 먼저나온상황
			{
				index2 = input.substring(index1+2).indexOf("21");
				if(index2>=0)
				{
					answer = "Yes";
				}
			}
			else if(index1>index2) // 21이 먼저나온상황
			{
				index1 = input.substring(index2+2).indexOf("12");
				if(index1>=0)
				{
					answer = "Yes";
				}
			}
		}
			
		
		System.out.println(answer);
		
	}
}

// 나중에 비슷한 문제를 발견하거나 다른사람이 푼 코드를 보고싶다.