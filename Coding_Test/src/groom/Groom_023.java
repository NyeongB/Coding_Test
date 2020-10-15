package groom;

import java.util.*;

class Groom_023
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Mystack st = new Mystack();

		int n = sc.nextInt();

		while (n-- > 0)
		{
			int temp = sc.nextInt();
			if (temp == 0)
			{
				temp = sc.nextInt();
				st.push(temp);
			} 
			else if (temp == 1)
			{
				st.pop();
			} 
			else		// 다른값이 들어오면 종료
				break;
		}

		st.print();

	}
}

class Mystack
{
	int max = 10;
	int ptr;
	int[] arr;

	// 생성자
	Mystack()
	{
		ptr = 0;
		arr = new int[max];
	}

	void print()
	{
		for (int i = 0; i < ptr; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}

	void push(int num)
	{
		if (ptr == 10)
		{
			// 오버플루오
			System.out.println("overflow");
			return;
		}
		arr[ptr++] = num;
	}

	void pop()
	{
		if (ptr == 0)
		{
			// 언더플로우
			System.out.println("underflow");
			return;
		}

		arr[ptr--] = 0;
	}

}