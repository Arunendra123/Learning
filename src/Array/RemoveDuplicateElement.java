package Array;

public class RemoveDuplicateElement {
	public static int removeDuplicates(int a[], int n)
    {
		int x[]=new int[a.length];
		int j=0;
        for(int i=0;i<a.length-1;i++) {
        	if(a[i]!=a[i+1]) {
        		x[j++]=a[i];
        	}
        }
        
        x[j++]=a[a.length-1];
        // Changing the original array
        for (int i = 0; i < j; i++) {
            a[i] = x[i];
        }
        return j;
    }
  
    public static void main(String[] args)
    {
        int a[] = { 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6 };
        int n = a.length;
         
        int j=0;
        j = removeDuplicates(a, n);
  
        for (int i = 0; i < j; i++)
            System.out.print(a[i] + " ");
    }
}
