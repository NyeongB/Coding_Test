// Date : 2020.08.24
// Title : 최대공약수와 최소공배수
// Author : Choi Cheol Nyeong
// Language : Java
 
package programmers_level_1_1;

public class Level1_23
{
	public static void main(String[] args)
	{
		Solution1_23 solution1_23 = new Solution1_23();
		int [] arr = solution1_23.solution(2, 5);
		System.out.println("GCD : "+arr[0]+" LCM : "+arr[1]);
	}
	
}

class Solution1_23 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int result = n*m;
        
        while(n%m!=0)
        {
            int temp = n%m;
            n = m;
            m = temp;
        }
        answer[0] = m;
        answer[1] = result/m;
        
        
        return answer;
    }
}