package Array;

class Queue{
	 private int[] queue;
     int rear,front=0;
     int capacity;
     
     Queue(int c){
    	 capacity=c;
    	 queue=new int[c];
     }
     
     public void enQueue(int num) {
    	 if(rear==capacity) {
    		System.out.print("Queue is full"); 
    		 return;
    	 }else {
    		 queue[rear++]=num;
    		 return;
    	 }
     }
     
     public void deQueue() {
    	 if(rear==front) {
    		 System.out.print("Queue is empty"); 
    	 }else {
    		 for(int i=0;i<rear-1;i++) {
    			 queue[i]=queue[i+1];
    		 }
    		 if(rear<capacity)
    		       queue[rear]=0;
    		 rear--;
    	 }
    	 return;
     }
     
     public void print() {
    	 for(int i=0;i<rear;i++) {
    		 System.out.print(queue[i]+",");
    	 }
    	 System.out.println();
     }
}


public class QueueUsingArray {
    
      public static void main(String args[]) {
    	  Queue q=new Queue(4);
    	  q.enQueue(5);
    	  q.enQueue(6);
    	  q.enQueue(7);
    	  q.enQueue(8);
    	  q.enQueue(8);
    	  q.print();
    	  q.deQueue();
    	  q.print();
    	  q.deQueue();
    	  q.deQueue();
    	  q.deQueue();
    	  q.deQueue();
      }
       
}
