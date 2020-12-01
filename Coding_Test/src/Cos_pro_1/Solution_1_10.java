package Cos_pro_1;

class Solution_1_10
{
	public int solution(String s1, String s2)	// 3 - 4
	{
		// 여기에 코드를 작성해주세요.

		int len_1 = sum_String(s1, s2);
		int len_2 = sum_String(s2, s1);
		//System.out.println(len_1 + " "+ len_2);
		int answer = Math.min(len_1, len_2);
		return answer;
	}

	public int sum_String(String s1, String s2)			// 문자열 끝과 끝 포개는 알고리즘
	{
		boolean flag = false;

		int len_s1 = s1.length();
		int len_s2 = s2.length();
		int min = len_s1 + len_s2;
		int idx = 0;

		while (len_s1 - 1 - idx >= 0 && idx < len_s2)
		{
			if (s1.substring(len_s1 - 1 - idx).equals(s2.substring(0, idx + 1)))
			{
				// System.out.println(len_s1-1-idx+" "+ (idx+1));
				flag = true;
				min = Math.min(min, len_s1 + len_s2 - (idx + 1));
			}
			idx++;
			// System.out.println(idx);
		}

		if (flag)
			return min;
		else
			return len_s1 + len_s2;

	}

	// 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
	public static void main(String[] args)
	{
		Solution_1_10 sol = new Solution_1_10();
		// String s1 = new String("ababc");
		// String s2 = new String("abcdab");

		String s1 = new String("abcde");
		String s2 = new String("abcdeff");

		int ret = sol.solution(s1, s2);

		// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
		System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}
}