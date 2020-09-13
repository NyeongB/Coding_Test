// Date : 2020.08.22
// Title : 체육복
// Author : Choi Cheol Nyeong

package programmers_level_1;

import java.util.HashSet;
public class Level1_13
{
	public static void main(String[] args)
	{
		Solution1_13 solution1_13 = new Solution1_13();
		int n = 5;
		int[] lost =
		{ 2, 4 };
		int[] reserve =
		{ 1, 3, 5 };
		System.out.println(solution1_13.solution(n, lost, reserve));
	}

}


class Solution1_13 {
    public int solution(int n, int[] lost, int[] reserve) {
        
        int answer = n - lost.length; // 전체 학생수 - 도난당한 학생수 로 시작 
        
        HashSet<Integer> hm = new HashSet<>();
        
        for(int num : reserve)  // 체육복 빌려주는 해쉬 셋에 학생 넣기
        {
            hm.add(num);
        }
        
        for(int i=0; i<lost.length; i++)
        {
            if(hm.contains(lost[i]))
            {
                answer++;
                
                hm.remove(lost[i]);
                lost[i] =-1;        // 도난당했지만 자신은 여벌로 살아남음 체육복 빌릴 필요가없음 
            }
        }
        
        for(int i=0; i<lost.length; i++)
        {
            if(hm.contains(lost[i]-1))  // -1, +1 을보면서 체육복을 빌리고 빌린다음 해쉬 셋에서 삭제 
            {
                hm.remove(lost[i]-1);
                answer++;
            }
            else if(hm.contains(lost[i]+1))
            {
                hm.remove(lost[i]+1);
                answer++;
            }
        }
        
        
        
        return answer;
    }
}
/*
class Solution1_13
{
	public int solution(int n, int[] lost, int[] reserve)
	{
		int answer = 0;
		answer = n - lost.length;
		for (int i = 0; i < lost.length; i++)
		{
			for (int j = 0; j < reserve.length; j++)
			{
				if (lost[i] == reserve[j])
				{
					answer++;
					reserve[j] = -1;
					lost[i] = -1;
					break;

				}
			}
		}

		for (int i = 0; i < lost.length; i++)
		{
			for (int j = 0; j < reserve.length; j++)
			{
				if (Math.abs(reserve[j] - lost[i]) == 1)
				{
					reserve[j] = -1;
					answer++;
					break;
				}
			}
		}
		return answer;
	}
}
*/

