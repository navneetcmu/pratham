public class Solution {
    public int singleNumber(int[] nums) {
        int z=0; 
        for(int i=0; i<nums.length; i++){
            z ^= nums[i]; 
        }
        return z; 
	}
}
