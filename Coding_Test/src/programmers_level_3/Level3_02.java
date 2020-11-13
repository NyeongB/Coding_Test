// Date : 2020.10.05, 20.11.13
// Title : 단어 변환
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : BFS

package programmers_level_3;

import java.util.LinkedList;
import java.util.Queue;

public class Level3_02
{
	public static void main(String[] args)
	{
		Solution3_02 solution3_02 = new Solution3_02();
		int answer = solution3_02.solution("hit", "cog", new String[]
		{ "hot", "dot", "dog", "lot", "log", "cog" });
		System.out.println(answer);
	}
}

class Solution3_02
{
	static class Node // 현재 워드와 방문수를 체크할 Node
	{
		String word;
		int count;

		Node(String word, int count)
		{
			this.word = word;
			this.count = count;
		}
	}

	static String begin;
	static String target;
	static String[] words;
	static int[] visited;

	public int solution(String begin, String target, String[] words)
	{

		this.begin = begin;
		this.target = target;
		this.words = words;
		visited = new int[words.length];

		int answer = bfs();
		return answer;
	}

	public boolean oneDiff(String s1, String s2)
	{
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		int count = 0;
		for (int i = 0; i < arr1.length; i++)
		{
			if (arr1[i] != arr2[i])
				count++;
		}

		if (count == 1) // 다른점이 하나면 트루 나머진 펄스
		{
			// System.out.println(s1+" "+ s2);
			return true;
		} else
			return false;

	}

	public int bfs()
	{
		int result = 0;
		Queue<Node> q = new LinkedList<>();

		q.add(new Node(begin, 0));

		while (!q.isEmpty())
		{
			Node temp = q.poll();
			// 도달했을때
			if (temp.word.equals(target))
			{
				return temp.count;
			}

			// 방문한적없고 단어 하나 차이나면 Queue에 넣음
			for (int i = 0; i < words.length; i++)
			{
				if (visited[i] == 0 && oneDiff(temp.word, words[i]))
				{
					q.add(new Node(words[i], temp.count + 1)); // count + 1 해서 큐에 넣음
					visited[i] = 1; // 방문기록
				}
			}
		}

		return result;
	}
}

/*
 * class Solution3_02 {
 * 
 * static class Node { int cnt; String str;
 * 
 * public Node(int cnt, String str) { this.cnt = cnt; this.str = str; } }
 * 
 * static boolean isOneDiff(String str1, String str2) { boolean result = true;
 * int cnt = 0;
 * 
 * for(int i=0; i<str2.length(); i++) { if(str1.charAt(i) != str2.charAt(i))
 * cnt++;
 * 
 * if(cnt>1) return false; }
 * 
 * return result; }
 * 
 * public int solution(String begin, String target, String[] words) { int answer
 * = 0; int n = words.length;
 * 
 * // bfs Queue<Node> q = new LinkedList<>(); boolean [] visit = new boolean[n];
 * q.add(new Node(0,begin));
 * 
 * while(!q.isEmpty()) { Node temp = q.poll(); if(temp.str.equals(target)) {
 * answer = temp.cnt; break; }
 * 
 * for(int i=0; i<n; i++) { if(!visit[i] && isOneDiff(temp.str, words[i])) {
 * visit[i] = true; q.add(new Node(temp.cnt + 1, words[i])); } } }
 * 
 * return answer; } }
 */

// 처음 접근 법자체를 몰라 오랜 고민후에 참고했다.
// 디버깅해가면서 이해하도록 노력하였다
// 중요한 것은 하나 차이나는것과 새로운 클래스를 정의하는것
// 다시풀어본다.