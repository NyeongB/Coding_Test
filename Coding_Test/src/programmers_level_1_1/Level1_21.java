// Date : 2020.08.24
// Title : 정수 제곱근 판별
// Author : Choi Cheol Nyeong
// Language : Java
 
package programmers_level_1_1;

public class Level1_21
{
	public static void main(String[] args)
	{
		Solution1_21 solution1_21 = new Solution1_21();
		System.out.println(solution1_21.solution(121));
	}
	
}

class Solution1_21 {
    public long solution(long n) {
        long answer = 0;
        long num = (long)Math.sqrt(n);
        if(num*num!=n)
            return -1;
        
        answer = (num+1)*(num+1);
        return answer;
    }
}