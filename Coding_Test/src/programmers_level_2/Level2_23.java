// Date : 2020.10.13
// Title : 점프와 순간 이동
// Author : Choi Cheol Nyeong
 
package programmers_level_2;


public class Level2_23
{
	public static void main(String[] args)
	{
	}
	
}

class Solution2_23 {
    public int solution(int n) {
        int ans = 0;

        while(n!=0)
        {
            if(n%2==0)
            {
                n /= 2;
            }
            else
            {
                n--;
                ans++;
            }
        }

        return ans;
    }
}

// 문제 자체가 처음엔 DFS 문제인가 생각했다 백준에서 비슷한 문제를 풀어봐서인가
// 하지만 풀지못했고 해설을 보고 이해하였다
// 규칙성을 찾고 거꾸로 볼수있는 눈이 필요한것같다.