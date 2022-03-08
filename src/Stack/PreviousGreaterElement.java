package Stack;

import java.util.Stack;
import java.util.Vector;

public class PreviousGreaterElement {
     public static Vector<Integer> getPreviousGreaterElements(int a[]) {
    	 Stack<Integer> s=new Stack<Integer>();
    		Vector<Integer> v=new Vector<Integer>();
    		for(int i=0;i<a.length;i++) {
    			if(s.size()==0) {
    				v.add(-1);
    			} else if(s.peek()>a[i]) {
    				v.add(s.peek());
    			} else {
    				while(s.size()>0&&s.peek()<a[i]) {
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
}
