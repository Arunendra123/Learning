package Array;

public class PeakElement {
	
	/*   0,1,2,3,4,5,6,7,8,9,10
	 *   1,3,5,3,7,1,4,8,5,9, 0
	 */
	
	public static int getPeakIndex(int a[],int l,int r) {
     	int mid=l+(r-l)/2;
		if ((mid==0||a[mid-1]<=a[mid])&&(mid==a.length-1||a[mid+1]<=a[mid])) {
			return mid;
		} else if (mid > 0 && a[mid-1]>a[mid]) {
			return getPeakIndex(a,l,mid-1);
		} else {
			return getPeakIndex(a,mid+1,r);
		}
    }

    public static void main(String args[]) {
    	int a[]= {1,3,5,3,7,1,4,8,5,9,0};
    	System.out.print(getPeakIndex(a,0,a.length-1));
    }
}
