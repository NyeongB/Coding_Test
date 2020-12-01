package Cos_pro_1;

class Solution_1_07
{
	public String solution(String s)
	{
		s += '#';
		String answer = "";
		for (int i = 0; i < s.length(); ++i)
		{ 												// 문자열에서 중복된 0을 제거하는 알고리즘
			if (s.charAt(i) == '0' && s.charAt(i + 1) != '0') // && 에서 앞에가 false이면 뒤에는 보지도않는다는걸 이용함 #
				answer += "0";
			else if (s.charAt(i) == '1')
				answer += "1";
		}
		return answer;
	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만
	// 수정하세요.
	public static void main(String[] args)
	{
		Solution_1_07 sol = new Solution_1_07();
		String s = "101100011100";
		String ret = sol.solution(s);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}