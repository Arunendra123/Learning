package Array;

import java.util.Arrays;

public class TwoSum {
          public static boolean isTwoSumExist(int a[],int sum) {
        	  Arrays.sort(a);
        	  int l=0,h=a.length-1;
        	  while(h>l) {
        		  if(a[l]+a[h]==sum)
        			  return true;
        		  if(a[l]+a[h]>sum) {
        			  h--;
        		  }else {
        			  l++;
        		  }	  
        	  }
        	  return false;
          }

          public static void main(String args[]) {
        	  int y[]= {-1,5,4,-6,-7,8,3,0};
        	  System.out.print(isTwoSumExist(y,15));
          }
}
