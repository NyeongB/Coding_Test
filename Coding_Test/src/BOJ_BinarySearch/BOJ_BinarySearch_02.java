// Date : 2020.09.17
// Title : 숫자 카드
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : Binary Search

package BOJ_BinarySearch;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BOJ_BinarySearch_02
{
	public static void main(String[] args) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int [] arr = new int[n];
		
		for(int i=0; i<arr.length; i++)
		{
			int temp = sc.nextInt();
			arr[i] = temp;
		}
		
		int m = sc.nextInt();
		
		Arrays.sort(arr);
		
		StringBuffer sb = new StringBuffer();
		
		while(m-- > 0)
		{
			int temp = sc.nextInt();
			int index = Arrays.binarySearch(arr,temp);
			//System.out.println(index);
			if(index >= 0)
			{
				sb.append("1 ");
			}
			else
			{
				sb.append("0 ");
			}
		}
		
		System.out.println(sb.toString());
		
		sc.close();
	}
}

// java.util.Arrays 클래스의 binarySearch 메소드가 구현되 있어서 직접 구현하지않고 
// 한번 써보았다.
// API DOCUMNET 를 보니 객체배열, 찾는객체 이렇게 매개변수로 되어있어 객체단위로도 검색이 가능한듯 하다 
// 존재하면 인덱스를 반환하고 없으면 삽입포인트 -1 로 변환되어 전부 음수가 나온다.