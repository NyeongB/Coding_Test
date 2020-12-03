// Date : 2020.10.07, 20.11.17, 20.12.03
// Title : 주식 가격
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : 

package programmers_level_2;


public class Level2_21
{
	public static void main(String[] args)
	{
		Solution2_21 solution2_21 = new Solution2_21();
		int [] arr = solution2_21.solution(new int[] {1,2,3,2,3});
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
	}

}
class Solution2_21 {
	
public int[] solution(int[] prices) {
        
        int len = prices.length;
        int[] answer = new int[len];
        
        
        for(int i=0; i<len; i++)
        {
            int time = 0;
            
            for(int j=i+1; j<len; j++)
            {
                time++;
                if(prices[i]>prices[j])
                    break;
            }
            
            answer[i] = time;
        }
        
        
        return answer;
    }
	
	
	/*
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i=0; i<answer.length; i++)
        {
            int cnt = 0;
            for(int j=i+1; j<answer.length; j++)
            {
                cnt++;
                if(prices[i]>prices[j])
                    break;
            }
            answer[i] = cnt;
        }
        
        return answer;
    }
    */
}

// 스택으로 안푸는 방식으로 접근하였다.
// 처음 접근방법과 정답이 한끝차이인데
// 시간초과는 이해하는데 왜 틀렸는지는 분석해봐야 알것같다.

/*
class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i=0; i<answer.length; i++)
        {
            int cnt = 0;
            for(int j=i+1; j<answer.length; j++)
            {
                if(prices[i]<=prices[j])
                    cnt++;
            }
            answer[i] = cnt;
        }
        
        return answer;
    }
}
*/
