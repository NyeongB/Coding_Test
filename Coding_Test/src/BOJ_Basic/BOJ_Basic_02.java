// Date : 2020.09.01
// Title : 최대공약수
// Author : Choi Cheol Nyeong
// Language : Java

// 재귀사용, 유클리드 호제법

package BOJ_Basic;

import java.util.Scanner;

public class BOJ_Basic_02 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long num1 = sc.nextLong();
        long num2 = sc.nextLong();
        
        long gcd = getGCD(Math.max(num1, num2), Math.min(num1, num2));
        
        StringBuffer sb = new StringBuffer();
        for(int i=1; i <= gcd; i++) sb.append("1");
        
        System.out.println(sb.toString());
            
    }
    
    public static long getGCD(long a, long b) {
       if(b==0)
    	   return a;
       else
    	   return getGCD(b , a % b);
    }
}

/*
유클리드 호제법을 이용한 재귀로 풀어 시간초과가 나오는줄알았는데
System.out.print("1"); 로 했다고 시간초과가 뜬다.
StringBuffer 나 StringBuilder를 사용하면 시간초과가 뜨지않는다.. 

*/

/*

오버헤드 쌓여 성능 저하를 초래하게 된다.

이러한 이유로 프로젝트에서는 System.out.println으로 로그를 남기지 말라는 이야기가 있는 것이다.



그렇기에 알고리즘 문제에서는 출력할 데이터들을 모아두고 한번의 System.out.println을 이용해 출력하는 방법을 사용한다.



그 방법을 StringBuilder을 활용하는 것이다.

StringBuilder 클래스는 String과 동일하지만 문자열을 보다 쉽게 조작할 수 있는 클래스이다.



출처: https://mygumi.tistory.com/83 [마이구미의 HelloWorld]
*/
