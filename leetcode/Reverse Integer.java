public class Solution {
    public int reverse(int x) {
        int ans;
        ans = rvr(x);
        System.out.println(Integer.MAX_VALUE);
        return ans;
    }
    
    public int rvr(int n){
        int a=0, sum=0, sg=1;
        if(n<0){ n = -1*n; sg=-1;}
        while(n>0){
            a = n%10;
            if(Integer.MAX_VALUE/10<sum) sg = 0; 
            sum = sum*10; 
            if(Integer.MAX_VALUE<=sum-a) sg = 0; 
            sum += a;
            n = (n-a)/10; 
        }
        return sg*sum; 
    }
}
