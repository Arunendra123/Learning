package JarTest;

import Calculator.Calculator;

//math-jar-test
public class TestCalculator {
       public static void main(String args[]) {
    	   Calculator c=new Calculator();
    	   System.out.println(c.add(50, 660));
    	   System.out.println(c.sub(50, 660));
    	   System.out.println(c.mult(50, 660));
    	   System.out.println(c.div(50, 10));
       }
}
