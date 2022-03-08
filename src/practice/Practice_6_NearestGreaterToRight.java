package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Practice_6_NearestGreaterToRight {
        public static ArrayList<Integer> NGR(int a[]) {
            Stack<Integer> s=new Stack<Integer>();
            ArrayList<Integer> ar=new ArrayList<Integer>();
            for(int i=a.length-1;i>=0;i--) {
            	if(s.size()==0) {
            		ar.add(-1);
            	} else if(s.peek()>a[i]) {
            		ar.add(s.peek());
            	} else {
            		while(s.peek()<a[i]) {
            			s.pop();
            		}
            		if(s.size()==0) {
            			ar.add(-1);
            		}else {
            			ar.add(s.peek());
            		}
            	}
            	s.push(a[i]);
            }
            return ar;
        }
        
        public static void main(String args[]) {
        	int a[]= {2,4,3,1,5,4,7,1,-1,0,3,9};
        	ArrayList<Integer> ar=NGR(a);
        	Collections.reverse(ar);

        	for(int x:ar) {
        		System.out.print(x+"\t");
        	}
        }
}
