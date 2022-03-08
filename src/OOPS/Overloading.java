package OOPS;

class Over {
	public void m1(Object o) {
		System.out.println("Object Method");
	}
	
	public void m1(String o) {
		System.out.println("String Method");
	}
}

public class Overloading {

	public static void main(String[] args) {
		Over over=new Over();
		over.m1("Okay");
		over.m1(new Object());
		over.m1(null);
	}
}
