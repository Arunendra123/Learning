package practice;

class Heap{
	public void insert(int a[],int n,int num) {
		n=n+1;
		a[n]=num;
		int i=n;
		while(i>=0) {
			if(a[i]>a[i/2]) {
				int tmp=a[i];
				a[i]=a[i/2];
				a[i/2]=tmp;
			}else {
				break;
			}
			i=i/2;
		}
	}
	
	public void delete(int a[],int n) {
		a[0]=a[n];
		n=n+1;
		int i=0;
		while(i<=n) {
			if(2*i+1<=n&&a[i]<a[2*i+1]&&a[2*i+1]>a[2*i]) {
				int tmp=a[i];
				a[i]=a[2*i+1];
				a[2*i+1]=tmp;
			} else if(2*i<=n&&a[i]<a[2*i]) {
				int tmp=a[i];
				a[i]=a[2*i];
				a[2*i]=tmp;
			} else {
			  break;
			}
		}
	}
}

public class Practice_10_Heap {

}
