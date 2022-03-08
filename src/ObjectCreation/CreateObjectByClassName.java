package ObjectCreation;

public class CreateObjectByClassName {
   
	  public static void main(String args[]) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		  Object o=Class.forName(args[0]).newInstance();
		  ClassRoom cr=(ClassRoom)o;
		  cr.setName(args[0]);
		  System.out.println(cr.getName()); 
	  }
}
