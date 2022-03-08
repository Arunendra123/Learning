package GarbageCollection;

public class GarbageMain {

	public static void main(String args[]) {
		EligibleForGC efg=new EligibleForGC(50);
		System.out.println(efg);
		efg=null;
		
		System.gc();
		//or
		Runtime runtime=Runtime.getRuntime();
		runtime.gc();
		System.out.println("Free Memory="+runtime.freeMemory());
		System.out.println("Max Memory="+runtime.maxMemory());
			
		//gc() call finalize() method to perform the cleanup activity
	    //We can override the method
	}
	
	@Override
	public void finalize() throws Throwable {
		System.out.println("Finalize");
	}
}

class EligibleForGC {
	private int num;

	public EligibleForGC(int num) {
		super();
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "EligibleForGC [num=" + num + "]";
	}
}
