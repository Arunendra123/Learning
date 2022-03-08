package LinkedList;

public class LinkedList {
       Node head;
       class Node
       {
    	   int data;
    	   Node next;
    	   Node(int d)
    	   {
    		   data=d;
    		   next=null;
    	   }
       }
       
       public LinkedList insertNode(LinkedList list,int data) {
    	   Node node=new Node(data);
    	   if(list.head==null){
    		   list.head=node;
    	   }
    	   else {
    		   Node last=list.head;
    		   while(last.next!=null) {
                     last=last.next;    			   
    		   }
    		   last.next=node;
    	   }
    	   return list;
       }
       
       public void reverse(LinkedList list) {
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
       
       public void printList(LinkedList list) {
    	   Node current=list.head;
    	   
    	   while(current!=null) {
    		   System.out.print(current.data+"\t");
    		   current=current.next;
    	   }
       }
}
