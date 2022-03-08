package String;

public class StringTest {
	public static void main(String args[]) {
		String s=new String("Arunendra");
		String s1=new String("Arunendra");
		s=s.concat(" Dubey");
		System.out.println(s);
		
		StringBuffer sb=new StringBuffer();
		sb.equals(sb);
		
		String str="Arunendra";
		String str1="Arunendra";
		
		
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
	}
}
