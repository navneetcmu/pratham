public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> table = new TreeMap<>(); 
        int count=0; 
        for(int i=0; i<nums.length; i++){
            if(table.get(nums[i])==null) count=0;
            else count=table.get(nums[i]); 
            table.put(nums[i], ++count);
            if(count>1) return true;
        }
        return false; 
    }
}
