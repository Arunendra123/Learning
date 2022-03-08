package OOPS;
import static OOPS.Test.*;

import java.io.IOException;
class Parent {
	public Parent m1() throws Exception {
		System.out.print("Parent");
		return null;
	}
	
	/*
	 * public Parent m1() { 
	 *          System.out.print("Parent"); 
	 *          return null; 
	 * }
	 */
}

class Child extends Parent {
	//co-variant return type is poosible
	public Child m1() throws ArrayIndexOutOfBoundsException, IndexOutOfBoundsException, IOException {
		System.out.print("Child");
		return null;
	}
	
	/*
	public Child m1() throws IOException {
		System.out.print("Child");
		return null;
	}
	*/
}

public class Overriding {
  public static void main(String args[]) throws ArrayIndexOutOfBoundsException, IndexOutOfBoundsException, IOException {
	  Child p=new Child();
	  p.m1();
  }
}
