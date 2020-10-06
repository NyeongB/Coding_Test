// Date : 2020.10.06
// Title : 베스트 앨범
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Hash
 
package programmers_level_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Level3_03
{
	public static void main(String[] args)
	{
		String[] genres = new String[] {"classic", "pop", "classic", "classic", "pop"};
		int[] plays = new int[] {500, 600, 150, 800, 2500};
		Solution3_03 solution = new Solution3_03();
		
		  int [] arr = solution.solution(genres, plays);
		  
		  for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
	}
}


class Solution3_03 {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        
        HashMap<String,Integer> hm = new HashMap<>();
        
        ArrayList<Node> list1 = new ArrayList<Solution3_03.Node>();
        
        for(int i=0; i<genres.length; i++)
        {
            String tempG = genres[i];
            int tempP = plays[i];
            
            if(hm.get(tempG)!=null)
            	hm.put(tempG,hm.get(tempG)+tempP);
            else
            	hm.put(tempG,tempP);
            
            list1.add(new Node(tempG,tempP,i));
        }
        //System.out.println(hm.size());
        answer = new int[hm.size()*2];
        ArrayList<Node> list = new ArrayList<Solution3_03.Node>();
        
        for(String str : hm.keySet())
        {
        	//System.out.println(str + " "+": "+hm.get(str));
        	 list.add(new Node(str,hm.get(str)));
        }
        
		/*
		 * for(Node temp : list) { System.out.println(temp.key+" "+temp.value); }
		 */
        
        Collections.sort(list, new Comparator<Node>()
		{
        	@Override
        	public int compare(Node o1, Node o2)
        	{
        		if(o1.value<o2.value)
        			return 1;
        		else
        			return -1;
        	}
		});
        
        Collections.sort(list1,new Comparator<Node>() {
        	public int compare(Node a, Node b)
        	{
        		if(a.value<b.value)
        		{
        			return 1;
        		}
        		else if(a.value == b.value)
        		{
        			if(a.i>b.i)
        				return 1;
        			else
        				return -1;
        		}
        		else
        			return -1;
        	}
        });
        
        int index = 0;
        
        for(Node temp : list)
        {
        	String t = temp.key;
        	int count = 0;
        	for(int i=0; i<list1.size(); i++)
        	{
        		
        		if(t.equals(list1.get(i).key))
        		{
        			
        			answer[index++] = list1.get(i).i;
        			count++;
        		}
        		if(count>1)
        			break;
        	}
        }
       
        
        
        return answer;
    }
    
    class Node{
    	String key;
    	int value;
    	int i;
    	
    	Node(String key, int value)
    	{
    		this.key = key;
    		this.value = value;
    	}
    	
    	Node(String key, int value, int i)
    	{
    		this.key = key;
    		this.value = value;
    		this.i = i;
    	}
    }
}

// 합계: 53.3 / 100.0 실패코드