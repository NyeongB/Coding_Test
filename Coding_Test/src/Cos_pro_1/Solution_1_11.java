package Cos_pro_1;

class Solution_1_11	//3-9
{
    public int solution(int[] revenue, int k) {		// 특정 길이 구간합 최대값 알고리즘
        int answer = 0;
        int n = revenue.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {	// 처음에 길이만큼 넣어두고
            sum += revenue[i];
        }
        answer = sum;
        for (int i = k; i < n; i++) {
            sum = sum - revenue[i - k] + revenue[i];	// 왼쪽빼고 오른쪽 더하고 하면서 최대값 비교
            if (answer < sum)
                answer = sum;
        }
        return answer;
    }
    
    // 아래는 테스트케이스 출력을 해보기 위한 main 메소드입니다. main 메소드는 잘못된 부분이 없으니, solution 메소드만 수정하세요.
    public static void main(String[] args) {
    	Solution_1_11 sol = new Solution_1_11();
        int[] revenue1 = {1, 1, 9, 3, 7, 6, 5, 10};
        int k1 = 4;
        int ret1 = sol.solution(revenue1, k1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int[] revenue2 = {1, 1, 5, 1, 1};
        int k2 = 1;
        int ret2 = sol.solution(revenue2, k2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");        
    }
}