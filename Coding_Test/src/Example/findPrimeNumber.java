package Example;

import java.util.HashSet;

public class findPrimeNumber{
    
    HashSet<Integer> set;
    String [] arr;
    String [] result;
    boolean [] visited;
    
    public int solution(String numbers) {
        int N = numbers.length();
        set = new HashSet<>();
        arr = new String[N];
        result = new String[N];
        visited = new boolean[N];
        
        String [] temp = numbers.split("");
        int i = 0;
        for(String s : temp)
            arr[i++] = s;
        
        for(int j=1; j<=N; j++){
            permu(0,j,N);
        }
        
    
        
        return set.size();
    }
    
    public void permu(int s, int e, int n){
        if(s==e){
            String temp ="";
            for(int i=0; i<e; i++){
                temp += result[i];
            }
            int num = Integer.parseInt(temp);
            if(isPrime(num))
                set.add(num);
            return;
        }
        
        for(int i=0; i<n; i++){
            if(!visited[i]){
                visited[i] = true;
                result[s] = arr[i];
                permu(s+1,e,n);
                visited[i] = false;
            }
        }
        
    }
    
    boolean isPrime(int n){
        if(n<=1)
            return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
    
}