package Array;

public class SecondMax {
  public static int secondMax(int a[]) {
	  int max=Integer.MIN_VALUE;
	  int secondMax=Integer.MIN_VALUE;
	  
	  for(int i=0;i<a.length;i++) {
		  if(a[i]>max) {
			  secondMax=max;
			  max=a[i];
		  }else if(a[i]>secondMax && a[i]!=max){
			  secondMax=a[i];
		  }
	  }
	  return secondMax;
  }
  
  public static void main(String args[]) {
	  System.out.print(secondMax(new int[]{2,5,4,6,7,9,9,0}));
  }
}
