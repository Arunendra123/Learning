package Array;
import java.util.HashMap;

public class OddOccurrence {
     public static int oddOccurrence(int a[]) {
    	 HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
    	 for(int i=0;i<a.length;i++) {
    		 if(map.containsKey(a[i])) {
    			 map.put(a[i], map.get(a[i])+1);
    		 } else {
                 map.put(a[i],1);
    		 }
    	 }
    	 
         for(int key:map.keySet()) {
        	 if(map.get(key)%2==1) {
                 return key;
        	 }
         }
         return -1;
     }
     
     public static void main(String args[]) {
    	 int a[]= {1,1,1,1,3,3,4,3,4,5,6,5,6};
    	 System.out.print(oddOccurrence(a));
     }
}