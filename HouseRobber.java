public class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        int[] money = new int[len+1]; 
        if(len==0) return 0;
        if(len==1) return nums[0]; 
        money[1] = nums[0];
        money[2] = max(money[1], nums[1]);
        for(int i=3; i<money.length; i++){
            money[i] = max(money[i-2]+nums[i-1], money[i-1]); 
        }
        return money[len]; 
    }
    
    public int max(int a, int b){
        if(a>b) return a;
        return b; 
    }
}
