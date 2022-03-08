package OOPS;

import java.util.HashMap;

class AA {
	HashMap<String,Integer> hm=new HashMap<String,Integer>();
	AA(){
		if(hm.containsKey(this.getClass().getName())){
			hm.put(this.getClass().getName(), hm.get(this.getClass().getName())+1);
		} else {
			hm.put(this.getClass().getName(), 1);
		}
		//System.out.println("Object created: "+this.getClass().getName());
	}
	public int getInstanceCount() {
		return (int)hm.get(this.getClass().getName());
	}
}

class BB extends AA {
	
}

class CC extends BB {
	
}

class DD extends CC {
	
}



public class CountObject {
   public static void main(String[] args) {
	  AA a=new AA();
	  BB b=new BB();
	  CC c=new CC();
	  CC c1=new CC();
	  CC c2=new CC();
	  System.out.println(c2.getInstanceCount());
   }
}
