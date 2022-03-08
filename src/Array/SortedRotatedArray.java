package Array;

public class SortedRotatedArray {
	public static int binarySearch(int a[],int l,int h,int num) {
		if(h>=l) {
			int m=l+(h-l)/2;
			if(num==a[m])
				return m;
			if(a[l]<a[m]) {
				if(a[l]<=num&&a[m]>num) {
					return binarySearch(a,l,m-1,num);
				}
			    return binarySearch(a,m+1,h,num);
			} else {
				if(a[h]>=num&&a[m]<num) {
					return binarySearch(a,m+1,h,num);
				}
				return binarySearch(a,l,m-1,num);
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		int a []= {1,2,3,4,5,6,7,8,9};
		int a1[]= {8,9,1,2,3,4,5,6,7};
		System.out.println(binarySearch(a1,0,a.length-1,4));
	}
}