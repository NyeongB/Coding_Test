// Date : 2020.08.22
// Title : 직사각형 좌표 구하기
// Author : Choi Cheol Nyeong
 
package programmers_test;

public class Test_01
{
	public static void main(String[] args)
	{
		
		int [][] arr = {{1,4},{3,4},{3,10}};
		
		Solution solution = new Solution();
		int [] answer = solution.solution(arr);
		
		System.out.printf("[%d, %d]\n",answer[0],answer[1]);
	}
	
}

class Solution {
    public int[] solution(int[][] v) {
        int[] answer = new int [2];
        
        if(v[0][0]==v[1][0])
            answer[0] = v[2][0];
        else if(v[0][0]==v[2][0])
            answer[0] = v[1][0];
        else
            answer[0] = v[0][0];
        
        if(v[0][1]==v[1][1])
            answer[1] = v[2][1];
        else if(v[0][1]==v[2][1])
            answer[1] = v[1][1];
        else
            answer[1] = v[0][1];
        

        return answer;
    }
}