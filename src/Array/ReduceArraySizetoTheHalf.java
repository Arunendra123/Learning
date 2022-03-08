package Array;

import java.util.Arrays;
import java.util.HashMap;

public class ReduceArraySizetoTheHalf {

    public int getCount(int arr[]) {
		HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
		int ar[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i])+1);
			} else {
				hm.put(arr[i],1);
			}
		}
		int j=0;
		for(int i:hm.keySet()) {
			ar[j++]=hm.get(i);
		}
		
		Arrays.sort(ar);
		
		int count=0;
		int size=0;
		for(int i=arr.length-1;i>=0;i++) {
			size=size+ar[i];
			if(size>=arr.length/2) {
				return size;
			}
		}
		return 0;	
	}
    
    public static void main(String args[]) {
    	System.out.print(new ReduceArraySizetoTheHalf().getCount(new int[] {3,3,3,3,5,6,8}));
    }
}

