// https://leetcode.com/problems/increasing-triplet-subsequence/description/ 

/**
My thought strategy was as follows: If we save the lowest increasing sequence (a,b), where a<b, and we encounter a number greater than b, 
we can say that we have a increasing sequence of length 3. There is no need to save increasing sequences who are greater than pair (a,b).

Now, if we found a number that is lower than "a", it has potential to generate a pair which is smaller than current pair (a,b). So we will
save this number (lets call this number buffer). So if on iterating we found a number that is bigger than buffer but less than b, we have a
new increasing subsequence (buffer, number). We will replace current pait with thi new pair. 

If we find a number(say c) such that a < c < b. Our new pair will be simply (a,c). 

Thus we have covered all the cases so far. code is as below.  

**/ 

public class Solution {
    public boolean increasingTriplet(int[] nums) {
        if(nums.length<3) return false; 
        int low_f = Integer.MAX_VALUE, low_b = Integer.MAX_VALUE;
        int low_buff=Integer.MAX_VALUE; 
        //low_b = nums[0]; 
        for(int i=0; i<nums.length; i++){
            if(nums[i]>low_f) return true; 
            if(nums[i]>low_b){
                if(nums[i]<low_f) low_f = nums[i]; 
            }
            if(nums[i]<low_b){
               if(nums[i]<low_buff){
                   low_buff=nums[i]; 
               } 
               else{
                   if(nums[i]<low_f && nums[i]!=low_buff){
                       low_b = low_buff;
                       low_f = nums[i]; 
                   }
               }  
            }
        }
        
        return false;
    }    
}
