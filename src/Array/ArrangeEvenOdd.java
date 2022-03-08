package Array;

import java.util.Arrays;

public class ArrangeEvenOdd {
	public static int[] getElements(int nums[]) {
		int e[]=new int[nums.length];
		int o[]=new int[nums.length];
		int j=0,k=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				e[j++]=nums[i];
			} else {
				o[k++]=nums[i];
			}
		}
		Arrays.sort(e,0,j-1);
		Arrays.sort(o,0,k-1);
		int el=j;
	    int ol=k;
	    int oi=0;
	    int ei=0;
	    int i=0;
	    if(e[0]>o[0]) {
	    	 while(ei<el&&oi<ol) {
	         	if(i%2==0) {
	         		nums[i++]=o[oi++];
	         	} else {
	         		nums[i++]=e[ei++];
	         	}

	         }
	    	 if(ei<el) {
	    		while(ei<el) {
	    			nums[i++]=e[ei++];
	    		}
	    	 } else {
	    		 while(oi<ol) {
		    		nums[i++]=o[oi++];
		         }
	    	 } 
	    	 
	    } else {
	    	while(ei<el&&oi<ol) {
	         	if(!(i%2==0)) {
	         		nums[i++]=o[oi++];
	         	} else {
	         		nums[i++]=e[ei++];
	         	}
	         }
	    	 if(ei<el) {
	    		while(ei<el) {
	    			nums[i++]=e[ei++];
	    		}
	    	 } else {
	    		 while(oi<ol) {
		    			nums[i++]=o[oi++];
		         }
	    	 }
	    }
       return nums;
	}
	public static void main(String args[]) {
		int a[]=getElements(new int[] {2,5,3,4,7,8,9,1,2,3,4,9,});
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
