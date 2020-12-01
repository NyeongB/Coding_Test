package Cos_pro_1;

import java.util.ArrayList;
import java.util.Collections;

class Solution_1_13	
{												// 4-8

	
	ArrayList<Integer> list = new ArrayList<Integer>();		// 주어진 수로 수조합 만들고 오름차순 정렬해서 몇번째 값인지 파악
															// dfs 로했는데
	
    public int solution(int[] card, int n) {
        // 여기에 코드를 작성해주세요.
        int answer = 0;
        String s = "" + n;
        dfs(card,new int [card.length],0,s.length() , "");
        list.add(0);
        Collections.sort(list);
        
        
        
        return list.indexOf(n);
    }
    
    public void dfs(int [] card, int [] visited, int count, int n, String num)
    {
    	if(count == n)
    	{
    		if(list.indexOf(Integer.parseInt(num)) < 0 )
    		list.add(Integer.parseInt(num));
    		return;
    	}
    	
    	
    	for(int i =0; i<card.length; i++)
    	{
    		if(visited[i]==0)
    		{
    			String temp = num;
    			num += card[i];
    			visited[i]  = 1;
    			count++;
    			dfs(card,visited,count,n,num);
    			visited[i]  = 0;
    			count--;
    			num = temp;
    		}
    	}
    	
    	
    }
    
    
    
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다.
    public static void main(String[] args) {
    	Solution_1_13 sol = new Solution_1_13();
        int card1[] = {1, 2, 1, 3};
        int n1 = 1312;
        int ret1 = sol.solution(card1, n1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int card2[] = {1, 1, 1, 2};
        int n2 = 1122;
        int ret2 = sol.solution(card2, n2);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");
    }    
}