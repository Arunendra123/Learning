package practice;

import java.util.HashMap;

public class Practice_4_twoSumUnsortedArray {
       public static void isTwoSumExist(int a[],int sum) {
    	   HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
    	   for(int i=0;i<a.length;i++) {
    		   hm.put(a[i],0);
    	   }
    	   
    	   for(int i=0;i<a.length;i++) {
    		  hm.put(a[i],1);
    		  if(hm.containsKey(sum-a[i])&&hm.get(sum-a[i])==0) {
    			  System.out.println(sum-a[i]+","+a[i]);
    		  }
    	   }
       }
       
       public static void main(String args[]) {
      	 int a[]= {3,5,2,4,6,7};
      	 isTwoSumExist(a,8);
       }
}
