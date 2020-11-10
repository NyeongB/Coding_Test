// Date : 2020.11.10
// Title : 조이스틱
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : 그리디

package programmers_level_2;


public class Level2_28
{
	public static void main(String[] args)
	{

		Solution2_28 solution = new Solution2_28();
		System.out.println(solution.solution("JEROEN"));
		
	}

}

class Solution2_28
{
    public int solution(String name) {
        
		int len = name.length();
		int min_move = len-1; // A가 안나왔을때 최소 이동횟수

		int answer = 0 ;
		
		for(int i=0; i<len; ++i) {
            
            // 문자 변형 카운트
			if(name.charAt(i)<='M') {
				answer += name.charAt(i)-'A';
			}
			else {
				answer +='Z'-name.charAt(i)+1;
			}
			
			// 최소 이동거리 
			int next = i+1;
			while(next<len && name.charAt(next)=='A') {
				++next;
			}
			min_move = Math.min(min_move,i+len-next+Math.min(i,len-next));
			
			
		}
		answer += min_move;
        
        return answer;
    }
}