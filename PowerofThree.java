public class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1) return true; 
        return power(n); 
        
    }
    
    public boolean power(int n){
        if(n==3) return true;
        if(n<3) return false;
        if(n%3!=0) return false; 
        return power(n/3); 
    }
}

//Alternate solution 

public class Solution {
    public boolean isPowerOfThree(int n) {
        int num = (int) Math.pow(3, 19); 
        return (n>0  && num%n==0); 
    }
}
