package practice;

import java.util.Arrays;

public class Practice_1_BinarySearch {
    
	public static int binarySearch(int a[],int l,int h,int num) {
		if(h>=l) {
			int m=l+(h-l)/2;
			if(num==a[m])
				return m;
			if(num>a[m])
				return binarySearch(a,m+1,h,num);
			return binarySearch(a,l,m-1,num);
		}
		return -1;
	}
	
	
	public static int binarySearchFromSortedRotatedArray(int a[],int l,int h,int num) {
		while(h>=l) {
			int m=l+(h-l)/2;
			if(num==a[m])
				return m;
			if(a[l]<a[m]) {
				if(a[l]<=num&&a[m]>num) {
					h=m-1;
				}else {
					l=m+1;
				}
			}else {
				if(a[h]>=num&&a[m]<num) {
					l=m+1;
				}else {
					h=m-1;
				}
			}
		}
		return -1;
	}
	
	public static int binarySearchFromSortedRotatedArray1(int a[],int l,int h,int num) {
		if(h>=l) {
			int m=l+(h-l)/2;
			if(num==a[m])
				return m;
			if(a[l]<a[m]) {
				if(a[l]<=num&&a[m]>num) {
					return binarySearchFromSortedRotatedArray1(a,l,m-1,num);
				} 
			    return binarySearchFromSortedRotatedArray1(a,m+1,h,num);
			} else {
				if(a[h]>=num&&a[m]<num) {
					return binarySearchFromSortedRotatedArray1(a,m+1,h,num);
				} 
				return binarySearchFromSortedRotatedArray1(a,l,m-1,num);
			}
		}
		return -1;
	}
	
	
	public static int maxSum(int a[]) {
		int sumMax=0;
		int max=Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++) {
			sumMax=sumMax+a[i];
			if(sumMax>max) {
				max=sumMax;
			}
			if(sumMax<0) {
				sumMax=0;
			}
		}
		return max;
	}
	
	public static void main(String args[]) {
		int a[]= {1,2,3,4,5,6,7,8,9};
		int a1[]= {8,9,1,2,3,4,5,6,7};
		int a2[]= {-1,9,1,-4,3,-1,5,6,7};
		System.out.println(binarySearch(a,0,a.length-1,8));
		System.out.println(binarySearchFromSortedRotatedArray1(a1,0,a.length-1,4));
		System.out.println(maxSum(a2));
	}
}
