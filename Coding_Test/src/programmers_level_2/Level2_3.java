// Date : 2020.08.22
// Title : 전화번호 목록
// Author : Choi Cheol Nyeong
// Language : Java
 
package programmers_level_2;

public class Level2_3
{
	public static void main(String[] args)
	{
		String [] str = {"119","97674223","1195524421"};
		Solution2_3 solution2_3 = new Solution2_3();
		System.out.println(solution2_3.solution(str));
	}
	
}

class Solution2_3 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int len = phone_book.length;
        
        for(int i=0; i<phone_book.length; i++)
        {
            for(int j=0; j<phone_book.length; j++)
            {
                if(i==j) continue;
                
                if(phone_book[j].indexOf(phone_book[i])==0) // 접두어에있다면
                    return false; // 바로 리턴(시간 때문에)
            }
        }
        return answer;
    }
}