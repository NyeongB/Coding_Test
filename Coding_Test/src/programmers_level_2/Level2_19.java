// Date : 2020.09.29
// Title : 멀쩡한 사각형
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : 
 
package programmers_level_2;


public class Level2_19
{
	public static void main(String[] args)
	{
		
		Solution2_19 solution2_19 = new Solution2_19();
		
		System.out.println(solution2_19.solution(8, 12));
		
	}
	
	
}

class Solution2_19 {
    public long solution(long w, long h) {
        
        long tempW = w;
        long tempH = h;
        long gdc = 0;
        
        while(tempH>0)
        {
            long temp = tempW%tempH;
            tempW = tempH;
            tempH = temp;
        }
        
        gdc = tempW;
        
        return w*h - (w + h - gdc);
    }
}

// 처음에 일일이 공책에다가 적어가며 규칙을 파악하려고 힘썼다.
// 하지만 답이 없다는것을 깨닫고 여러 블로그를 참고하여 알아본결과
// 최대공약수 패턴이 반복된다고 설명하여 고대로 참고하여 문제를 해결하였다.
// 아직도 너무 부족하다는것을 많이 느낀다..