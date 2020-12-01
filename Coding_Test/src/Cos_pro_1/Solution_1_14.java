package Cos_pro_1;

import java.util.ArrayList;
import java.util.Collections;

class Solution_1_14	
{												// 4-9 각도 반환 알고리즘
	public String solution(int hour, int minute)
	{
		// 여기에 코드를 작성해주세요.
		String answer = "";

		double h_angle;
		if (hour != 0)
			h_angle = (double) hour / 12;
		else
			h_angle = 0;

		double m_angle;
		if (hour != 0)
			m_angle = (double) minute / 60;
		else
			m_angle = 0;

		return String.format("%.1f", Math.abs(h_angle - m_angle) * 360);
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args)
	{
		Solution_1_14 sol = new Solution_1_14();
		int hour = 3;
		int minute = 0;
		String ret = sol.solution(hour, minute);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}