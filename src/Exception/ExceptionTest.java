package Exception;

public class ExceptionTest {

	public static void main(String args[]) {
		(new ExceptionTest()).checkIfException(4);
	}
	
	public void checkIfException(int num) {
		if(num==1) {
			throw new ArithmeticException("One is not valid input");
		} else if(num==2) {
			throw new ArithmeticException("Two is not valid input");
		} else if(num==3){
			throw new ArrayIndexOutOfBoundsException("I am sorry");
		} else {
			try {
				throw new InvalidAgeException("My Exception");
			} catch(InvalidAgeException e) {
			    System.out.print(e);	
			}
			
		}
	}
}
