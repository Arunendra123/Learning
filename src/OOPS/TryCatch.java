package OOPS;

public class TryCatch {
    //try without catch with finally works fine
	public static void main(String args[]) {
		try {
			System.out.print("Try");
		} /*
			 * catch(Exception e) { System.out.print("Catch"); }
			 */
		finally{
			System.out.print("Finally");
		}
	}
}
