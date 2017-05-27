public class Solution {
    public int[] nums; 
    int max=0, rand=0, temp=0, l=0;
    public Solution(int[] nums) {
        this.nums = nums; 
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums; 
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] z = nums.clone(); 
        for(int i=0; i<z.length; i++){
            max=i+1;
            rand = (int)(Math.random() * max);
            temp = z[i];
            z[i] = z[rand];
            z[rand] = temp; 
        }
        return z; 
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */
