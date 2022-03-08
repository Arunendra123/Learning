package Stack;

import java.util.Stack;
import java.util.Vector;

public class NextSmallerElement {
     public static Vector<Integer> getNextSmaller(int a[]){
    	 Vector<Integer> v=new Vector<Integer>();
    	 Stack<Integer> s=new Stack<Integer>();
    	 
    	 for(int i=a.length-1;i>=0;i--) {
    		 if(s.peek()==0) {
    			 v.add(-1);
    		 } else if(s.peek()<a[i]) {
    			 v.add(s.peek());
    		 } else {
    			 while(s.size()>0&&s.peek()>=a[i]) {
    				 s.pop();
    			 }
    			 if(s.peek()==0) {
    				 v.add(-1);
    			 }else {
    				 v.add(s.peek());
    			 }
    		 }
    		 s.push(a[i]);
    	 }
    	 return v;
     }
}
