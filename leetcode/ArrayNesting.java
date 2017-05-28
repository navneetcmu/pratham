https://leetcode.com/problems/array-nesting/#/description
public class Solution {
    boolean[] rpt;
    int[] nums;
    int count=0;
    public int arrayNesting(int[] nums) {
        this.nums = nums; 
        int a=0, max=0;
        rpt = new boolean[nums.length];
        for(int i=0; i<nums.length; i++){
            a = nums[i]; 
            rpt[i] = true; 
            count=1;
            count = rcrsv(i, nums[i]);
            max=maxim(max, count); 
        }
        return max;
    }
    public int rcrsv(int i, int a){
        if(rpt[a]==true) return count;
        else{
            rpt[a] = true;
            count++;
        }
        return rcrsv(i, nums[a]); 
    }
    
    public int maxim(int a, int b){
        if(a>b) return a;
        return b; 
    }
}
