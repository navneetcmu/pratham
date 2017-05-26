public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> table = new TreeMap<>();
        int count=0, z=nums.length;
        double lmt = Math.floor(z/2);
        for(int i=0; i<z; i++){
            if(table.get(nums[i])==null) count=0;
            else count = table.get(nums[i]);
            table.put(nums[i], ++count); 
            if(count>lmt) return nums[i];
        }
        
        return 0; 
    }
}
