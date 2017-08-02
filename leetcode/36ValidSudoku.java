// https://leetcode.com/problems/valid-sudoku/description/


public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean rows, cols, box, row_prev=true, col_prev=true, box_prev=true;
        int[] nums = new int[9]; 
        char[] ch = new char[9]; 
        int count=0;
        
        
        //check all rows
        for(int i=0; i<9; i++){
            ch = getrow(board, i);
            nums = charToNum(ch);
            rows = isValid(nums);
            if(!rows) return false;    
        }
        
        //check all columns
        for(int i=0; i<9; i++){
            ch = getcol(board, i);
            nums = charToNum(ch);
            cols = isValid(nums); 
            if(!cols) return false; 
        }
        
        //check all boxes
        //These two counters are for outer box marking
        for(int i=0; i<9; i=i+3){
            for(int j=0; j<9; j=j+3){
                
                //These two counters traverse all elements within a block. 
                for(int k=i; k<i+3; k++){
                    for(int l=j; l<j+3; l++){
                        ch[count++] = board[k][l];  
                    }
                }
                count=0;
                nums = charToNum(ch);
                box = isValid(nums);
                if(!box) return false; 
                // System.out.println("   ");
            }
        }
    
        return true; 
        
    }
    
    public boolean isValid(int[] arr){
        boolean[]  truth = new boolean[10];
        
        for(int j=0; j<10; j++){
            truth[j] = false; 
        }
        
        for(int i=0; i<9; i++){
            if(truth[arr[i]]) {System.out.println(i); return false;}
            if(arr[i]!=0) truth[arr[i]] = true; 
        }
        return true; 
    }
    
    public int[] charToNum(char[] a){
        //int fill_in = 0; 
        int[] ans = new int[9]; 
        for(int i=0; i<9; i++){
            if(a[i]=='.'){
                ans[i]=0; 
            }
            else{
                ans[i] = Character.getNumericValue(a[i]);
                //fill_in+=1; 
            } 
        }
        //if(fill_in==8) ans = fillin(ans); 
        return ans; 
    }
    
    /**
    public int[] fillin(int[] a){
        int[] ans = a;
        int sum=0, index=0;
        for(int i=0; i<9; i++){
            sum+=a[i];
            if(a[i]==0) index=i; 
        }
        ans[index]=(45-sum);
        return ans; 
    }
    **/
    
    public char[] getrow(char[][] board, int i){
        char[] ans = new char[9];
        for(int j=0; j<9; j++){
            ans[j] = board[i][j]; 
        }
        return ans; 
    }
    
    public char[] getcol(char[][] board, int i){
        char[] ans = new char[9];
        for(int j=0; j<9; j++){
            ans[j] = board[j][i];
        }
        return ans; 
    }
}
