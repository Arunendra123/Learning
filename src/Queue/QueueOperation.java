package Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueOperation {
      public static void main(String args[]) {
    	  Queue<Integer> q=new  ArrayBlockingQueue<Integer>(10);
    	  q.add(1);
    	  q.add(2);
    	  q.add(3);
    	  q.add(4);
    	  q.add(5);
    	  System.out.println(q);
    	  q.poll();
    	  System.out.println(q);
    	  System.out.println(q.peek());
      }
}
