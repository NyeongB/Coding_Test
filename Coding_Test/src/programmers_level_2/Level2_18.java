// Date : 2020.09.28
// Title : 영어 끝말잇기
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : BFS
 
package programmers_level_2;

import java.util.ArrayList;

public class Level2_18
{
	public static void main(String[] args)
	{
		Solution2_18 solution2_18 = new Solution2_18();
		
		int [] arr = solution2_18.solution(2,new String [] {"hello", "one", "even", "never", "now", "world", "draw"});
		
		for(int num : arr)
			System.out.print(num+" ");
		
	}
	
	
}


class Solution2_18 {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int man = 0;
        int num = 0;
        ArrayList<String> list = new ArrayList<>();
        
        int manCount = 0;
        int numCount = 0;
        for(int i=0; i<words.length; i++)
        {
            if(list.indexOf(words[i])>=0) // 중복 발생
            {
               // System.out.println("중복");
                man = manCount + 1;
                
                num = numCount + 1;
                break;
            }
            else
            {
                list.add(words[i]);
            }
            
            
            if(i>0) // 이전 끝말잇기 탈락 
            {
                String temp1 = words[i-1]; // 이전 단어
                String temp2 = words[i];    // 지금 단어
                
                if(temp1.charAt(temp1.length()-1)!=temp2.charAt(0))
                {
                    //System.out.println("단어이상");
                    man = manCount + 1;
                    
                    num = numCount + 1;
                    break;
                }
            }
           if(manCount==n-1)
                numCount++;  
          manCount =   (manCount + 1)%n;
           
            
        }
        
        answer[0] = man;
        answer[1] = num;
        
        return answer;
    }
}