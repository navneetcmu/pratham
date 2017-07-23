//https://leetcode.com/contest/leetcode-weekly-contest-42/problems/maximum-length-of-pair-chain/

import java.util.*; 
public class Solution {
    int[] max; 
    public int findLongestChain(int[][] pairs) {
        int ans=0; 
        max = new int[pairs.length]; 
        //sorting 2nd column in increasing order
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[1]));
        
        
        //building path with larget 2nd digit
        for(int j=pairs.length-1; j>=0; j--){
            max[j] = forward_path(pairs[j][1], j, pairs);  
            
        }
       return find_max(max); 
    }
    
    public int forward_path(int a, int j ,int[][] pairs){
        int len =0, maximum=0; 
        for(int i=0; i<pairs.length; i++){
            if(pairs[i][0] > a){
                len = max[i];
                if(len>maximum){
                    maximum=len; 
                }
            }
        }
        return maximum+1; 
    }
    
    public int find_max(int[] b){
        int maxim=0; 
        for(int i=0; i<b.length; i++){
            if(b[i]>maxim){
                maxim=b[i];
            }
        }
        return maxim; 
    }
    
} 
