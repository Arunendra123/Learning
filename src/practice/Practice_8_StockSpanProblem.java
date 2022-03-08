package practice;

import java.util.ArrayList;
import java.util.Stack;

class Pair{
	int value;
	int index;
	Pair(int value,int index){
		this.value=value;
		this.index=index;
	}
}
public class Practice_8_StockSpanProblem {
        public static ArrayList<Integer> NGL(int a[]){
        	Stack<Pair> s=new Stack<Pair>();
            ArrayList<Integer> ar=new ArrayList<Integer>();
            for(int i=0;i<a.length;i++) {
            	if(s.size()==0) {
            		ar.add(-1);
            	} else if(s.peek().value>a[i]) {
            		ar.add(s.peek().index);
            	} else {
            		while(s.size()>0&&s.peek().value<a[i]) {
            			s.pop();
            		}
            		if(s.size()==0) {
            			ar.add(-1);
            		} else {
            			ar.add(s.peek().index);
            		}
            	}
            	s.push(new Pair(a[i],i));
            }
            return ar;
        }
        public static void main(String args[]) {
        	int a[]= {2,4,5,2,2,3,6,7,8,9};
        	ArrayList<Integer> ar=NGL(a);
        	for(int i=0;i<a.length;i++) {
        		System.out.print(i-ar.get(i)-1+",");
        	}
        }
}
