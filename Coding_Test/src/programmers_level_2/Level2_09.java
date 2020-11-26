// Date : 2020.09.10, 20.11.15
// Title : 다음 큰 숫자
// Author : Choi Cheol Nyeong
// Language : Java
// Classfication : basic

package programmers_level_2;

public class Level2_09
{

	public static void main(String[] args)
	{
		Solution2_09 solution2_09 = new Solution2_09();
		System.out.println(solution2_09.solution(78));
		System.out.println(solution2_09.solution(15));
	}
}

class Solution2_09
{
	
	public int solution(int n) {
        int answer = n;
        
        String str = Integer.toBinaryString(n);
        
        
        
        int count = getCount(str);
        
        
        while(true)
        {
            answer++;
            if(count == getCount(Integer.toBinaryString(answer)))
                break;
        }
       
        
        return answer;
    }
    
    public int getCount(String str)
    {
        int result = 0;
        
        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i)=='1')
                result++;
        }
        
        return result;
    }
	
	/*
	
	 public int solution(int n) {
	        int answer = n;
	        int count1 = getBinaryCount(n); 
	        while(true)
	        {
	            int count2 = getBinaryCount(++answer);  // 하나씩 늘려가면서 카운트가 맞는지 확인
	            
	            if(count1 == count2)    
	                break;
	        }
	        
	        return answer;
	    }
	    
	    public int getBinaryCount(int num)
	    {
	        int result = 0;
	        
	        String str = "";
			/*
	        int r = 0;
			
			while(num != 0) {
				r = num % 2;
				
				if(num % 2 < 10) {
					str = r + str;
				} else {
					
					str = (char)(r + 55) + str; 
				}
				
				num /= 2;
			}   // 2진법으로 변환후
	        
	        str = Integer.toBinaryString(num);
	        //System.out.println(str);
	        
	        for(int i=0; i<str.length(); i++)
	        {
	            if(str.charAt(i) == '1' )   // 1의 갯수 세기
	                result++;
	        }
	        
	        return result;
	    }
		*/
// 124나라에서 했던 알고리즘을 사용해서 2진법으로 만들게되면 속도가 너무차이나고 시간초과가 계속난다
	    // 어쩔수없이 toBinaryString을 사용하는데 이방법밖에없는지는 찾아봐야겠다.
	/*
	public int solution(int n)
	{
		int answer = 0;

		int temp = n + 1;

		String str1 = Integer.toBinaryString(n);
		int[] arr = new int[2];
		for (int i = 0; i < str1.length(); i++)
		{
			int index = str1.charAt(i) - '0';
			arr[index]++;
		}

		while (true)
		{
			String str2 = Integer.toBinaryString(temp);
			int[] arr2 = new int[2];
			for (int i = 0; i < str2.length(); i++)
			{
				int index = str2.charAt(i) - '0';
				arr2[index]++;
			}

			if (arr[1] == arr2[1])
			{
				answer = temp;
				break;
			}
			temp++;

		}
		return answer;
	}
	*/
}