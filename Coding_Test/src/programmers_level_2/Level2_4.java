// Date : 2020.08.22
// Title : 피보나치 수
// Author : Choi Cheol Nyeong
// Language : Java
 
package programmers_level_2;

public class Level2_4
{
	public static void main(String[] args)
	{
		Solution2_4 solution2_4 = new Solution2_4();
		System.out.println(solution2_4.solution(20));
	}
	
}

class Solution2_4 {
    public int solution(int n) {
        int answer = 0;
        
        int [] arr = new int[100001];
        arr[0] = 0;
        arr[1] = 1;
        
        if(n<=1)
            return 1;
        
        for(int i=2; i<=n; i++)
        {
            arr[i] = (arr[i-1]+ arr[i-2])% 1234567;
        }
        
        answer = arr[n] ;
        
        return answer;
    }
}