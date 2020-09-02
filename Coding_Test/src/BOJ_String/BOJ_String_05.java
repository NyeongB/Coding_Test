// Date : 2020.09.02
// Title : 단어 공부
// Author : Choi Cheol Nyeong
// Language : Java
// classification : String
 
package BOJ_String;

import java.util.Scanner;

public class BOJ_String_05
{
	
	static int [] alpa = new int[26];
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		str = str.toUpperCase();
		
		for(int i=0; i<str.length(); i++)
		{
			alpa[str.charAt(i)-'A']+=1;
		}
		
		
		
        int max = -1;
        char answer = '?';
 
        for(int i=0; i<26; i++) {
            if(alpa[i] > max) {
                max = alpa[i];
                answer = (char) (i+65);
            } else if(alpa[i] == max)
                answer = '?';
        }
 
        System.out.println(answer);
		
		
	}
	
}