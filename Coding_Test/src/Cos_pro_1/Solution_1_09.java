package Cos_pro_1;

class Solution_1_09
{
	public int solution(String[] bishops)			// 비숍들 피해서 놓을수있는 위치 반환 알고리즘 
													// 시간초과날까 아니면 이것보다 더 좋은 풀이가 있을까? 일단 킵
	{
		// 여기에 코드를 작성해주세요.
		int answer = 0;

		int[] dx =
		{ -1, -1, 1, 1 };
		int[] dy =
		{ -1, 1, -1, 1 };

		int[][] map = new int[9][9];

		for (String bishop : bishops)
		{
			int x = (int) (bishop.charAt(0) - 64);
			int y = bishop.charAt(1) - '0';
			System.out.println(x+" "+y);
			map[x][y] = 1;

			int tempX = x;
			int tempY = y;
			while (true)
			{
				tempX = dx[0] + tempX;
				tempY = dy[0] + tempY;
				
				if(! ((tempX >= 1 && tempX <= 8) && (tempY >= 1 && tempY <= 8)) )
					break;
				
				map[tempX][tempY] = 1;
			}

			tempX = x;
			tempY = y;
			while (true)
			{
				tempX = dx[1] + tempX;
				tempY = dy[1] + tempY;
				
				if(! ((tempX >= 1 && tempX <= 8) && (tempY >= 1 && tempY <= 8)) )
					break;
				map[tempX][tempY] = 1;
			}

			tempX = x;
			tempY = y;
			while (true)
			{
				tempX = dx[2] + tempX;
				tempY = dy[2] + tempY;
				
				if(! ((tempX >= 1 && tempX <= 8) && (tempY >= 1 && tempY <= 8)) )
					break;
				map[tempX][tempY] = 1;
			}

			tempX = x;
			tempY = y;
			while (true)
			{
				tempX = dx[3] + tempX;
				tempY = dy[3] + tempY;
				
				if(! ((tempX >= 1 && tempX <= 8) && (tempY >= 1 && tempY <= 8)) )
					break;
				map[tempX][tempY] = 1;
			}

		}
		
		
		for(int i=1; i<=8; i++)
		{
			for(int j=1; j<=8; j++)
			{
				if(map[i][j] == 0)
					answer++;
			}
		}

		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args)
	{
		Solution_1_09 sol = new Solution_1_09();
		String[] bishops1 =
		{ new String("D5") };
		int ret1 = sol.solution(bishops1);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

		String[] bishops2 =
		{ new String("D5"), new String("E8"), new String("G2") };
		int ret2 = sol.solution(bishops2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
	}
}