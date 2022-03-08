package Array;

import java.util.HashMap;

class Pair{
	int first;
	int second;
	Pair(int first,int second){
		this.first=first;
		this.second=second;
	}
}

public class FourSum {
   public static void fourSum(int a[],int sum) {
	   HashMap<Integer,Pair> map=new HashMap<Integer,Pair>();
	   for(int i=0;i<a.length-1;i++) {
		   for(int j=i+1;j<a.length;j++) {
			   map.put(a[i]+a[j], new Pair(a[i],a[j]));
		   }
	   }
	   
	   for(int i=0;i<a.length-1;i++) {
		   for(int j=i+1;j<a.length;j++) {
			   int tmsum=a[i]+a[j];
			   if(map.containsKey(sum-tmsum)) {
				   int key=sum-tmsum;
				   if(map.get(key).first!=a[i]&&map.get(key).first!=a[j]&&
						   map.get(key).second!=a[i]&&map.get(key).second!=a[j]) {
					   System.out.println(a[i]+","+a[j]+","+map.get(key).first+","+map.get(key).second);
				   }
			   }
		   }
	   }
   }
   
   public static void main(String args[]) {
	   int a[]= {3,5,7,8,2,3,4};
	   fourSum(a,22);
   }
}
