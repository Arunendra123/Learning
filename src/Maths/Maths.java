package Maths;

public class Maths{
	
	public static long fact(long num) {
		if(num==0 || num==1) {
			return 1;
		}
		return num*fact(num-1);
	}
	
	public static boolean ifPalindrome(int num1,int num2){
		int num3=num1%10;
		num1=num1/10;
		while(num1!=0) {
			num3=num3*10+num1%10;
			num1=num1/10;
		}
		if(num3==num2) {
			return true;
		}
		return false;
	}
	
	public static void main(String args[]) {
		//System.out.print(fact(5));
		
		System.out.print(ifPalindrome(125,521));
	}
}