// Date : 2020.10.25
// Title : 풍선 터뜨리기
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : 

package programmers_level_3;

import java.util.HashSet;

public class Level3_08
{

	public static void main(String[] args)
	{
		Solution3_08 solution3_08 = new Solution3_08();
		System.out.println(solution3_08.solution(new int[] {-16,27,65,-2,58,-92,-71,-68,-61,-33}));
	}

}

class Solution3_08 {
    public int solution(int[] a) {
        int answer = 0;
        
        HashSet<Integer> hs = new HashSet<>();
        
        int min = a[0];
        for(int i=1; i<a.length; i++)
        {
            hs.add(min);
            min = Math.min(min,a[i]);
        }
        
        min = a[a.length-1];
        for(int i=a.length-2; i>=0; i--)
        {
            hs.add(min);
            min = Math.min(min,a[i]);
        }
        
        answer = hs.size();
        
        return answer;
    }
}