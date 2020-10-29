// Date : 2020.10.29
// Title : 나머지
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Basic_28
{
	public static void main(String[] args) throws IOException
	{
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [] arr = new int[42];	// 아무리 많아봤자 %42이므로 0~41
		
		int count = 0;
		
		for(int i=0; i<10; i++)
		{
			int index = Integer.parseInt(br.readLine());
			
			arr[index%42]++;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>0)
				count++;
		}
		
		System.out.println(count);
	}
}

// 요즘 해시를 자주 하다보니 해시로 접근해야되나 셋으로 접해야되나 했는데
// 생각해보니 0~41의 배열을 만들고 0보다 크게된다면 서로다른거니깐 카운트를 증가시키면 된다.