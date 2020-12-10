// Date : 2020.12.08, 20.12.10
// Title : 오늘 날짜
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.util.Calendar;

public class BOJ_Basic_38
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();

		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		
		System.out.printf("%d-%d-%d",year, month, day);
	}
}

// MONTH 같은 경우는 1월달이 0으로 나오기 때문에 1을 추가해줘야한다.