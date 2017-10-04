//https://leetcode.com/problems/word-search/description/

class Solution {
    boolean[][] visit;
    int n,m;
    public boolean exist(char[][] board, String word) {
      n = board.length; m = board[0].length; 
      visit = new boolean[n][m]; 
      for(int i=0; i<n; i++){
          for(int j=0; j<m; j++){
              if(board[i][j]==word.charAt(0)){
                  visit[i][j] = true;
                  if(trav(board,i+1,j, word, 1) || trav(board,i-1,j, word, 1) || trav(board,i,j-1, word, 1) || trav(board,i,j+1, word, 1)) return true; 
                  visit[i][j] = false;
              }
          }
      }
    return false; 
    }
    
    public boolean trav(char[][] board, int i, int j, String word, int pos){
        if(pos>=word.length()) return true; 
        if(i<0 || i>=n || j<0 || j>=m) return false;  
        if(board[i][j]!=word.charAt(pos)) return false;
        if(!visit[i][j]){
            visit[i][j] = true;
            if(trav(board,i+1,j, word, pos+1) || trav(board,i-1,j, word, pos+1) || trav(board,i,j-1, word, pos+1) || trav(board,i,j+1, word, pos+1)) return true;
            visit[i][j] = false; 
        }
        return false; 
    }
}
