// Date : 2020.08.22
// Title : 모의고사
// Author : Choi Cheol Nyeong
 
package programmers_level_1;

public class Level1_12
{
	public static void main(String[] args)
	{
		int []	 arr = {1,1,2,4,2};
		Solution1_12 solution = new Solution1_12();

		int [] sol = solution.solution(arr);
		
		for(int i=0; i<sol.length; i++)
		{
			System.out.println(sol[i]);
		}
	}
}

class Solution1_12 {
    public static int[] solution(int[] answers) {
        int [] su1 = {1,2,3,4,5};
        int [] su2 = {2,1,2,3,2,4,2,5};
        int [] su3 = {3,3,1,1,2,2,4,4,5,5};
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        for(int i=0; i<answers.length; i++)
        {
            if(su1[i%5]==answers[i])
                c1++;
            if(su2[i%8]==answers[i])
                c2++;
            if(su3[i%10]==answers[i])
                c3++;
        }
        
        int max = Math.max(c1,c2);
        max = Math.max(max,c3);
        
        int count=0;
        if(max==c1)
            count++;
        if(max==c2)
            count++;
        if(max==c3)
            count++;
        
        int[] answer = new int[count];
        
        int index=0;
        if(max==c1)
            answer[index++] = 1;
       if(max==c2)
            answer[index++] = 2;
         if(max==c3)
            answer[index++] = 3;
        
        return answer;
    }
    
}
