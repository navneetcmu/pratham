//https://leetcode.com/contest/leetcode-weekly-contest-34/problems/range-addition-ii/
public class Solution {
    int[][] ops; 
    public int maxCount(int m, int n, int[][] ops) {
        this.ops = ops; 
        int rws = ops.length,a=0,b=0;
        if(rws==0) return n*m; 
        int x=0;
        int min_a=m+1, min_b=n+1; 
        while(x<rws){
            a = ops[x][0];
            b = ops[x][1];
            if(a<min_a) min_a =a;
            if(b<min_b) min_b = b;
            x++;
        }
        
        return min_a*min_b; 
    }
}
