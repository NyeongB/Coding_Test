package Example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Combination
{
	
	static int n;
	static int r;
	static StringBuilder sb;
	static int [] result;
	static int [] arr;
	static int [] visited;
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		sb = new StringBuilder();
		
		String [] input = br.readLine().split(" ");
		
		n = Integer.parseInt(input[0]);
		r = Integer.parseInt(input[1]);
		
		
		result = new int[r];
		arr = new int[n];
		visited = new int[n];
		
		for(int i=1; i<=n; i++)
			arr[i-1] = i;
		
		combi(0,0);
		
		System.out.println(sb.toString());
	}
	
	public static void combi(int depth, int index) {
		
		if(depth == r) {
			for(int i=0; i<r; i++) {
				sb.append(result[i]+" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=index; i<n; i++) {
			if(visited[i] == 0) {
				visited[i] = 1;
				result[depth] = arr[i];
				combi(depth+1,i);
				visited[i] = 0;
			}
		}
		
		
	}
}
