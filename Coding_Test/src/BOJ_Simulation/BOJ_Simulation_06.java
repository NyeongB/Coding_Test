// Date : 2020.12.31
// Title : 주사위 굴리기
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Simulation

package BOJ_Simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_Simulation_06
{

	static int map[][];
	static int N, M, x, y, total;
	static int[] dir;
	static int[] dx = { 0, 0, 0, -1, 1 }; // 동서북남 -> 1,2,3,4 인덱스로 접근하기위해 편의상 맨앞에 0을 넣음
	static int[] dy = { 0, 1, -1, 0, 0 };

	static int[] hori_dice = new int[4]; // 주사위 가로
	static int[] verti_dice = new int[4]; // 주사위 세로

	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");

		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		x = Integer.parseInt(str[2]);
		y = Integer.parseInt(str[3]);

		total = Integer.parseInt(str[4]);

		map = new int[N][M];

		for (int i = 0; i < N; i++)
		{
			str = br.readLine().split(" ");
			for (int j = 0; j < M; j++)
			{
				map[i][j] = Integer.parseInt(str[j]);
			}
		}

		dir = new int[total];

		str = br.readLine().split(" ");

		for (int i = 0; i < total; i++)
			dir[i] = Integer.parseInt(str[i]);

		// 주사위 굴리기 시작
		for (int i = 0; i < total; i++)
		{
			int d = dir[i];
			int nx, ny; // 이동할 방향

			if (d == 1) // 동
			{
				nx = x + dx[1];
				ny = y + dy[1];
				if (!(nx >= 0 && nx < N && ny >= 0 && ny < M))
					continue;
				x = nx;
				y = ny;	// 유효성 검사이후엔 반영해줌
				
				// 주사위 돌리기
				int temp = hori_dice[0];
				for (int k = 0; k < 3; k++)
					hori_dice[k] = hori_dice[k + 1];

				hori_dice[3] = temp;
				verti_dice[1] = hori_dice[1];
				verti_dice[3] = hori_dice[3];

				// 주사위 찍기
				print(nx, ny);	// 반영했기에 x,y로 써도되긴함

			} else if (d == 2) // 서
			{

				nx = x + dx[2];
				ny = y + dy[2];
				if (!(nx >= 0 && nx < N && ny >= 0 && ny < M))
					continue;
				x = nx;
				y = ny;
				int temp = hori_dice[3];
				for (int k = 3; k > 0; k--)
					hori_dice[k] = hori_dice[k - 1];

				hori_dice[0] = temp;
				verti_dice[1] = hori_dice[1];
				verti_dice[3] = hori_dice[3];

				// 주사위 찍기
				print(nx, ny);
			} else if (d == 3) // 북
			{
				nx = x + dx[3];
				ny = y + dy[3];
				if (!(nx >= 0 && nx < N && ny >= 0 && ny < M))
					continue;
				x = nx;
				y = ny;

				int temp = verti_dice[0];
				for (int k = 0; k < 3; k++)
				{
					verti_dice[k] = verti_dice[k + 1];
				}

				verti_dice[3] = temp;
				hori_dice[1] = verti_dice[1];
				hori_dice[3] = verti_dice[3];

				// 주사위 찍기
				print(nx, ny);
			} else if (d == 4) // 남
			{
				nx = x + dx[4];
				ny = y + dy[4];
				if (!(nx >= 0 && nx < N && ny >= 0 && ny < M))
					continue;
				x = nx;
				y = ny;
				int temp = verti_dice[3];

				for (int k = 3; k > 0; k--)
				{
					verti_dice[k] = verti_dice[k - 1];
				}

				verti_dice[0] = temp;
				hori_dice[1] = verti_dice[1];
				hori_dice[3] = verti_dice[3];
				// 주사위 찍기
				print(nx, ny);
			}

		}

	}

	public static void print(int x, int y)
	{
		if (map[x][y] == 0)
		{
			map[x][y] = verti_dice[3];

		} else
		{
			verti_dice[3] = map[x][y];
			hori_dice[3] = map[x][y];
			map[x][y] = 0;
		}
		System.out.println(verti_dice[1]);
	}

}


// 주사위 방향 돌리는것만 참고했다... 
// 실수했던 부분이 nx, ny의 범위를 nx<=N, ny<=M으로 해서 한번 터지고
// 또 다른 실수 부분이 nx ny를 계산후에 유효성 검사후 x = nx, y = ny를 안해줘서 주사위가 평생 같은 지도에 머물게 한점이다.