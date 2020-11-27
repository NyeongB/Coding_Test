// Date : 2020.11.27
// Title : 1차 문제 2
// Author : Choi Cheol Nyeong
// Language : Java

package Cos_pro_1;

class Solution_001
{
	
	public int solution(int n)
	{
		int nn = n;
		int row = 0;
		int col = -1;
		int flag = 1;
		int num = 1;
		int [][] pane = new int[nn][nn];
		
		while(nn>0)
		{
			for(int i=0; i<nn; i++)
			{
				col += flag;
				pane[row][col] = num++;
				
			}
			nn--;
			if(nn<0)
				break;
			for(int i=0; i<nn; i++)
			{
				row += flag;
				pane[row][col] = num++;
				
			}
			flag *= -1;
		}
		
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
				System.out.print(pane[i][j]+" ");
			System.out.println();
		}
		
		int ans = 0;
		for (int i = 0; i < n; i++)
			ans += pane[i][i];
		return ans;
	}

	public static void main(String[] args)
	{

		Solution_001 sol = new Solution_001();
		int ret = sol.solution(3);

		// Press Run button to receive output.
		System.out.println("Solution: return value of the method is " + ret + " .");
	}
}

// 달팽이 문제의 정석