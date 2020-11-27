// Date : 2020.11.04, 20.11.27
// Title : 단속카메라
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : 그리디

package programmers_level_3;

import java.util.Arrays;
import java.util.Comparator;

public class Level3_10
{

	public static void main(String[] args)
	{
		Solution3_10 solution = new Solution3_10();
		int result = solution.solution(new int[][]
		{
				{ -20, 15 },
				{ -14, -5 },
				{ -18, -13 },
				{ -5, -3 } });
		
		
		System.out.println(result);
	}
	

}

class Solution3_10	// 스태틱 클래스 안쓰고했는데 오히려 가독성 떨짐 구조체를 쓰는게 좋을듯
{
	 public int solution(int [][] r) {
	        int answer = 1;
	        
	        Integer [][] routes = new Integer[r.length][2];
	        
	        for(int i=0; i<r.length; i++)
	        {
	            routes[i][0] = r[i][0];
	            routes[i][1] = r[i][1];
	        }
	        
	        Arrays.sort(routes, new Comparator<Integer []>(){
	           
	            public int compare(Integer [] a, Integer []  b)
	            {
	                if(a[0] > b[0])
	                    return 1;
	                else
	                    return -1;
	                
	            }
	        });
	        
	        
	        Integer [] temp = new Integer[2];
	        
	        temp[0] = routes[0][0];
	        temp[1] = routes[0][1];
	        
	        for(int i=1; i<routes.length; i++)
	        {
	            if(temp[1] > routes[i][1])
	            {
	                temp[0] = routes[i][0];
	                temp[1] = routes[i][1];
	            }
	            else if(temp[1] < routes[i][0])
	            {
	                answer++;
	                temp[0] = routes[i][0];
	                temp[1] = routes[i][1];
	                
	            }
	        }
	        
	        
	        return answer;
	    }
	/*
	static class Car
	{
		int s;
		int e;

		public Car()
		{
			// TODO Auto-generated constructor stub
		}

		Car(int s, int e)
		{
			this.s = s;
			this.e = e;
		}
	}

	public int solution(int[][] routes)
	{
		int answer = 0;

		Car[] cars = new Car[routes.length];

		for (int i = 0; i < routes.length; i++)
		{
			Car temp = new Car();
			temp.s = routes[i][0];
			temp.e = routes[i][1];
			cars[i] = temp;
		}

		Arrays.sort(cars, new Comparator<Car>()
		{

			@Override
			public int compare(Car o1, Car o2)
			{

				if (o1.s > o2.s)
					return 1;
				else
					return -1;

			}
		});

		int count = 1;

		Car temp = cars[0];

		for (int i = 1; i < cars.length; i++)
		{
			Car current = cars[i];

			if (temp.e > current.e)
			{
				temp = current;
			} else if (temp.e < current.s)
			{
				temp = current;
				count++;
			}
		}

		return count;
	}
	*/

}
//처음엔 정렬을하고 단순히 끝부분이 새로 들어오는거의 시작보다 크면 포함이고 작거나같으면 포함이 아니란 식으로 
//접근해서 테스트케이스만 통과하고 전부 틀렸다