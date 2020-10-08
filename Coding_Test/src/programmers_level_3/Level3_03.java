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
		int[] plays = new int[] {500, 600, 500, 800, 2500};
		Solution3_03 solution = new Solution3_03();
		
		  int [] arr = solution.solution(genres, plays);
		  
		  for(int i=0; i<arr.length; i++) System.out.print(arr[i]+" ");
	}
}


class Solution3_03 {
	 public int[] solution(String[] genres, int[] plays) {
	        int[] answer = {};
	        
	        HashMap<String,Integer> hm = new HashMap<>();
	        
	        ArrayList<Node> list1 = new ArrayList<>();
	        
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
	        ArrayList<Node> list = new ArrayList<>();
	        
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
	        
	        ArrayList<Integer> list3 = new ArrayList<Integer>();
	        
	        for(Node temp : list)
	        {
	        	String t = temp.key;
	        	int count = 0;
	        	for(int i=0; i<list1.size(); i++)
	        	{
	        		
	        		if(t.equals(list1.get(i).key))
	        		{
	        			
	        			list3.add(list1.get(i).i);
	        			count++;
	        		}
	        		if(count>1)
	        			break;
	        	}
	        }
	       
	        answer = new int[list3.size()];
	        
	        for(int i=0; i<answer.length; i++)
	        	answer[i] = list3.get(i);
	        
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


// 두번째로 문제를 다시보니 장르별로 노래가 하나인경우를 생각하지않아서 
// list3를 하나 만들고 그안에 넣었다.
// 문제를 이렇게 풀어도 되나싶지만 블로그를 참고하지않고 푼것이 굉장히 뿌듯하다
// 다음에 다른것을 참고하면서 내가 푼 코드를 정리하는게 좋을듯 싶다.