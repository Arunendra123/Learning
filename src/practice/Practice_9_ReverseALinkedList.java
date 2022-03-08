package practice;


class LinkedList{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	
	
	 public static void reverse(LinkedList list) {
    	 if(list.head==null) {
    		 System.out.print("Empty");
    	 } else {
    		 Node cur=list.head;
    		 Node pre=null;
    		 Node nxt=null;
    		 while(cur!=null) {
    			 nxt=cur.next;
    			 cur.next=pre;
    			 pre=cur;
    			 cur=nxt;
    		 }
    		 list.head=pre; 
    	 }
     }
}
public class Practice_9_ReverseALinkedList {
    
     
     public static void main(String args[]) {
    	 LinkedList l=new LinkedList();
    	
     }
}
