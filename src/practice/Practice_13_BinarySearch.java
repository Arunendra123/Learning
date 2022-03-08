package practice;

public class Practice_13_BinarySearch{
	public static int binarySearch(int a[],int l,int h,int num) {
		if(h>=l) {
			int m=l+(h-l)/2;
			if(a[m]==num) {
				return m;
			} else if(num>a[m]) {
				return binarySearch(a,m+1,h,num);
			}
			return binarySearch(a,l,m-1,num);
		}
		return -1;
	}
	
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		System.out.print(binarySearch(a,0,a.length-1,1));
	}
}