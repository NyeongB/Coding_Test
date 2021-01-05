// Date : 2021.01.05
// Title : 틱택토
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Simulation

package BOJ_Simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_Simulation_07
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		while (true)
		{
			String[] input = br.readLine().split("");

			if (input[0].equals("e"))
				break;

			char[][] map = new char[3][3];

			int X = 0;
			int O = 0;

			// 초기화
			for (int i = 0; i < 3; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					char temp = input[i * 3 + j].charAt(0);
					if (temp == 'O')
						O++;
					else if (temp == 'X')
						X++;

					map[i][j] = temp;
				}
			}

			// invalid인 경우
			// 1. X와O의 차이가 2이상일경우
			// 2. O가 더 클경우
			// 3. 빙고가 여러개인경우(직선과 사선이 한개씩 겹친느건 가능)
			// 4. 빙고가 없는경우

			if (Math.abs(X - O) > 1 || O > X)
			{
				sb.append("invalid\n");
				continue;
			}

			int rowX_B = 0;
			int rowO_B = 0;
			int colX_B = 0;
			int colO_B = 0;
			int crossX_B = 0;
			int crossO_B = 0;

			// 직선 검사
			for (int i = 0; i < 3; i++)
			{
				int rowX = 0;
				int rowO = 0;
				int colX = 0;
				int colO = 0;
				for (int j = 0; j < 3; j++)
				{
					if (map[i][j] == 'X')
						rowX++;
					else if (map[i][j] == 'O')
						rowO++;

					if (map[j][i] == 'X')
						colX++;
					else if (map[j][i] == 'O')
						colO++;

					if (rowX == 3)
						rowX_B++;
					else if (rowO == 3)
						rowO_B++;
					else if (colO == 3)
						colO_B++;
					else if (colX == 3)
						colX_B++;

				}
			}

			int crossX = 0;
			int crossO = 0; // 대각선 검사
			for (int i = 0; i < 3; i++)
			{
				if (map[i][i] == 'X')
					crossX++;
				else if (map[i][i] == 'O')
					crossO++;
				if (crossO == 3)
					crossO_B++;
				if (crossX == 3)
					crossX_B++;
			}
			crossX = 0;
			crossO = 0;
			int temp = 0;
			for (int i = 2; i >= 0; i--)
			{
				if (map[i][temp] == 'X')
					crossX++;
				else if (map[i][temp] == 'O')
					crossO++;
				temp++;
				if (crossO == 3)
					crossO_B++;
				if (crossX == 3)
					crossX_B++;
			}

			// 같은 라인 빙고가 여러개인 경우 (cross제외)
			if (rowX_B > 1 || colX_B > 1 || rowO_B > 1 || colO_B > 1)
			{
				sb.append("invalid\n");
				continue;
			}

			// X와 O가 같으면 O가 이겨야한다
			if (X == O)
			{
				if ((rowX_B > 0 || colX_B > 0 || crossX_B > 0))
				{
					sb.append("invalid\n");
					continue;
				}
			} else if (X > O)
			{ // X가 더 크면 X가 이겨야 한다
				if (rowO_B > 0 || colO_B > 0 || crossO_B > 0)
				{
					sb.append("invalid\n");
					continue;
				}
			}

			// x와 o의 합이 9인 경우

			if (X + O == 9)
			{
				sb.append("valid\n");
				continue;
			}

			// 빙고가 하나도 없는 경우
			if (rowX_B + colX_B + rowO_B + colO_B + crossO_B + crossX_B == 0)
			{
				sb.append("invalid\n");
				continue;
			}

			sb.append("valid\n");

		} // while 끝

		System.out.println(sb.toString());
	}
}

// 백트래킹으로는 어떻게 풀지 고민해야한다.
// 그냥 경우를 나눠서 해결한 케이스