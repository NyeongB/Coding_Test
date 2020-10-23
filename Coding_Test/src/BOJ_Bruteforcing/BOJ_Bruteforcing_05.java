// Date : 2020.10.23
// Title : 체스판 다시 칠하기
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Bruteforcing

package BOJ_Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Bruteforcing_05
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);

		char[][] startW = {{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }
		,{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }
		,{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }
		,{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }
		,{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }
		,{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }
		,{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }
		,{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }};
		
		char[][] startB = {{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }
		,{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }
		,{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }
		,{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }
		,{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }
		,{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }
		,{ 'B', 'W', 'B', 'W', 'B', 'W', 'B', 'W' }
		,{ 'W', 'B', 'W', 'B', 'W', 'B', 'W', 'B' }
		};

		char[][] chessMap = new char[N][M];

		for (int i = 0; i < N; i++)
		{
			str = br.readLine().split("");
			for (int j = 0; j < M; j++)
			{
				chessMap[i][j] = str[j].charAt(0);
			}
		}
		
		int min= 1000000;
		
		for(int i=0; i<=N-8; i++)
		{
			for(int j=0; j<=M-8; j++)
			{
				int count = 0;
				// i,j는 단지 시작점
				for(int k=i; k<i+8; k++)
				{
					for(int t=j; t<j+8; t++)
					{
						if(startW[k-i][t-j]!=chessMap[k][t])
							count++;
					}
				}
				min = Math.min(count, min);
				
				
			}
		}
		
		

		for(int i=0; i<=N-8; i++)
		{
			for(int j=0; j<=M-8; j++)
			{
				int count = 0;
				// i,j는 단지 시작점
				for(int k=i; k<i+8; k++)
				{
					for(int t=j; t<j+8; t++)
					{
						if(startB[k-i][t-j]!=chessMap[k][t])
							count++;
					}
				}
				min = Math.min(count, min);
				
				
			}
		}
		System.out.println(min);
	}
}

// 좀 무식한 방법으로 풀었다. 하지만 블로그 참고를 전혀하지않고 내 머리속에서 풀었다는것에 의미를 둔다.
// b가 먼저일때도 있고 w 가 먼저일때도있으니 8*8 배열 두개를 준비해서 비교해가며 최소값을 찾았다
// i,j는 단지 시작점을 나타내주는것이고 진짜비교는 k,t값에 따라 달라진다.