// Date : 2020.09.15
// Title : 단어 정렬
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Sorting

package BOJ_Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BOJ_Sorting_06
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		while(num-->0)
		{
			String temp = sc.next();
			if(!list.contains(temp))
				list.add(temp);
		}
		
		Collections.sort(list,new Comparator<String>()
		{
			
			@Override
			public int compare(String o1, String o2)
			{
				if(o1.length()>o2.length())
				{
					return 1;
				}
				else if (o1.length()<o2.length())
				{
					return -1;
				}
				else if(o1.length()==o2.length())
				{
					return o1.compareTo(o2);
				}
				return 0;
			}
		});
		//System.out.println(list.size());
		for(String str : list)
		{
			System.out.println(str);
		}
	}
}

// 출력 결과물 문제를 잘보자.. 중복이란 말이 존재했다.
// 그다음은 nextLine()으로 하면 yours가 안나오고 next()로 하면 정상적을 출력된다. 
// 이부분에 대한 해답을 찾는다.
// 익명함수 Comparator 은 정말 유용한것 같다.