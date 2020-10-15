// Date : 2020.10.05, 20.10.15
// Title : 모든 순열
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Backtracking
package BOJ_Backtracking;
import java.util.Scanner;

public class BOJ_Backtracking_01
{

	static int[] visit;
	static int[] arr;
	static int[] result;
	static int n;

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();

		visit = new int[n];
		result = new int[n];
		arr = new int[n];

		for (int i = 0; i < n; i++)
		{
			arr[i] = i + 1;
		}

		perm(0);

		sc.close();
	}

	public static void perm(int depth)
	{
		if (depth == n)
		{
			for (int i = 0; i < n; i++)
			{
				System.out.print(result[i] + " ");
			}
			System.out.println();
			return;
		}

		for (int i = 0; i < n; i++)
		{
			if (visit[i] == 0)
			{
				visit[i] = 1;
				result[depth] = arr[i];
				perm(depth + 1);
				visit[i] = 0;
			}
		}

	}
}
// 다시 풀어보고 완전히 외우는 중이다.
