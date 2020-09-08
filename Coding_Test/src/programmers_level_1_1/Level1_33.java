// Date : 2020.09.08
// Title : [1차] 비밀지도
// Author : Choi Cheol Nyeong
// Language : Java
 
package programmers_level_1_1;


public class Level1_33
{
	public static void main(String[] args)
	{
		Solution1_33 solution1_33 = new Solution1_33();
		
		int n = 5;
		int [] arr1 = {9, 20, 28, 18, 11};
		int [] arr2 = {30, 1, 21, 17, 28};
		
		String [] str = solution1_33.solution(n, arr1, arr2);
		
		for(int i=0; i<str.length; i++)
			System.out.println(str[i]);
	}
	
}

class Solution1_33 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String [n];
        
        for(int i=0; i<n; i++) // 논리 연산자 OR 사용후 이진 문자열로 변환
        {
            answer[i] = Integer.toBinaryString(arr1[i]|arr2[i]);
        }
        
        for(int i=0; i<n; i++) // 공백채우기 
        {
            String temp = "";
            for(int j=answer[i].length(); j<n; j++)
                temp +="0";
            
            temp += answer[i];
            
            answer[i] = temp;
                
        }
        
        for(int i=0; i<n; i++)
        {
            answer [i] = answer[i].replaceAll("1","#").replaceAll("0"," "); // 문자열 치환
        }
        
        return answer;
    }
    
}
