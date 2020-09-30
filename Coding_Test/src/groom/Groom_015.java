package groom;

public class Groom_015
{
	public static void main(String[] args) throws Exception {
		
		for(int i=1; i<=1000; i++)
		{
			for(int j=1; j<=1000; j++)
			{
				for(int k=1; k<=1000; k++)
				{
					
					if(i*i+j*j==k*k && i + j + k == 1000)
					{
						System.out.println(i * j * k);
						return;
					}
				}
			}
		}
		
	}
}

// 문제자체가 원하는게 3중 포문인지 의문이다.