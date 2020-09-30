package groom;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Groom_016
{
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int num = Integer.parseInt(input);
		
		int [] arr = new int[51];	// 문제에서 N은 50까지임
		
		arr[1] = 1;
		arr[2] = 1;
		arr[3] = 1;
		arr[4] = 2;
		arr[5] = 2;	// 5이전까지는 규칙성이 없음 
		if(num<=5)
		{
			System.out.println(arr[num]);
			return;
		}
		
		for(int i=0; i<num-5; i++)	// 그뒤부턴 arr[6] = arr[5] + arr[1] 식으로 인덱스 차이가 남
		{
			arr[6+i] = arr[5+i] + arr[1+i];
		}
		
		System.out.println(arr[num]);
		
	}
}

// 규칙성 찾는게 중요