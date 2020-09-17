// Date : 2020.09.17
// Title : A+B - 4
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_Basic_11
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		
		String str;
		
		while((str = br.readLine()) != null)
		{
			st = new StringTokenizer(str," ");
			
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			sb.append(a+b).append("\n");
		}
		
		
		System.out.println(sb.toString());
	}
}

// 정답률이 왜 낮은가 해서 해봤는데
// 문제 조건에 따로 루프 탈출 구문이없어서 그냥 테스트케이스만 해서 해보니 틀렸다.
// 아무것도 입력하지 않았을때를 확인해야하는문제
// 또한 StirngBuilder 를 StringBuffer 대신 사용해보았고
// 문자열을 나눌때 split보단 StringTokenizer를 사용해야겠다.
// 실제로 IDE에서 돌릴땐 확인이 불가능한 문제