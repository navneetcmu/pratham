public class Solution {
    public void rotate(int[] nums, int k) {
        int[] dbl = new int[2*nums.length];
        int[] result = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            dbl[i] = nums[i];
            dbl[nums.length+i] = nums[i]; 
        }
        int j=0;
        k = k%nums.length; 
        while(j<nums.length){
            nums[j] = dbl[nums.length-k+j];
            j++;
        }
    }
}

