package Stack;

import java.util.Stack;
import java.util.Vector;

class Pair<I1,I2>{
	Pair(I1 value,I2 index){
		this.value=value;
		this.index=index;
	}
	public I1 value;
	public I2 index;
}

public class StockSpanProblem {
     public static Vector<Integer> getNearestGraterToLeft(int a[]){
    	 Vector<Integer> v=new Vector<Integer>();
    	 Stack<Pair<Integer,Integer>> s=new Stack<Pair<Integer,Integer>>();
    	 for(int i=0;i<a.length;i++) {
    		 if(s.size()==0) {
    			 v.add(-1);
    		 } else if(s.peek().value>a[i]) {
    			 v.add(s.peek().index);
    		 } else {
    			 while(s.size()>0 && s.peek().value<a[i]) {
    				 s.pop();
    			 }
    			 if(s.size()==0) {
    				 v.add(-1);
    			 } else {
    				 v.add(s.peek().index);
    			 }
    		 }
    		
    		 s.push(new Pair<Integer, Integer>(a[i],i));
    	 }
    	 for(int i=0;i<v.size();i++) {
    		 v.set(i,i-v.get(i)-1);
    	 }
    	 return v;
     }
     
     public static void main(String args[]) {
    	 int a[]= {2,4,5,1,8,9};
    	 System.out.print(getNearestGraterToLeft(a));
     }
}
