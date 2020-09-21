// Date : 2020.09.21
// Title : !밀비 급일
// Author : Choi Cheol Nyeong
// Language : Java
// classification : String
 
package BOJ_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_String_09
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		
		StringBuilder sb;
		StringBuilder answer = new StringBuilder();
		
		while(true)
		{
			str = br.readLine();
			if(str.equals("END"))
				break;
			sb = new StringBuilder();
			sb.append(str);
			answer.append(sb.reverse()).append("\n");
		}
		
		System.out.println(answer.toString());
	}
	
}

// 문자열 자체를 하나하나 뺴서 돌리면 코드가 길어질수도 있는문제
// 자바에서 기본적으로 StringBuilder 나 StringBUffer에서 문자열을 거꾸로 출력 가능한 reverse() 라는 함수를 제공 하고있따.
// reverse를 위한 StringBuilder 와 총 출력을 위한 StringBuilder 를 따로 두고 
// 반복할때마다 입력된 문자열을 돌려야 하므로 StringBuilder를 계속 생성해주었다. 