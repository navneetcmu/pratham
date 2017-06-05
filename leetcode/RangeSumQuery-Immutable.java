public class NumArray {
    int[] nums; 
    int[] s; 

    public NumArray(int[] nums) {
        this.nums = nums;
        int len = nums.length;
        if(len!=0){
            s = new int[len];
            s[0] = nums[0]; 
            for(int j=1; j<len; j++){
                s[j] = s[j-1] + nums[j]; 
            }
        }
    }
    
    public int sumRange(int i, int j) {
        if(i==j) return nums[j];
        if(i>j) return 0; 
        return s[j] - s[i] + nums[i]; 
        
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(i,j);
 */
