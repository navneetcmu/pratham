//https://leetcode.com/contest/leetcode-weekly-contest-34/problems/minimum-index-sum-of-two-lists/
public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> table = new TreeMap<>();
        Map<String, Integer> ans = new TreeMap<>(); 
        Map<String, Integer> ans1 = new TreeMap<>();
        int min=list1.length+list2.length, count=0, index=0;
        for(int i=0; i<list1.length; i++){
            table.put(list1[i],i);
        }
        
        for(int i=0; i<list2.length; i++){
            if(table.get(list2[i]) != null){
                count = table.get(list2[i]); 
                index=count+i; 
                if(index<=min){
                    min = index; 
                    ans.put(list2[i], index); 
                }
            }
        }
        
        for (Map.Entry<String, Integer> entry : ans.entrySet()){
                if(entry.getValue() == min){
                    ans1.put(entry.getKey(),0);
                }
               
        }
        
        String[] rtr = new String[ans1.size()];
        int x=0; 
        for (Map.Entry<String, Integer> entry : ans1.entrySet()){
                rtr[x] = entry.getKey();
                x++;
            }
               
        
        return rtr;     
    }
    
}
