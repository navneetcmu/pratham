//https://leetcode.com/submissions/detail/111639721/

public class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int len = A.length;
        int count=0, sum1, sum2, num=0, val1=0, val2=0; 
        HashMap<Integer, Integer> tab1 = new HashMap<>(); 
        HashMap<Integer, Integer> tab2 = new HashMap<>();
        
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                sum1 = A[i]+B[j];
                sum2 = C[i]+D[j];
                if(tab1.get(sum1)==null) tab1.put(sum1, 1);
                else tab1.put(sum1, tab1.get(sum1)+1);
                if(tab2.get(sum2)==null) tab2.put(sum2, 1);
                else tab2.put(sum2, tab2.get(sum2)+1);
            }
        }
        
        Set<Integer> keys = tab1.keySet();
        Iterator<Integer> itr = keys.iterator();
        while(itr.hasNext()){
             num = itr.next();
             val1 = tab1.get(num);
             if(tab2.get(0-num)!=null){
                 val2 = tab2.get(0-num);
                 count+= (val1*val2); 
             }
             
        }
        
        return count; 
    }
}
