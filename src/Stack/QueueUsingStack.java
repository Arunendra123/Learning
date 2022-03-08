package Stack;

import java.util.Stack;

public class QueueUsingStack {
	
	/* 1. Method One */
    Stack<Integer> s1=new Stack<Integer>();
    Stack<Integer> s2=new Stack<Integer>();
    public void enQueue(int item) {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(item);
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
	}
	public int deQueue() {
	   	if(s1.isEmpty()) {
	   		System.out.print("Empty");
	   	}
	   	int x=s1.peek();
	   	s1.pop();
	   	return x;
	}
	
	
	
}
