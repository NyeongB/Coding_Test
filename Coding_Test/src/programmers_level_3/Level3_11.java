// Date : 2020.11.04
// Title : 단속카메라
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : 그리디

package programmers_level_3;

import java.util.ArrayList;

public class Level3_11
{

	public static void main(String[] args)
	{
		Solution3_11 solution = new Solution3_11();
		int [][] result = solution.solution(4);
		
		for(int i=0; i<result.length; i++)
		{
			System.out.println(result[i][0]+","+result[i][1]);
		}
	}
	

}

class Solution3_11
{

    static ArrayList<int []> sequence = new ArrayList<>();
    
    public int[][] solution(int n) {
        
        
        hanoi(n, 1, 3, 2);
        
        int[][] answer = new int[sequence.size()][2];
        
        for(int i=0; i<answer.length; i++)
        {
            int [] temp = sequence.get(i);
            answer[i][0] = temp[0];
            answer[i][1] = temp[1];
        }
        
        return answer;
    }
    
    public void hanoi(int n, int from, int to, int via)
    {
        int [] move = new int []{from, to};
        
        if(n == 1)
        {
            sequence.add(move);
        }
        else
        {
            hanoi(n-1, from, via, to);
            sequence.add(move);
            hanoi(n-1, via, to, from);
        }
    }
}

// 거의 문제 푸는방식을 외워야할듯
// 처음에 접근은 2*n - 1 의 배열에 접근하는건데 단순하게 잘못생각해서 큰게 작은거위로 올라가는 코드였다