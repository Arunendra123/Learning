package OOPS;

import java.io.IOException;

//////////////////////////////////////////////
class ParentA {
	ParentA() {
		
	}
}

class ChildA extends ParentA{
	ChildA() throws IOException{
		super();
	}
}
//////////////////////////////////////////////

class ParentB {
	ParentB() /*throws IOException*/ {
		
	}
}

class ChildB extends ParentB {
	
	  ChildB() {
	  
	  }
	 
}

////////////////////////////////////////////

class ParentC {
	ParentC() throws IOException {
		
	}
}

class ChildC extends ParentB {
	ChildC() throws IOException /*Or Exception*/ {
		super();
	}
}

////////////////////////////////////////////
class ParentD {
	ParentD() throws ArrayIndexOutOfBoundsException {
		
	}
}

class ChildD extends ParentD {
	ChildD() {
		super();
	}
}


public class ConstructorException {
     public static void main(String[] args) {
		try {
			ParentC c=new ParentC();
		} catch(IOException e) {
			e.printStackTrace();
		} finally{
			
		}
	}
}
