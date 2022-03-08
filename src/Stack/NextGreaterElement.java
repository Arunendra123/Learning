package Stack;

import java.util.Collections;
import java.util.Stack;
import java.util.Vector;

public class NextGreaterElement {
       public static Vector<Integer> nextGreaterElement(int a[]){
    	   Vector<Integer> v=new Vector<Integer>();
    	   Stack<Integer> s=new Stack<Integer>();
    	   for(int i=a.length-1;i>=0;i--) {
    		   if(s.size()==0) {
        		   v.add(-1);
        	   } else if(s.peek()>a[i]) {
        		   v.add(s.peek());
        	   } else {
        		   while(s.size()>0 && s.peek()<=a[i]) {
        			   s.pop();
        		   }
        		   if(s.size()==0) {
        			   v.add(-1);
        		   }else {
        			  v.add(s.peek());
        		   }
        	   }
    		   s.push(a[i]);
    	   }
    	   return v;
       }
       
       
       public static void main(String args[]) {
    	   int a[]= {2,4,3,1,5,4,7,1,-1,0,3,9};
    	   Vector<Integer> v=nextGreaterElement(a);
    	   Collections.reverse(v);
    	   System.out.print(v);
       }
}
