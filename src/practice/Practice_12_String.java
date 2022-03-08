package practice;

public class Practice_12_String {
   public static void main(String args[]) {
	   System.out.println(ReverseString.reverse(new StringBuffer("Arunendra")));
   }
}

class ReverseString {
	
	public static StringBuffer reverse(StringBuffer str) {
		StringBuffer sb=new StringBuffer();
		char[] c=str.toString().toCharArray();
		for(int i=c.length-1;i>=0;i--) {
			sb.append(i);
		}
		return sb;
	}
}
