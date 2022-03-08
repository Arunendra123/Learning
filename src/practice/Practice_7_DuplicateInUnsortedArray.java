package practice;

public class Practice_7_DuplicateInUnsortedArray {
      public static void printDuplicate(int a[]) {  
    	  for(int i=0;i<a.length;i++) {
        	  int j=Math.abs(a[i]);
        	  if(a[j]>=0) {
        		  a[j]=-a[j];
        	  }else {
        		  System.out.println(j+"\t");
        	  }
    	  }
      }
      
      public static void main(String args[]) {
    	  int a[]= {1,4,3,5,2,6,7,2,0};
    	  printDuplicate(a);
      }
}
