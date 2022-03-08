package Array;

import java.util.HashSet;

public class RemoveDuplicateUsingSet {

	public static void reomveDuplicate(int a[]) {
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		for(int i:hs) {
			System.out.print(i+"\t");
		}
	}
	
	public static void main(String[] args)
    {
        int a[] = { 1, 2, 2, 3, 6, 7, 8, 6, 3, 4, 4, 4, 5, 5, 6 };
        reomveDuplicate(a);
    }
}
