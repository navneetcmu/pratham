import java.util.*; 
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        List<Integer> imtd = new LinkedList<Integer>(); 
        Map<Integer, Integer> table = new TreeMap<Integer, Integer>(); 
        int count=0, key=0, val=0, l=0, pos=0; 
        for(int i=0; i<nums.length; i++){
            if(table.get(nums[i])==null) count = 1; 
            else{count = table.get(nums[i]) +1;  }
            table.put(nums[i], count); 
        }
        
        while(imtd.size()<k){
            l=0; pos=0; 
            for(Map.Entry<Integer,Integer> entry : table.entrySet()){
                key = entry.getKey();
                val = entry.getValue();
                if(val>l){
                    l = val;
                    pos = key; 
                } 
            }
            imtd.add(pos);
            table.remove(pos); 
        }
        return imtd; 
    }
}
