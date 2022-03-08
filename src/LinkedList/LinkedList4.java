package LinkedList;

public class LinkedList4 {
	 Node head;
	 class Node{
		  int data;
		  Node next;
    	  Node(int data){
    		  this.data=data;
    		  this.next=null;
    	  }
      }
	 
	 public void insert(int data) {
		  Node tmp=this.head;
		  if(this.head==null) {
			  this.head=new Node(data);
		  }else {
			  while(tmp.next!=null) {
				  tmp=tmp.next;
			  }
			  tmp.next=new Node(data);
		  }
	 }
	 
	 public void printList() {
		 Node tmp=this.head;
		 while(tmp!=null) {
			 System.out.print(tmp.data+"\t");
			 tmp=tmp.next;
		 }
		 System.out.println();
	 }
	 
	 public void reverse() {
		 Node pre=null;
		 Node cur=this.head;
		 Node nxt=null;
		 while(cur!=null) {
			 nxt=cur.next;
			 cur.next=pre;
			 pre=cur;
			 cur=nxt;
		 }
		 this.head=pre;
	 }
	 
	 public void deleteNode(int data) {
		 Node cur=this.head;
		 Node pre=null;
		 if(cur.data==data) {
			 cur=cur.next;
			 head=cur;
		 }else {
			 while(cur.next!=null) {
				 pre=cur;
				 cur=cur.next;
				 if(cur.data==data) {
					 pre.next= pre.next.next;
				 }
			 }
		 }
	 }
	 
	 
	 public static void main(String args[]) {
		 LinkedList4 list= new LinkedList4();
		 list.insert(10);
		 list.insert(30);
		 list.insert(50);
		 list.insert(44);
		 list.insert(23);
		 list.insert(54);
		 list.insert(98);
		 list.insert(12);
		 
		 //list.printList();
		 //list.reverse();
		 list.printList();
		 list.deleteNode(10);
		 list.printList();
		 list.deleteNode(12);
		 list.printList();
		 list.deleteNode(44);
		 list.printList();
		 list.deleteNode(50);
		 list.printList();
	 }
}
