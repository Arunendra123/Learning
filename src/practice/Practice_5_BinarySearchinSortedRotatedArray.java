package practice;

public class Practice_5_BinarySearchinSortedRotatedArray {

	public static int binarySearch(int a[],int l,int h,int num) {
		if(h>l) {
			int m=l+(h-l)/2;
			if(a[m]==num) {
				return m;
			}  
			if(a[l]<a[m]) {
				if(num>a[l]&&num<a[m]) {
					binarySearch(a,l,m-1,num); 
				}
				binarySearch(a,m+1,h,num); 
			}else{
				if(num>a[m]&&num<a[h]) {
					binarySearch(a,m+1,h,num); 
				}
				binarySearch(a,l,m+1,num);
			}
		}
		return -1;
	}
}
