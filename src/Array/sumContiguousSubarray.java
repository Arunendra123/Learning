package Array;

import java.util.Arrays;

public class sumContiguousSubarray {

	/*public int orintSubArray(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				int sum=0;
				for(int k=i;k<=j;k++) {
                     sum=sum+arr[k];
                     System.out.print(arr[k]+",");
				}
				System.out.println();
				if(sum>max) {
					max=sum;
				}
			}
		}
		return max;
	}*/
	
	public static int getSum(int arr[]) {
		int sum=arr[0];
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(sum>max) {
				max=sum;
			}
			if(sum<0) {
				sum=0;
			}
		}
		return max;
	}
	
	
	public static void main(String args[]) {
		int[] arr= {2,3,4,1,-6,3,-4,0,5,6,8,9};
		Arrays.sort(arr);
		for(int x:arr) {
			System.out.print(x+",");
		}
		System.out.println();
		System.out.println(getSum(arr));
	}
}
