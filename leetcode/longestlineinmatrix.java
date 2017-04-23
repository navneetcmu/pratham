import java.util.*; 

//Accepted solution for Leetcode contest on 3/22/2016.
//Problem name : Longest Line of Consecutive One in Matrix 

public class longestlineinmatrix {
    public static int longestLine(int[][] M) {
    	int a=0,b=0,c=0,d=0, max = 0; 
    	int z=0, rows = 0, columns=0, num; 
    	rows = M.length;
    	if(rows==0) return 0; 
    	columns = M[0].length; 
    	
    	for(int r=0; r<rows; r++){
    		for(int cl=0; cl<columns; cl++){
    			num = M[r][cl];  
    			if(num==1){
    			a = hr(M, r, cl); 	
    			b = vr(M, r, cl); 
    			c = dg(M, r, cl); 
    			d = andg(M, r, cl);
    			max = maxim(a,b,c,d,max); 
    			}
    		}
    	}
    	return max; 
        
    }
    
    public static int maxim(int a, int b, int c, int d, int max){
    	int [] iarr = {a,b,c,d,max};
    	Arrays.sort(iarr);
    	return iarr[4]; 
    }
    
    public static int hr(int[][] M, int r, int cl){
    	int count=0;
    	//List<Integer> horizontal = new LinkedList<Integer>();
    	int cl1 = --cl, cl2 = ++cl; 
    	while(cl1>=0){
    		if(M[r][cl1]==0){
    			break; 
    		}
    		else{
    		 //horizontal.add(1);
    		 count++; 
    		}
    		cl1--;
    	}
    		
    		
    	while(cl2 < M[0].length){
    			if(M[r][cl2]==0){
    				break;
    			}
    			else{
    				//horizontal.add(1);
    				count++; 
    			}
    			cl2++; 
    		}
    	
    	//return horizontal.size();
    	return count; 
    	
    }
    
    public static int vr(int[][] M, int r, int cl){
    	//List<Integer> vrt = new LinkedList<Integer>();
    	int count=0; 
    	
    	int r1 = --r, r2 = ++r; 
    	while(r1>=0){
    		if(M[r1][cl]==0){
    			break; 
    		}
    		else{
    		 //vrt.add(1);
    		 count++; 
    		}
    		r1--;
    	}
    		
    		
    	while(r2 < M.length){
    			if(M[r2][cl]==0){
    				break;
    			}
    			else{
    				//vrt.add(1);
    				count++; 
    			}
    			r2++; 
    		}
    	
    	//return vrt.size();
    	return count;
    }
    
    public static int dg(int[][] M, int r, int cl){
    	//List<Integer> diag = new LinkedList<Integer>();
    	int count=0; 
    	int r1 = --r, c1 = --cl, r2= ++r, c2 = ++cl; 
    	
    	while(r1>=0 && c1>=0){
    		if(M[r1][c1]==0){
    			break;
    		}
    		else{
    			//diag.add(1);
    			count++; 
    		}
    		r1--;
    		c1--; 
    	}
    	
    	while(r2 < M.length && c2 < M[0].length && r2 > 0 && c2 > 0){
    		if(M[r2][c2]==0){
    			break;
    		}
    		else{
    			//diag.add(1);
    			count++; 
    		}
    		r2++;
    		c2++; 
    	}
    	
    	//return diag.size();
    	return count;
    }
    
    public static int andg(int[][] M, int r, int cl){
    	//List<Integer> antdg = new LinkedList<Integer>();
    	int count=0; 
    	
    	int r1 = --r, c1 = ++cl, r2= ++r, c2 = --cl; 
    	
    	while(r1>=0 && c1 < M[0].length && c1 > 0){
    		if(M[r1][c1]==0){
    			break;
    		}
    		else{
    			//antdg.add(1);
    			count++; 
    		}
    		r1--;
    		c1++; 
    	}
    	
    	while(r2 < M.length && c2 >= 0 && r2 > 0){
    		if(M[r2][c2]==0){
    			break;
    		}
    		else{
    			//antdg.add(1);
    			count++; 
    		}
    		r2++;
    		c2--; 
    	}
    	
    	//return antdg.size()+1;
    	return count;
    }
    
    
    public static void main(String[] args){
    	int[][] M = {{0,1,1,0},{0,1,1,0},{0,0,0,1}}; 
    
    
    int z = longestLine(M);
    System.out.println(z);
   }
    
}
