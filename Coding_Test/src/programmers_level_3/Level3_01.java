// Date : 2020.09.08, 20.10.25
// Title : 네트워크
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : DFS

package programmers_level_3;

public class Level3_01
{
	static boolean[] visit;

	public static void main(String[] args)
	{
		Solution3_01 solution3_01 = new Solution3_01();
		int n = 3;
		int[][] computers =
		{
				{ 1, 1, 0 },
				{ 1, 1, 0 },
				{ 0, 0, 1 } };

		System.out.println(solution3_01.solution(n, computers));
	}

}

class Solution3_01
{

	static int[][] computers;
	static int n;
	static int[] visit;

	public int solution(int n, int[][] computers)
	{

		this.computers = computers;
		this.n = n;
		visit = new int[n];
		int answer = 0;
		for (int i = 0; i < n; i++)
		{
			if (visit[i] == 0)
			{
				dfs(i);
				answer++;
			}
		}

		return answer;
	}

	public void dfs(int x)
	{
		visit[x] = 1;
		for (int i = 0; i < n; i++)
		{
			if (computers[x][i] == 1 && visit[i] == 0)
			{
				dfs(i);
			}
		}
	}
}
// 인접행렬로 dfs 하면되는 간단한 문제 bfs 로도 풀어본다. 