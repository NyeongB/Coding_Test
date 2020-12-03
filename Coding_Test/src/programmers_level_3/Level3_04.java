// Date : 2020.10.08 -> 10.09, 20.11.06
// Title : 여행경로
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : DFS(O) BFS(X)  

package programmers_level_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Level3_04
{
	public static void main(String[] args)
	{
		Solution3_04 solution3_04 = new Solution3_04();
		String[] str = solution3_04.solution(new String[][]
		{
				{ "ICN", "SFO" },
				{ "ICN", "ATL" },
				{ "SFO", "ATL" },
				{ "ATL", "ICN" },
				{ "ATL", "SFO" } });

		for (String s : str)
		{
			System.out.println(s);
		}
	}

}

class Solution3_04
{
    
   
    
    String route;
    boolean [] visited;
    String[][] tickets;
    ArrayList<String> list = new ArrayList<>();
    
    public String[] solution(String[][] tickets) {
        String[] answer = new String[tickets.length+1];
        this.tickets = tickets;
        
        
        for(int i=0; i<tickets.length; i++)
        {
            if(tickets[i][0].equals("ICN"))
            {
                visited = new boolean[tickets.length];
                route = "ICN";
                visited[i] = true;
                dfs(1, tickets.length, tickets[i][1]);
                
            }
        }
        
        Collections.sort(list);
        
        String [] str = list.get(0).split(",");
        
        int index = 0;
        for(String s : str)
            answer[index++] = s;
        
        return answer;
    }
    
    
    public void dfs(int count, int max_count, String start)
    {
        route += "," + start; 
        if(count == max_count)
        {
            
        list.add(route);
            return;
        }
        
        for(int i=0; i<max_count; i++)
        {
            if(!visited[i]&&tickets[i][0].equals(start))
            {
                visited[i] = true;
                dfs(count +1, max_count, tickets[i][1]);
                visited[i] = false;
                route = route.substring(0,route.length()-4);
            }
        }
    }
}

/*
class Solution3_04
{
    
    static String[][] tickets;
    static String route;
    static int [] visit;
    ArrayList<String> list = new ArrayList<>();
    
    public String[] solution(String[][] tickets) {
        
        this.tickets = tickets;
        
        
        for(int i=0; i<tickets.length; i++)
        {
            visit = new int[tickets.length];
            String start = tickets[i][0];
            String end = tickets[i][1];
            
            if(start.equals("ICN"))
            {
                route = start + ",";
                visit[i] = 1;
                dfs(end,1);
            }
            
        }
        Collections.sort(list);
        String[] answer = list.get(0).split(",");
        return answer;
    }
    
    public void dfs(String end, int count)
    {
        route += end + ",";
        if(count == tickets.length)
        {
            list.add(route);
            return;
        }
        
        for(int i=0; i<tickets.length; i++)
        {
            if(tickets[i][0].equals(end) && visit[i] ==0)
            {
                visit[i] = 1;
                dfs(tickets[i][1],count + 1);
                visit[i] = 0;
                
                route = route.substring(0, route.length() - 4);
                //지금까지의 경로 외에 중간에 다른 경로를 갈 수 있기 때문에 dfs 호출이 종료되면 visit과 route에서 현재 방문 위치를 빼줘야 한다.
            }
        }
    }
}
*/
// https://geehye.github.io/programmers-dfs-bfs-04/#
// 참고자료 정말 갓 코드인것같다.
// 내가 고민했던 사전순으로 먼저 방문하는것을
// 모든 경로를 리스트에 넣고 오름차순 정렬하고 index 0 을 가져오는것으로 해결하였다.
// 최단경로 문제는 dfs로 고민한다.