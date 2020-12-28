// Date : 2020.12.28
// Title : 치킨 배달
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Bruteforcing, DFS

package BOJ_Bruteforcing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_Bruteforcing_10
{
	static int min = Integer.MAX_VALUE;
	static int N;
	static int M;
	static ArrayList<int [] > homes = new ArrayList<>();
	static ArrayList<int [] > chickens = new ArrayList<>();
	static ArrayList<int [] > select_chicken = new ArrayList<int[]>();
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String [] str = br.readLine().split(" ");
		
		N = Integer.parseInt(str[0]);
		M = Integer.parseInt(str[1]);
		
		for(int i=0; i<N; i++)
		{
			str = br.readLine().split(" ");
			
			for(int j=0; j<N; j++)
			{
				if(str[j].equals("1"))	// 가정집일때
				{
					homes.add(new int[] {i,j});
				}
				else if(str[j].equals("2"))	// 치킨집일떄
				{
					chickens.add(new int[] {i,j});
				}
			}
		}
		
		
		combi(0, 0);
		System.out.println(min);
		
	}
	
	public static void combi(int index, int count)
	{
		if(count == M)
		{
			int total = 0;
			
			for(int [] h : homes)
			{
				int min = Integer.MAX_VALUE;
				for(int [] c : select_chicken)
				{
					int dist = Math.abs(h[0] - c[0]) + Math.abs(h[1] - c[1]);
					min = Math.min(min, dist);
				}
				total += min;
				
			}
			
			min = Math.min(total, min);
			return;
			
		}
		
		for(int i=index; i<chickens.size(); i++)
		{
			select_chicken.add(chickens.get(i));
			combi(i + 1, count + 1);
			select_chicken.remove(select_chicken.size() - 1);
		}
	}
}

// 재귀를 할때 순열이 아닌 조합으로 가야한다.  안그러면 중복된 연산이 엄청 많아져서 연산이 오래걸림(불필요한 연산)
// 핵심은 모든것을 다 확인해야함 
// 좀 더 빠르게 하기위해서 집, 치킨집을 미리 List에 넣어두고 치킨집은 조합된 치킨집과의 거리랑 집과의 최솟값을 구한다.