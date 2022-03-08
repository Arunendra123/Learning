package Array;


public class DuplicatesInAnUnsortedArray {
	public static void printDuplicate(int a[]) {
		for(int i=0;i<a.length;i++) {
			int j=Math.abs(a[i]);
			if(a[j]>=0) {
				a[j]=-a[j];
			} else {
				System.out.print(j+"\t");
			}
		}
	}
	public static void main(String[] args) {
	    	int a[]= {3,5,2,7,6,2,1,0};
	    	printDuplicate(a);
	}
}
