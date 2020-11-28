package Cos_pro_1;

public class Solution_1_03
{
	    int solution(int[] prices){
	        int INF = 1000000001;
	        int tmp = INF;
	        int answer = -INF;
	        for(int price : prices){
	            if(tmp != INF)	// 최소 하루있다 판매할거라
	                answer = Math.max(answer, price - tmp );	// 차액
	            tmp = Math.min(tmp, price);	// 템프와 현재와 뭐가 가장 최소인가
	        }
	        return answer;
	    }

	    // The following is main method to output testcase. The main method is correct and you shall correct solution method.
	    public static void main(String[] args) {
	        Solution_1_03 sol = new Solution_1_03();
	        int[] prices1 = {1, 2, 3};
	        int ret1 = sol.solution(prices1);
	        
	        // Press Run button to receive output. 
	        System.out.println("Solution: return value of the method is " + ret1 + " .");
	        
	        int[] prices2 = {3, 1};
	        int ret2 = sol.solution(prices2);
	        
	        // Press Run button to receive output. 
	        System.out.println("Solution: return value of the method is " + ret2 + " .");
	    }
}

// 최소 일때 사서 최대일때 파는 차액 알고리즘
// 최소 하루있다 판매할수있음