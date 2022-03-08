package Array;

class Stack{
	
	private int stack[];
	private int top;
	private int Max=1000;
	
	Stack(){
		stack=new int[Max];
		top=-1;
	}
	
	Stack(int size){
		stack=new int[size];
		top=-1;
		Max=size;
	}
	
    public boolean push(int num) {
    	if(top>=Max-1) {
    		System.out.println("Stack OverFlow");
    		return false;
    	}else {
    		stack[++top]=num;
    		return true;
    	}
    }
    
    public int pop() {
    	if(top<0) {
    		System.out.println("Stack UnderFlow");
    		return 0;
    	}else {
    		return stack[top--];
    	}
    }
    
    public int peek() {
    	if(top<0) {
    		System.out.println("Stack UnderFlow");
    		return 0;
    	}
    	return stack[top];
    }
    
    public void printStack() {
    	System.out.println();
    	for(int i=0;i<=top;i++) {
    		System.out.print(stack[i]+",");
    	}
    }
}

public class StackUsingArray {
	
    public static void main(String args[]) {
    	Stack s=new Stack();
    	s.push(0);
    	s.push(1);
    	s.push(2);
    	s.push(3);
    	s.push(4);
    	s.push(5);
    	s.printStack();
    	s.pop();
    	s.pop();
    	s.printStack();
    	System.out.print("Peek:"+s.peek());
    }
}
