public class Solution {
    boolean[] scv; 
    public int countPrimes(int n) {
        scv = new boolean[n+1];
        if(n<=2) return 0; 
        scv[0] = true;
        scv[1] = true;
        int count=0;
        isPrime(n);
        for(int i=0; i<n; i++){
            if(!scv[i]) count++; 
        }
        
        return count; 
    }
    
    public void isPrime(int n){
        int loop = (int) Math.sqrt(n) + 1;
        int j=4;
        for(int i=2; i<loop; i++){
            if(scv[i]==false){
              j = i*i;
              while(j<scv.length){
                  scv[j] = true;
                  j+=i; 
              }
            }
        }
    }
}
