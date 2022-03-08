package Stack;

import java.util.Stack;

public class CheckExpressionIsValid {
	public static boolean isValid(String exp) {
		Stack<Character> s=new Stack<Character>();
		char[] exp_new=exp.toCharArray();
		
		for(char c:exp_new) {
		    if(c=='(' || c=='{' || c=='[') {
		    	s.push(c);
		    	continue;
		    } else if((s.peek()=='(' && c==')') || (s.peek()=='{' && c=='}') || (s.peek()=='[' && c==']')) {
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
		String str="{[{}{}]}[()]";
		System.out.print(isValid(str));
	}
}
