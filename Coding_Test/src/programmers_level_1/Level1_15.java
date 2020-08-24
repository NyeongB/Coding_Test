// Date : 2020.08.24
// Title : 2016년
// Author : Choi Cheol Nyeong
 
package programmers_level_1;

public class Level1_15
{
	public static void main(String[] args)
	{
		Solution1_15 solution1_15 = new Solution1_15();
		System.out.println(solution1_15.solution(4, 29));
	}
	
}

class Solution1_15 {
	   String solution(int a, int b) {
	      String [] day ={"SUN","MON","TUE","WED","THU","FRI","SAT"};
	      int [] month = {31,29,31,30,31,30,31,31,30,31,30,31};
	      int sum = 5;
	      for(int i=1; i<a; i++){
	          sum+=month[i-1];
	      }
	      sum+=b;
	      String answer = day[(sum-1)%7];
	      return answer;
	  }

	   
	}