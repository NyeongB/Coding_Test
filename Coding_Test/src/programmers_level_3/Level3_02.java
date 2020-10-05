// Date : 2020.10.05
// Title : 네트워크
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : DFS
 
package programmers_level_3;

import java.util.LinkedList;
import java.util.Queue;

public class Level3_02
{
	public static void main(String[] args)
	{
		Solution3_02 solution3_02 = new Solution3_02();
		int answer = solution3_02.solution("hit", "cog", new String [] {"hot", "dot", "dog", "lot", "log", "cog"});
		System.out.println(answer);
	}
}


class Solution3_02 {
    
    static class Node
    {
      int cnt;
      String str;
        
        public Node(int cnt, String str)
        {
            this.cnt = cnt;
            this.str = str;
        }
    }
    
    static boolean isOneDiff(String str1, String str2)
    {
        boolean result = true;
        int cnt = 0;
        
        for(int i=0; i<str2.length(); i++)
        {
            if(str1.charAt(i) != str2.charAt(i))
                cnt++;
            
             if(cnt>1)
                return false;
        }
        
        return result;
    }
    
    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        int n = words.length;
        
        // bfs
        Queue<Node> q = new LinkedList<>();
        boolean [] visit = new boolean[n];
        q.add(new Node(0,begin));
        
        while(!q.isEmpty())
        {
            Node temp = q.poll();
            if(temp.str.equals(target))
            {
                answer = temp.cnt;
                 break;
            }
            
            for(int i=0; i<n; i++)
            {
                if(!visit[i] && isOneDiff(temp.str, words[i]))
                {
                    visit[i] = true;
                    q.add(new Node(temp.cnt + 1, words[i]));
                }
            }
        }
        
        return answer;
    }
}

// 처음 접근 법자체를 몰라 오랜 고민후에 참고했다.
// 디버깅해가면서 이해하도록 노력하였다
// 중요한 것은 하나 차이나는것과 새로운 클래스를 정의하는것
// 다시풀어본다.