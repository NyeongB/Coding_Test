// Date : 2020.09.07
// Title : 정수 삼각형
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Dynamic Programming
 
package BOJ_DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_DP_03
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int arr [][] = new int[n][n];
		int temp [][] = new int[n][n];
		
		for(int i=0; i<n; i++)
		{
			String [] str = br.readLine().split(" ");
			for(int j=0; j<str.length; j++)
			{
				arr[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		// printTri(arr);
		
		// 1. 양 끝라인 누적합 
		temp[0][0] = arr[0][0];
		
		for(int i=1; i<n; i++)
		{
			temp[i][0] = temp[i-1][0] + arr[i][0];	// 왼쪽 라인
			temp[i][i] = temp[i-1][i-1] + arr[i][i];	// 오른쪽 라인
		}
		
		// printTri(temp);
		
		// 2. 위에서 아래로 맥스 누적합
		
		for(int i=2; i<n; i++)
		{
			for(int j=1; j<i; j++)
			{
				temp[i][j] = Math.max(temp[i-1][j-1], temp[i-1][j]) + arr[i][j];
			}
		}
		
		//printTri(temp);
		
		// 3. 마지막 라인중 맥스 값 찾기
		int result = 0;

		for(int i=0; i<n; i++)
		{
			if(result<temp[n-1][i])
				result = temp[n-1][i];
		}
		
		System.out.println(result);
		
		
		
	}
	
	static void printTri(int [][] arr)
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[0].length; j++)
				System.out.printf("%2d ",arr[i][j]);
			System.out.println();
		}
	}
	
}