// Date : 2020.11.03
// Title : 에디터
// Author : Choi Cheol Nyeong
// Language : Java
// classification : Stack

package BOJ_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*

L	커서를 왼쪽으로 한 칸 옮김 (커서가 문장의 맨 앞이면 무시됨)
D	커서를 오른쪽으로 한 칸 옮김 (커서가 문장의 맨 뒤이면 무시됨)
B	커서 왼쪽에 있는 문자를 삭제함 (커서가 문장의 맨 앞이면 무시됨)
	삭제로 인해 커서는 한 칸 왼쪽으로 이동한 것처럼 나타나지만, 실제로 커서의 오른쪽에 있던 문자는 그대로임
P $	$라는 문자를 커서 왼쪽에 추가함
*/
public class BOJ_Stack_08
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Stack<Character> sL = new Stack<>();
		Stack<Character> sR = new Stack<>();

		String str = br.readLine();

		for (int i = 0; i < str.length(); i++)
		{
			sL.add(str.charAt(i));
		}

		int num = Integer.parseInt(br.readLine());

		while (num-- > 0)
		{
			String[] input = br.readLine().split(" ");
			char command = input[0].charAt(0);

			if (command == 'P')
			{
				sL.add(input[1].charAt(0));
			} else if (command == 'L')
			{
				if (!sL.isEmpty())
				{
					char temp = sL.pop();
					sR.add(temp);
				}
			} else if (command == 'D')
			{
				if (!sR.isEmpty())
				{
					char temp = sR.pop();
					sL.add(temp);
				}

			} else if (command == 'B')
			{
				if (!sL.isEmpty())
				{
					sL.pop();
				}
			}
		}

		int size = sL.size();

		for (int i = 0; i < size; i++)
		{
			sR.add(sL.pop());
		}

		size = sR.size();
		StringBuilder sb = new StringBuilder();
		while (size-- > 0)
			sb.append(sR.pop());
		
		System.out.println(sb.toString());

	}

}