package Array;

public class OddOccurrenceXOR {
      public static int oddOccurrence(int a[]) {
    	  int num=0;
    	  for(int i=0;i<a.length;i++) {
    		  num=num^a[i];
    	  }
    	  return num;
      }
      
      public static void main(String args[]) {
     	 int a[]= {1,1,1,1,3,3,4,3,4,5,6,5,6};
     	 System.out.print(oddOccurrence(a));
      }
}
