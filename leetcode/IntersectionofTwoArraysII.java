https://leetcode.com/problems/intersection-of-two-arrays-ii/#/description
import java.util.*;
public class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> tab1 = new TreeMap<Integer, Integer>(); 
        Map<Integer, Integer> tab2 = new TreeMap<Integer, Integer>();
        List<Integer> ans = new LinkedList<Integer>();
        int key, val1, val2,count=0;
        for(int i=0; i<nums1.length; i++){
            if(tab1.get(nums1[i])==null) tab1.put(nums1[i],1);
            else tab1.put(nums1[i], tab1.get(nums1[i])+1); 
        }
        
        for(int i=0; i<nums2.length; i++){
            if(tab2.get(nums2[i])==null) tab2.put(nums2[i],1);
            else tab2.put(nums2[i], tab2.get(nums2[i])+1); 
        }
        
        for(Map.Entry<Integer, Integer> entry : tab2.entrySet()){
            key = entry.getKey();
            val1 = entry.getValue(); 
            if(tab1.get(key)!=null){
                val2 = tab1.get(key);
                //System.out.println(key+" "+val1+" "+val2);
                count=0;
                while(count<val1 && count<val2){
                    ans.add(key);
                    count++; 
                }
            }
        }
        
        int[] rtrn = new int[ans.size()];
        for(int i=0; i<ans.size();i++){
            rtrn[i] = ans.get(i); 
        }
        return rtrn; 
        
    }
}
