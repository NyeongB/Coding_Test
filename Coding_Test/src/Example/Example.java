package Example;

import java.util.Arrays;
import java.util.Comparator;

public class Example
{
	public static void main(String[] args)
	{
		Integer [] arr = new Integer[10];
		
		for(int i=0; i<10; i++)
			arr[i] = i;
		
		Arrays.sort(arr, new Comparator<Integer>()
		{
			public int compare(Integer a, Integer b) {
				if (a < b)
					return 1;
				else
					return -1;
			}
		});
		
		for(int n : arr)
			System.out.println(n);
	}
}
