package Heap;

public class Introduction {

	
	/* Heap: Heap is a complete binary tree. 
	 * 
	 * 1. Min Heap : Parent node always be greater than its child.
	 * 2. Max Heap : Child node always be greater than its Parent.
	 * 
	 *   Array representation of heap
	 *   
	 *   base index 1
	 *   Parent Node index= Floor(i/2) where i is child index.
	 *   Left   Node Index= 2*i;
	 *   Right  Node Index= 2*i+1;
	 *   
	 *   base index 0
	 *   Parent Node index= Floor((i-1)/2) where i is child index.
	 *   Left   Node Index= 2*i+1;
	 *   Right  Node Index= 2*i+2;
	 *   
	 */
	public static void main(String args[]) {
		Heap n=new Heap();
		int a[]=new int[100];
		int i=-1;
		n.insert(a,-1, 45);
		n.insert(a,0, 23);
		n.insert(a,1, 3);
		n.insert(a,2, 55);
		n.insert(a,3, 24);
		n.insert(a,4, 27);
		n.insert(a,5, 2);
		n.insert(a,6, 8);
		n.insert(a,7, 9);
		n.insert(a,8, 90);
		n.insert(a,9, 39);
		n.insert(a,10,80);
		n.insert(a,11,500);
		
		System.out.println(a[0]);
		n.delete(a,12);
		System.out.println(a[0]);
		n.delete(a,11);
		System.out.print(a[0]);
	}
}

class Heap{
	
	
	public void insert(int a[],int n,int num) {
		n=n+1;
		a[n]=num;
		int i=n;
		while(i>=0) {
			if(a[i]>a[i/2]==true) {
			    int tmp=a[i/2];
			    a[i/2]=a[i];
			    a[i]=tmp;
			}else {
				break;
			}
			i=i/2;
		}
	}
	
	public void delete(int a[],int n) {
		a[0]=a[n];
		n=n-1;
		int i=0;
		while(i<=n) {
		  if(2*i+1<=n&&a[i]<a[2*i+1]&&a[2*i+1]>a[2*i]) {
			   int tmp=a[i];
			   a[i]=a[2*i+1];
			   a[2*i+1]=tmp;
			   i=2*i+1;
		   } else if(2*i<=n&&a[i]<a[2*i]) {
			   int tmp=a[i];
			   a[i]=a[2*i];
			   a[2*i]=tmp;
			   i=2*i;
			} else {
			   break;
		   }
		}
	}
}