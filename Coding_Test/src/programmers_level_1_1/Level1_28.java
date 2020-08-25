// Date : 2020.08.24
// Title : 직사각형 별찍기
// Author : Choi Cheol Nyeong
// Language : Java
 
package programmers_level_1_1;

import java.util.Scanner;

public class Level1_28
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i=0; i<b; i++)
        {
            for(int j=0; j<a; j++)
                System.out.print("*");
            System.out.println();
        }
    }
	
}
