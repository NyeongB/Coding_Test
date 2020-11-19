// Date : 2020.09.10, 20.11.19
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
        
        
        for(int i=1; i<=n; i++) // 1부터 n까지 다 확인 
        {
            
            int j = i;
            int sum = 0; // sum에 1씩 증가시키며 n이랑 같은지 비교
            
            while(true)
            {
                sum += j++;
                if(sum == n)    // n이랑 같으면 answer++ 하고 탈출 
                {
                    answer++;
                    break;
                }
                else if(sum > n)    // n보다 크면 더이상 볼필요없이 while 탈출
                    break;
            }
        }
        
        return answer;
    }
	
	/*
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
    */
}