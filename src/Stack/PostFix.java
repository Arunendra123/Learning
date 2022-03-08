package Stack;

import java.util.Stack;

public class PostFix {
       public static void main(String args[]) {
    	   String str[]={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
    	   System.out.print(evalRPN(str));
       }
       
    	public static int evalRPN(String[] tokens) {
    	        Stack<Integer> st=new Stack<Integer>();
    	        for(String str:tokens){
    	            if(str=="+"||str=="-"||str=="*"||str=="/"){
    	                int b=st.pop();
    	                int a=st.pop();
    	                if(str=="+"){
    	                     st.push(a+b);
    	                }else if(str=="-"){
    	                     st.push(a-b);
    	                }else if(str=="*"){
    	                     st.push(a*b);
    	                }else if(str=="/"){
    	                     st.push(a/b);
    	                }
    	            }else{
    	                st.push(Integer.parseInt(str));
    	            }
    	        }
    	        return st.peek();
    	}
}
