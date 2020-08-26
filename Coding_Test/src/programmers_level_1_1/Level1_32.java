// Date : 2020.08.26
// Title : 완주하지 못한 선수
// Author : Choi Cheol Nyeong
// Language : Java
 
package programmers_level_1_1;

import java.util.HashMap;

public class Level1_32
{
	public static void main(String[] args)
	{
		String[] participant = {"mislav", "stanko", "mislav", "ana"	}; 
		String[] completion = {"stanko", "ana", "mislav"};
		Solution1_32 solution1_32 = new Solution1_32();
		System.out.println(solution1_32.solution(participant, completion));
	}
	
}

class Solution1_32 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        
        for(String p : participant)
        {
        	if(hm.get(p)!=null)
        	{
        		hm.put(p, hm.get(p)+1);
        		//System.out.println(hm.get(p));
        	}
        	else
        	{
        		hm.put(p, 1);
        	}
        }
        
        
        for(String c : completion)
        {
        	if(hm.get(c)!=null)
        	{
        		hm.put(c, hm.get(c)-1);
        	}
        }
        
        for(String result : hm.keySet())
        {
        	if(hm.get(result)==1)
        		answer = result;
        }
        
        
        
        return answer;
    }
}