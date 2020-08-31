// Date : 2020.08.29
// Title : 알파벳 찾기
// Author : Choi Cheol Nyeong
// Language : Java
// classification : String

package BOJ_String;

import java.util.Scanner;

public class BOJ_String_03
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();
		System.out.print(str.indexOf('a'));
		for (int i = 'b'; i <= 'z'; i++)
		{

			System.out.print(" "+str.indexOf((char) i));

		}

	}

}