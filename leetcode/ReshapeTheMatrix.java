//https://leetcode.com/problems/reshape-the-matrix/#/description

//leetcode weekly contest 4/30/2017 


import java.util.*;

public class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
    	
    	int rows, clms; 
    	int[][] rslt = new int[r][c]; 
    	rows = nums.length;
    	clms = nums[0].length; 
    	
    	if(rows==0) return nums; 
    	if(r*c > rows*clms) return nums; 
    	
    	Queue<Integer> vector = new LinkedList(); 
    	
    	for(int i=0; i<rows; i++){
    		for(int j=0; j<clms; j++){ 			
    			vector.add(nums[i][j]); 		
    		}
    	}
    	
    	for(int x=0; x<r; x++){
    		for(int y=0; y<c; y++){
    			rslt[x][y] = vector.remove(); 
    		}
    	}
    		
    	return rslt;   
    }
}
