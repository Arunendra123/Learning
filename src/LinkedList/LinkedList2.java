package LinkedList;

public class LinkedList2 {
     Node head;
     class Node{
    	 Node next;
    	 int data;
    	 Node(int data){
    		 this.data=data;
    		 next=null;
    	 }
     }
     
     public void insertNode(LinkedList2 list,int d) {
    	   Node node=new Node(d);
    	   if(list.head==null) {
    		  list.head=node;
    	   }
    	   else 
    	   {
    		   Node cur=list.head;
    		   while(cur.next!=null) {
    		         cur=cur.next;
               }
    		   cur.next=node;
    	   }
      }
      public void deleteNode(LinkedList2 list,int data) {
    	  Node cur=list.head;
    	  while(cur.next!=null) 
    	  {
    	
    		  if(cur.data==data) {
    			  cur=cur.next.next;
    			  break;
    		   }
    	  }
      }
      
      public void printList(LinkedList2 l) {
    	  Node cur=l.head;
    	  while(cur!=null) {  
    		  System.out.println(cur.data);
    		  cur=cur.next;
    	  }
      }
}
