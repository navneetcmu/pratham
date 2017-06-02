public class Solution {
    int[] a; 
    public int maxSubArray(int[] nums) {
        a = new int[nums.length];
        a[0] = nums[0]; 
        int max=a[0]; 
        for(int i=1; i<nums.length; i++){
            a[i] = nums[i] + (a[i-1]>0 ? a[i-1] : 0);
            max = Math.max(max, a[i]);
        }
        return max; 
    }
}
