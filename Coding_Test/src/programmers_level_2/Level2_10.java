// Date : 2020.09.10
// Title : 숫자의 표현
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : basic

package programmers_level_2;

public class Level2_10
{

	public static void main(String[] args)
	{
		Solution2_10 solution2_10 = new Solution2_10();
		System.out.println(solution2_10.solution(15));
	}
}

class Solution2_10 {
    public int solution(int n) {
        int answer = 0;
        
        for(int i=0; i<n; i++)
        {
            int temp = 0;
            for(int j=i+1; j<=n; j++)
            {
                
                temp +=j;
                
                if(temp==n)
                {   
                    answer++;
                    break;
                 }
                else if(temp>n)
                    break;
                
            }
            
        }
        
        return answer;
    }
}