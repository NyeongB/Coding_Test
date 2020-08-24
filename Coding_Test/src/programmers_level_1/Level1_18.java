// Date : 2020.08.22
// Title : 정수 내림차순으로 배치하기
// Author : Choi Cheol Nyeong
 
package programmers_level_1;

import java.util.Arrays;
import java.util.Collections;

public class Level1_18
{
	public static void main(String[] args)
	{
		Solution1_18 solution1_18 = new Solution1_18();
		System.out.println(solution1_18.solution(118372));
	}
	
}

class Solution1_18 {
    public long solution(long n) {
        long answer = 0;
        
        String num = "" + n;
        
        Integer [] arr = new Integer[num.length()];
        
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = num.charAt(i)-'0';
        }
        
        Arrays.sort(arr,Collections.reverseOrder());
        num="";
        for(int i=0; i<arr.length; i++)
        {
            num +=arr[i];
        }
        answer = Long.parseLong(num);
        return answer;
    }
}

class Solution1_18_1 {
	  public long solution(long n) {
	      long answer = 0;
	      String str = n+"";
	      int num = str.length();
	      int [] arr = new int[num];
	      for(int i=0; i<num; i++){
	          arr[i] = str.charAt(i)-'0';
	      }
	      for(int i=0; i<num-1; i++){
	          for(int j=0; j<num-1-i; j++){
	              if(arr[j]<arr[j+1])
	              {
	                  arr[j]=arr[j]^arr[j+1];
	                  arr[j+1]=arr[j+1]^arr[j];
	                  arr[j]=arr[j]^arr[j+1];
	              }
	          }
	      }
	      String s="";
	      for(int i=0; i<num; i++){
	          s+=Integer.toString(arr[i]);
	      }
	    answer=  Long.parseLong(s);
	      return answer;
	  }
	}