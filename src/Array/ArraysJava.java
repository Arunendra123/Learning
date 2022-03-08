package Array;

public class ArraysJava {
	
	  public static int binarySearch(int array[],int l,int h,int num) {
    	  if (h >= l) {
    	    int mid=l+(h-l)/2;
    	    if(array[mid]==num)
    	    	 return mid;
    	    if(num>array[mid]) 
    	    	 return binarySearch(array,mid+1,h,num);
            return binarySearch(array,l,mid-1,num);
    	 }
         return -1;
      }
	 
      public static void main(String args[]) {
        	int array[]= {1,2,3,4,5,6,7};
        	System.out.println(binarySearch(array,0,array.length-1,5));
      }
}
