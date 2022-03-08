package Array;

import java.util.Arrays;

public class ThreeSum {
        public static boolean getThreeSum(int a[],int sum) {
        	Arrays.sort(a);
        	for(int i=0;i<a.length-2;i++) {
        		int l=i+1;
        		int h=a.length-1;
        		while(h>l) {
        			if(a[i]+a[l]+a[h]==sum)
        				return true;
        			if(a[i]+a[l]+a[h]>sum) {
        				h--;
        			} else {
        				l++;
        			}
        		}
        	}
        	return false;
        }
        
        public static void main(String args[]) {
        	int a[]= {3,4,5,6,7,0,1,5,8,0};
        	System.out.print(getThreeSum(a,14));
        }
}
