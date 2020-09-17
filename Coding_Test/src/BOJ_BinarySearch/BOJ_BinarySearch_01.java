// Date : 2020.09.17
// Title : 수 찾기
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Binary Search

package BOJ_BinarySearch;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_BinarySearch_01
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] arr = new int [n];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i] = sc.nextInt();
			
		}
		
		int m = sc.nextInt();
		
		Arrays.sort(arr);
		
		
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<m; i++)
		{
			
			int num = sc.nextInt();
			
			
			if(binarySearch(num, arr))
			{
				sb.append("1\n");
			}
			else
			{
				sb.append("0\n");
			}
		}
		
		System.out.println(sb.toString());
		
		sc.close();
	}
	
	public static boolean binarySearch(int num, int [] arr)
	{
		int start = 0;
		int end = arr.length - 1;
		while(start <= end)
		{
			int mid = ( start + end ) / 2;
			
			if(num == arr[mid])
				return true;
			else if(num < arr[mid])
			{
				end = mid - 1;
			}
			else
			{
				start = mid + 1;
			}
		}
		
		return false;
		
	}
	
	
}

// 바이너리 서치의 기본문제
// 정말 실수때문에 문제 다 풀고 한시넘게 도전한 문제인데
// 원인은 num < mid 이부분때문에 num < arr[mid]인데 오타라 생각지도 않고 테스트 케이스는 잘돌아가길래
// 정말 답답했다.. 결국 문제를 다시 풀어서 해결 
// arr 반드시 정렬이 되어있어야하고 arr[mid] 와 조건식을 사용해야한다..  