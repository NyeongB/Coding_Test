// Date : 2020.10.20
// Title : 분해합
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Bruteforcing

package BOJ_Bruteforcing;

import java.util.Scanner;

public class BOJ_Bruteforcing_02
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int min = num;

		String str = "" + num;

		int minNum = num;	// 가장 낮은 값(탐색할)

		minNum -= 9 * str.length();

		for (int i = num; i > minNum; i--)	// 자기자신부터 가장 낮은값까지 탐색진행
		{
			int temp = i;
			int total = 0;
			str = "" + i;

			total += i;
			/*
			 * for(int j=0; j<str.length(); j++) { total += str.charAt(j) - '0'; }
			 */

			while (temp > 0)
			{
				total += temp % 10;
				temp /= 10;
			}

			if (total == num)
			{
				min = Math.min(min, i);
			}

		}

		if (min != num)
			System.out.println(min);
		else
			System.out.println(0);
	}
}

// 기존의 코드도 맞았으나 조금더 효율적으로 변형 시켜보았다.
// 우선 컨섭은 분해합은 아무리 작아봤자 자리수 * -9 를 한 값밑으로는 안떨어질거라는 
// 생각으로 최소 범위를 제한 하였다.

/*
 * public static void main(String[] args) { Scanner sc = new Scanner(System.in);
 * 
 * int num = sc.nextInt();
 * 
 * int min = num;
 * 
 * String str = "" + num;
 * 
 * int minNum = num;
 * 
 * for(int i=0; i<str.length(); i++) { minNum -=9; }
 * 
 * for(int i=num; i>minNum; i--) { int total = 0; str = "" + i;
 * 
 * total += i; for(int j=0; j<str.length(); j++) { total += str.charAt(j) - '0';
 * }
 * 
 * if(total==num) { min = Math.min(min, i); }
 * 
 * }
 * 
 * if(min!=num) System.out.println(min); else System.out.println(0); }
 */
