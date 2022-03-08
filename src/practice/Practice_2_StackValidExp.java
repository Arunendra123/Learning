package practice;

import java.util.Stack;

public class Practice_2_StackValidExp {

	public static boolean isValidExp(String exp) {
		Stack<Character> s=new Stack<Character>();
		char[] exp1=exp.toCharArray();
		for(char c:exp1) {
			if(c=='('||c=='{'||c=='[') {
				s.push(c);
			} else if((s.peek()=='('&&c==')')||(s.peek()=='{'&&c=='}')||(s.peek()=='['&&c==']')) {
				s.pop();
			}
		}
		if(s.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void main(String args[]) {
		String str="(){}[]({[]})((()))";
		System.out.print(isValidExp(str));
	}
}
