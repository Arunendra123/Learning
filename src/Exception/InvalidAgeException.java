package Exception;

public class InvalidAgeException extends Exception{
	   String msg;
       public InvalidAgeException(String msg) {
    	   this.msg=msg;
       }
       
       public String toString() {
		  return msg;
       }
}
