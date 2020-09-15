// Date : 2020.09.15
// Title : 수 복원하기
// Author : Choi Cheol Nyeong
// Language : Java

package BOJ_Basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class BOJ_Basic_09
{
	public static void main(String[] args)
	{
		
		HashMap<Integer, Integer> hm;
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		
		StringBuffer sb = new StringBuffer();
		
		while(num-- >0)
		{
			hm = new HashMap<Integer, Integer>();
			int n = sc.nextInt();
			int i =1;
			while(n!=1)
			{
				i++;
				if(n%i==0)
				{
					if(hm.get(i)!=null)
					hm.put(i,hm.get(i)+1);
					else
						hm.put(i,1);
					
					n /=i;
					i = 1;
				}
			}
			
			int [] arr= new int[hm.size()];
			
			int k=0;
			
			for(int number : hm.keySet())
			{
				arr[k++] = number;
			}
			
			Arrays.sort(arr);
			
			for(int number :arr)
			{
				sb.append(number+" "+hm.get(number)+"\n");
			}
		}
		
		System.out.println(sb.toString());
		
		
		sc.close();
		
	}
}

// 처음 해쉬맵에서 바로 꺼내서 쓰게되면 15884에서 2 2, 19 2, 11 1 이라는 19와 11이 뒤바뀐 결과가 나온다 
// 당연히 2부터 나눠질때까지 나오니깐 소인수는 무조건적인 정렬이 될것이라고 생각했는데 소인수 안에서도 정렬이 필요하다 .. 
// 다음에는 테스트 케이스인 100001짜리 배열을 만들고 해봐야겠다.