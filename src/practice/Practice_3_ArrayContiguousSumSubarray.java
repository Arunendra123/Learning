package practice;

public class Practice_3_ArrayContiguousSumSubarray {
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
    	int a[]= {2,4,5,-7,-1,2,9,8};
    	System.out.print(maxSum(a));
    }
}
