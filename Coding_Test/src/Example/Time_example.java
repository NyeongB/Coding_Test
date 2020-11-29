package Example;


import java.util.Arrays;

public class Time_example {
	public static void main(String[] args) {
		int i, a[] = new int[100000000], b[] = new int[100000000];
		
        //1~10000사이 랜덤생성해 a[i]와 b[i]에 동일하게 대입
		for(i=0;i<100000000;i++){
			a[i] = (int)(Math.random()*10000)+1;
			b[i] = a[i];
		}

		//버블정렬 시간측정
		long st1 = System.currentTimeMillis();
		bubbleSort(a);
		long et1 = System.currentTimeMillis();

		//퀵 정렬 시간측정
		long st2 = System.currentTimeMillis();
		Arrays.sort(b); //퀵소트는 그냥 이런식으로 하면 됨(출력은 다른방식이니 주의!)
		long et2 = System.currentTimeMillis();
		
		System.out.println("버블소트 속도 : "+(et1 - st1)+" ms");
		System.out.println("퀵 소트 속도 : "+(et2 - st2)+" ms");
		
	}
	public static void bubbleSort(int a[]){ //버블정렬 메소드
		for (int i = 0; i < 9999; i++)
			for (int j = 0; j < 9999; j++)
				if (a[j] > a[j + 1]) {
					int tmp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = tmp;
				}
	}
}