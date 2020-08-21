// Date : 2020.08.20
// Title : 약수의 합
// Author : Choi Cheol Nyeong
 
package programmers_level_1;

public class Level1_04
{
	public static void main(String[] args)
	{
		Solution1_4 solution1_4 = new Solution1_4();
		System.out.println(solution1_4.solution(12));
	}
	
}

class Solution1_4 {
    public int solution(int n) {
        int answer = 0;
        
        
        //n을 n/2 말고 약수 값으로 바꾸면 보다 효율적으로 고칠 수 있습니다.
        //포문 돌아가는 숫자를에서 절반 이하로 떨어트릴 수 있어요.
        // 맨 마지막에 n을 더해줌 절반까지 돌리면 n을 안더해주기때문에
        


        for(int i=1; i<=n/2; i++)
        {
            if(n%i==0)
                answer += i;
        }
        
        return answer+n;
    }
}