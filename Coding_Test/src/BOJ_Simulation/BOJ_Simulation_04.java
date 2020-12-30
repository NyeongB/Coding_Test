// Date : 2020.12.29
// Title : 로봇 청소기
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Simulation

package BOJ_Simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_Simulation_04
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] dx = { -1, 0, 1, 0 }; // 북 동 남 서 순으로 진행
		int[] dy = { 0, 1, 0, -1 };

		boolean flag = true;

		int total_count = 0; // 전체 청소 카운트

		String[] str = br.readLine().split(" "); // 첫쨰줄 인풋

		int N = Integer.parseInt(str[0]);
		int M = Integer.parseInt(str[1]);

		int[][] map = new int[N][M];

		str = br.readLine().split(" "); // 둘쨰줄 인풋

		int r = Integer.parseInt(str[0]); // 시작 좌표
		int c = Integer.parseInt(str[1]);
		int D = Integer.parseInt(str[2]); // 방향

		for (int i = 0; i < N; i++)
		{
			str = br.readLine().split(" ");

			for (int j = 0; j < M; j++)
			{
				map[i][j] = Integer.parseInt(str[j]);
			}
		}

		int count = 0; // 4 방향 체크 카운트
		int nx, ny;
		while (flag)
		{

			// 현재 위치 청소
			if (map[r][c] == 0)
			{
				map[r][c] = 2;
				total_count++;
			}

			while (true)
			{
				if (count == 4)
				{
					nx = r - dx[D];	// 후진 
					ny = c - dy[D];

					if (map[nx][ny] == 1) // 뒷칸도 벽
					{ 
						flag = false;
						break;
					} 
					else
					{
						r = nx;
						c = ny;
						count = 0;
					}
				}

				D = (D + 3) % 4;
				nx = r + dx[D];
				ny = c + dy[D];

				if (map[nx][ny] == 0)
				{
					count = 0;
					r = nx;
					c = ny;
					break;
				} 
				else
				{
					count++;
				}
			}

		}

		System.out.println(total_count);

	}

}
