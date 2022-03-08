package Array;

import java.util.HashMap;

public class TwoSumUnsortedArray {
     public static void TwoSum(int a[],int sum) {
       HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
  	   for(int i=0;i<a.length;i++) {
  		   hm.put(a[i],i);
  	   }
  	   
  	   for(int i=0;i<a.length;i++) {
  		  if(hm.containsKey(sum-a[i])&&hm.get(sum-a[i])!=i&&i<hm.get(sum-a[i])) {
  			  System.out.println(i+","+hm.get(sum-a[i]));
  		  }
  	     }
       }
     
       public static void main(String args[]) {
    	 int a[]= {3,5,2,4,6,7};
    	 TwoSum(a,8);
       }
}