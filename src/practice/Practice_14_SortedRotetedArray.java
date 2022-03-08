package practice;

public class Practice_14_SortedRotetedArray{
	public static int binarySearch(int a[],int l,int h,int num) {
		if(l<h) {
			int mid=l+(h-l)/2;
			if(a[mid]==num) {
				return mid;
			} else if(a[mid]>a[l]) {
				if(num>a[l]&&num<a[mid]) {
					return binarySearch(a,l,mid-1,num);
				} else {
					return binarySearch(a,mid+1,h,num);
				}
			} else {
				if(num<a[h]&&num>a[mid]) {
					return binarySearch(a,mid+1,h,num);
				} else {
					return binarySearch(a,l,mid-1,num);
				}
			}
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.print(binarySearch(a,0,a.length-1,1));
	}
}