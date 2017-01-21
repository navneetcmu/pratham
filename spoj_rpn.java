import java.util.*;
import java.lang.*;

class spoj_rpn
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);

	  int exp = sc.nextInt();
		sc.nextLine();
		int x;
		for(int y =0; y<exp; y++){
			   String input = sc.nextLine();
				 char[] ch = input.toCharArray();
				 char[] output = new char[ch.length];
				 int g=0;
				 stck<Character> stack = new stck<Character>(ch.length);
				 for(int j=0; j<ch.length; j++){
					   if(Character.isLetter(ch[j])) output[g++] = ch[j];
						 else if(ch[j]==')') output[g++] = stack.pop();
						 else if(ch[j]=='(') x=0;
						 else stack.push(ch[j]);
				 }//end inner for

				 for(g=0; g<output.length;g++){
					 System.out.print(output[g]);
				 }
				 while(!stack.isempty()){
					  System.out.print(stack.pop());
				 }
				 System.out.println("");
		}//end for
	}//end main
}//end class
