package Example;

public class Permutation
{
	public static void main(String[] args) throws Exception
	{

		int n = 3;
        int[] arr = {1, 2, 3};
        int[] output = new int[n];
        boolean[] visited = new boolean[n];

        perm(arr, output, visited, 0, n, 2);
        System.out.println();
        permutation(arr, 0, n, 2);

	}

	static void permutation(int[] arr, int depth, int n, int r)
	{
		if (depth == r)
		{
			print(arr, r);

			return;
		}

		for (int i = depth; i < n; i++)
		{
			swap(arr, depth, i);
			permutation(arr, depth + 1, n, r);
			swap(arr, depth, i);
		}
	}

	static void swap(int[] arr, int depth, int i)
	{
		int temp = arr[depth];
		arr[depth] = arr[i];
		arr[i] = temp;
	}

	static void print(int[] arr, int r)
	{
		for (int i = 0; i < r; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	
	static void perm(int[] arr, int[] output, boolean[] visited, int depth, int n, int r) {
	    if (depth == r) {
	        print(output, r);
	        return;
	    }
	 
	    for (int i=0; i<n; i++) {
	        if (visited[i] != true) {
	            visited[i] = true;
	            output[depth] = arr[i];
	            perm(arr, output, visited, depth + 1, n, r);       
	            output[depth] = 0; // 이 줄은 없어도 됨
	            visited[i] = false;;
	        }
	    }
	}
}

// 순열의 기본