public class Solution {
    Map<Integer, Integer> table = new TreeMap<>(); 
    boolean result; 
    public boolean isHappy(int n) {
        result = func(n);
        return result; 
    }
    
    public boolean func(int n){
        int a =0, sum=0;
        while(n>0){
            a = n%10;
            sum += a*a; 
            n = (n-a)/10;
        }
        if(sum==1) return true; 
        if(table.get(sum)!=null) return false; 
        table.put(sum,1);
        return func(sum); 
    }
}
