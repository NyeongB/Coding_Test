// Date : 2020.09.10
// Title : N개의 최소공배수
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : basic

package programmers_level_2;

public class Level2_11
{

	public static void main(String[] args)
	{
		Solution2_11 solution2_11 = new Solution2_11();
		System.out.println(solution2_11.solution(new int [] {2,6,8,14}));
	}
}


class Solution2_11 {
    public int solution(int[] arr) {
        int answer = 0;
        
        int temp = arr[0];
        
        for(int i=1; i<arr.length; i++)
        {
            temp = getLcm(temp,arr[i]);
        }
        
        answer = temp;
        
        return answer;
    }
    
    public int getLcm(int a, int b)     // 최소 공배수 반환 메소드 
    {
        int result = a*b;
        while(b>0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }
        
        result /= a;	// a는 최대 공약수
        
        return result;
    }
}