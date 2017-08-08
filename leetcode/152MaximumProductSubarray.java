//https://leetcode.com/problems/maximum-product-subarray/description/

/**
We can do this problem in O(n). Lets start with the simplest case: let all numbers be >0, then answer is simple, multiply from first to
the last element. Now if there is only one negative number between, the product before it and after it will be compared. So, at a given
position, we have 3 possibilities :

1. We get a new maxima.
2. We get a negative number thus our maxima becomes negative. (if we get another negative number down the lane, this series will become +ve
3. After negative, we start with new maxima array. 

So we will track two things, previous maxima and previous minima. 

If we get a negative, our minima will become negative and if we get another positive number, upto that point our product will be max.
So minima will help in tracking those. 

maxima = Max(nums[i]*prev_max, nums[i]*prev_min, nums[i]); 

So by above logic, when we get a -ve number, our maxima becomes that number (thus series again starts from here) Thus we have all three 
possibilities cover. 

**/



public class Solution {
    public int maxProduct(int[] nums) {
        int prev_max = nums[0];
        int prev_min = nums[0];
        int maxim = nums[0];
        int min, max; 
        
        for(int i=1; i<nums.length; i++){
            min = Math.min(nums[i], Math.min(prev_max*nums[i], prev_min*nums[i]));
            max = Math.max(nums[i], Math.max(prev_max*nums[i], prev_min*nums[i]));
            maxim = (maxim>max)?maxim:max; 
            prev_max=max;
            prev_min=min; 
        }
        
        return maxim; 
    }
}
