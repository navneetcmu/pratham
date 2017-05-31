public class Solution {
    public int missingNumber(int[] nums) {
        boolean[] tab  = new boolean[nums.length+1];
        for(int i=0; i<nums.length;i++){
            tab[nums[i]] = true; 
        }
        
        for(int i=0; i<tab.length;i++){
            if(!tab[i]) return i;
        }
        
        return -1; 
        
    }
}

//ANOTHER METHOD USING NO EXTRA MEMEORY
public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n*(n+1))/2; 
        for(int i=0; i<n;i++){
            sum = sum - nums[i];  
        }
        return sum; 
        
    }
}
