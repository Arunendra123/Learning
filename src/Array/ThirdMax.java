package Array;

public class ThirdMax {
    public static int thirdMax(int a[]) {
    	int max=Integer.MIN_VALUE;
    	int secondMax=Integer.MIN_VALUE;
    	int thirdMax=Integer.MIN_VALUE;
    	for(int i=0;i<a.length;i++) {
    		if(a[i]>max) {
    			thirdMax=secondMax;
    			secondMax=max;
    			max=a[i];
    		} else if(a[i]>secondMax) {
    			thirdMax=secondMax;
    			secondMax=a[i];
    		} else if(a[i]>thirdMax) {
    			thirdMax=a[i];
    		}
    	}
    	return thirdMax;
    }
    
    public static void main(String args[]) {
  	  System.out.print(thirdMax(new int[]{2,5,4,6,7,9,0}));
    }
}
