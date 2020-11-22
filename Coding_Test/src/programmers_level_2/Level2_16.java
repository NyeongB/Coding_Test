// Date : 2020.09.25, 20.11.22
// Title : 스킬트리
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : 
 
package programmers_level_2;

import java.util.ArrayList;

public class Level2_16
{
	public static void main(String[] args)
	{
		Solution2_16 solution2_16 = new Solution2_16();
		System.out.println(solution2_16.solution("CBD", new String[] {"BACDE", "CBADF", "AECB", "BDA"}));
	}
	
}

class Solution2_16 {
	 public int solution(String skill, String[] skill_trees) {
	        int answer = 0;
	        
	        ArrayList<Character> skill_list = new ArrayList<>();    // 스킬이 있는지 없는지 체크할려고 
	        
	        for(int i=0; i<skill.length(); i++)
	        {
	            skill_list.add(skill.charAt(i));
	        }
	        
	        
	        for(int i=0; i<skill_trees.length; i++)
	        {
	            String s = skill_trees[i];
	            int index = 0;
	            boolean flag = true;
	            
	            for(int j=0; j<s.length(); j++)
	            {
	                char temp = s.charAt(j);
	                
	                if(skill_list.indexOf(temp)>-1) // 있는 스킬이라면 아니면 넘김 
	                {
	                    
	                    if(skill_list.get(index) != temp)   // 여기서 걸리면 앞스킬 하기도전에 뒷스킬로 한거임 
	                        flag = false;
	                    else
	                        index++;
	                    
	                }
	            }
	            
	            if(flag)
	                answer++;
	            
	        }
	        
	        return answer;
	    }
	/*
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;

        for(int i=0; i<skill_trees.length; i++)
        {
            if(check(skill, skill_trees[i]))
                answer++;
        }

        return answer;
    }

    public boolean check(String skill, String str)
    {
        boolean result = true;
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0; i<skill.length(); i++)
        {
            list.add(skill.charAt(i));
        }
        int count = 0;
        int temp=0;
        int flag = 0;
        for(int i=0; i<str.length(); i++)
        {
            int index = list.indexOf(str.charAt(i));
           // System.out.println(str.charAt(i)+":"+index);
            if(index>=0)
            {
                if(count==0)
                {
                    if(index>=1&&flag==0)
                    {
                        return false;
                    }
                    temp = index;
                    count++;
                    flag++;
                }
                else
                {
                    if(Math.abs(temp-index)>=2)
                        return false;

                    if(temp>index)
                        return false;
                    count = 0;
                }
            }
        }

        return result;
    }
    */
}

/*	처음 도전 솔루션 64.3 / 100
 * 스킬 트리를 하나의 어레이 리스트에 담아서 
 * 스킬트리에 해당하는 것이 들어왔을때 
 * 이전 스킬트리의 인덱스의 높낮이를 비교하였음
 * 실패
 * 
 * 원인을 파악함 CBD / CAADAB 일떄 오류남 
 * 스킬트리 인덱스가 2 차이날떄도 틀렸다 판별하니 바로 해결
 * 
 * 문제를 해결하였지만 일반적인 방법이 아닌것같다
 * 다수가 자료구조를 활용하는데
 * 단순히 배열의 순서로만 푼듯하다
 * 다른것을 보고 학습필요
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(int i=0; i<skill_trees.length; i++)
        {
            if(check(skill, skill_trees[i]))
                answer++;
        }
        
        return answer;
    }
    
    public boolean check(String skill, String str)
    {
        boolean result = true;
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0; i<skill.length(); i++)
        {
            list.add(skill.charAt(i));
        }
        int count = 0;
        int temp=0;
        int flag = 0;
        for(int i=0; i<str.length(); i++)
        {
            int index = list.indexOf(str.charAt(i));
            System.out.println(str.charAt(i)+":"+index);
            if(index>=0)
            {
                if(count==0)
                {
                    if(index>=1&&flag==0)
                    {
                        return false;
                    }
                    temp = index;
                    count++;
                    flag++;
                }
                else
                {
                    if(temp>index)
                        return false;
                    count = 0;
                }
            }
        }
        
        return result;
    }
}
*/
