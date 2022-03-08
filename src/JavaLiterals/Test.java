package JavaLiterals;

import java.io.Serializable;

public class Test implements Serializable{
	
	transient static int age=90;
	public static void main(String args[]) {
	
		int w=0b0100001;
		int w1=0b0;           // Binary
		int x=0127;           // Octal Number
		int y=0x123fd;        // Hexadecimal
		int z=12123;          // Decimal

		System.out.println(w);		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		char a='a';
		int  b=a;
		char c=(char)b;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		int t[][]=new int[2][];
	    t[0]=new int[9];
	    t[1]=new int[6];
	    
	    int f[]=new int[] {1,2,3,4,5};
	    
	    final int g=10;
		
	    int j=2; 
	    int i=2;
	    int k=4;
	    int l=4;
	    int m=9;
	    
	    System.out.println(i^j^k^l^m);
	    
	    boolean n=false;
	    boolean o=true;
	    
	    System.out.println(n^o);
	    if(n==true&&test()==true);
	    if(n==true||test()==true);
	    
	    int p=20;
	    p<<=1;
	    System.out.println(p);
	    
	    L1: for(int q=0;q<5;q++) {
	    	System.out.println(q);
	    	L2: for(int q1=0;q1<5;q1++) {
	    		System.out.println(q1);
	    		L3: for(int q2=0;q2<5;q2++) {
	    			System.out.println(q2);
	    	    	if(q2==3) {
	    	    		break L2;
	    	    	}
	    	    }
		    }
	    }
	    
	    try {
			System.out.println(age);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean test() {
		System.out.println("Yes");
		return true;
	}	    
}



