package Stack;

import java.util.Stack;

public class ReverseAStack {
   public static Stack<Integer> reverse(Stack<Integer> A) {
	   Stack<Integer> B=new Stack<Integer>();
	   while(A.size()!=0) {
		   B.push(A.pop());
	   }
	   return B;
   }
   
   public static void print(Stack<Integer> A) {
	   System.out.print("\n");
	   for(Integer i:A) {
		   System.out.print(i+"\t");
	   }
   }
   
   public static void main(String args[]) {
	   Stack<Integer> A=new Stack<Integer>();
	   A.push(4);
	   A.push(7);
	   A.push(8);
	   A.push(2);
	   print(A);
	   A=reverse(A);
	   print(A);
   }
}
