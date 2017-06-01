public class Solution {
    public int climbStairs(int n) {
        if(n==1 || n==2) return n; 
        int[] dyn = new int[n+1];
        dyn[0]=0; 
        dyn[1]=1; 
        dyn[2]=2;
        for(int i=3; i<=n;i++){
            dyn[i] = dyn[i-1] + dyn[i-2]; 
        }
        return dyn[n]; 
    }
}

