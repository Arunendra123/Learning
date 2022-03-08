package Recursion;

public class main {
	
	//Factorial
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		return fact(n-1)*n;
	}
	
	//power
	public static int pow(int a,int b) {
		if(b==0) {
			return 1;
		}
		return pow(a,b-1)*a;
	}
	
	//Sum of n natural number
	public static int sum(int n) {
		if(n==1) {
			return 1;
		}
		return sum(n-1)+n;
	}
	
	//Find the number of way for matrix
	
	
	public static void main(String args[]) {
           System.out.println("Factorial: "+fact(5));
           System.out.println("Factorial: "+pow(5,2));
           System.out.println("Sum: "+sum(10));
    }
}
