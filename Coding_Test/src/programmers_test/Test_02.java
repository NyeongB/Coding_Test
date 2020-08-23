// Date : 2020.08.23
// Title : 문제1
// Author : Choi Cheol Nyeong
 
package programmers_test;

public class Test_02
{
	public static void main(String[] args)
	{
		String [] bakery_schedule = {"09:05 10", "12:20 5","13:25 6","14:24 5"};
		String current_time = "12:05";
		int K = 10;
		
		int cS = Integer.parseInt(current_time.substring(0, 2));
		int cM = Integer.parseInt(current_time.substring(3, 5));
		//System.out.println(cS);
		//System.out.println(cM);
		
		int b = Integer.parseInt(bakery_schedule[0].substring(6, bakery_schedule[0].length()));
		//System.out.println(b);
		int total = 0;
		int result = 0;
		for(int i=0; i<bakery_schedule.length; i++)
		{
			int s = Integer.parseInt(bakery_schedule[i].substring(0, 2));
			int m = Integer.parseInt(bakery_schedule[i].substring(3, 5));
			int n = Integer.parseInt(bakery_schedule[i].substring(6, bakery_schedule[i].length()));
			
			String t1 =""+s+m;
			String t2 = ""+cS+cM;
			//System.out.println("t1"+t1);
			//System.out.println("t2"+t2);
			if(Integer.parseInt(t1)>Integer.parseInt(t2))
			{
			total += (s-cS)*60 + (m-cM);
			result +=n;
			cS = s;
			cM = m;
			}
			if(K<=result)
			{
				System.out.println("최종 시간 : "+total);
				break;
			}
		}
	//	if(K>result)
		//	System.out.println(-1);
		
	}
	
}
