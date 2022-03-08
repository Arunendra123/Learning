package Array;

public class XOR {
	    public static int[] game_with_number (int arr[], int n)
	    {
	       int[] ar=new int[arr.length-1];
	       for(int i=0;i<arr.length-1;i++){
	           ar[i]=arr[i]^arr[i+1];
	       }
	       return ar;
	    }
	    public static void main(String args[]) {
	    	int arr[]= {3,5,6,4,5,4,4};
	    	int ar[]=game_with_number (arr, arr.length);
	    	for(int x:ar) {
	    		System.out.print("\t"+x);
	    	}
	    }
}
