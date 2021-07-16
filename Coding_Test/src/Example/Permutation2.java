package Example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutation2
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
		
		permu(0);
		
		System.out.println(sb.toString());
	}
	
	public static void permu(int depth) {
		
		if(depth == r) {
			for(int i=0; i<r; i++) {
				sb.append(result[i]+" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(visited[i] == 0) {
				visited[i] = 1;
				result[depth] = arr[i];
				permu(depth+1);
				visited[i] = 0;
			}
		}
		
		
	}
}
