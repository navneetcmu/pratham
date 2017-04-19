public class Solution {
    public List<String> fizzBuzz(int n) {
        String s; 
        List<String> list = new ArrayList<>(); 
        for(int i=1; i<=n; i++){
            if((i%3)==0 && (i%5)==0) list.add("FizzBuzz");
            else if((i%3)==0) list.add("Fizz"); 
            else if((i%5)==0) list.add("Buzz"); 
            else{
            s = ""+i;
            list.add(s); 
            }
        }
        
        return list; 
    }
}
