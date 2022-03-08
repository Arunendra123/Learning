package LinkedList;

import java.util.HashSet;

class LinkedList5 {
   Node head;
   class Node{
	   int data;
	   Node next;
	   Node(int data){
		   this.data=data;
		   this.next=null;
	   }
   }
      
   public void insertNode(LinkedList5 list,int data) {
	   Node node=new Node(data);
	   if(list.head==null) {
		   list.head=node;
	   }else {
		   Node tmp=list.head;
		   while(tmp.next!=null) {
			   tmp=tmp.next;
		   }
		   tmp.next=node;
	   }
	   return;
   }
   
   public void deleteNode(LinkedList5 list,int data) {
	    Node cur=list.head;
	    Node pre=null;
	    if(list.head==null) {
	    	System.out.println("List is Empty");
	    } else if(cur.data==data) {
	    	cur=cur.next;
	    	list.head=cur;
	    } else {
	    	while(cur!=null) {
	    		pre=cur;
	    		cur=cur.next;
	    		if(cur.data==data) {
	    			pre.next=cur.next;
	    			break;
	    		}
	    	} 
	    } 
    }
   
   public void printList(LinkedList5 list) {
	   if(list.head==null) {
		   System.out.print("Empt");
	   } else {
		   Node tmp=list.head;
		   while(tmp!=null) {
			   System.out.print("\t"+tmp.data);
			   tmp=tmp.next;
		   }
	   }
	   System.out.println();
   }
   
   public void reverseList(LinkedList5 list) {
	   if(list.head==null) {
		   System.out.print("List is Empty");
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
   
   public int max(LinkedList5 list) {
	   int max=Integer.MIN_VALUE;
	   if(list.head==null) {
		   System.out.print("Empty");
	   } else {
		   Node tmp=list.head;
		   while(tmp!=null) {
			   if(tmp.data>max) {
				   max=tmp.data;
			   }
			   tmp=tmp.next;
		   }
	   }
	   return max;
   }
   
   public boolean search(Node head,int key) {
	   if(head==null) {
		   return false;
	   }else if(head.data==key) {
		   return true;
	   } else {
		   return search(head.next,key);
	   }
   }
   
   //Remove Duplicate using two loop
   public void removeDuplicate(LinkedList5 list) {
	   HashSet<Integer> hs=new HashSet<Integer>();
	   if(list.head==null) {
		   System.out.print("Empty");
	   }else {
		   Node pre=null;
		   Node cur=list.head;
		   while(cur!=null) {
			   if(hs.contains(cur.data)) {
				  pre.next=cur.next;   
			   }else {
				   pre=cur;
				   hs.add(cur.data);
			   }
			   cur=cur.next;
		   }
	   }
   }
   
   
   public static void main(String args[]) {
	   LinkedList5 list=new LinkedList5();
	   list.insertNode(list, 5);
	   list.insertNode(list, 6);
	   list.insertNode(list, 8);
	   list.insertNode(list, 9);
	   list.insertNode(list, 9);
	   list.insertNode(list, 9);
	   list.insertNode(list, 14);
	   list.insertNode(list, 13);
	   list.insertNode(list, 14);
		/*
		 * list.printList(list); list.reverseList(list); list.printList(list);
		 * list.deleteNode(list, 8); list.printList(list);
		 * System.out.print("\n"+list.max(list));
		 * System.out.print("\n"+list.search(list.head,6));
		 * System.out.print("\n"+list.search(list.head,23));
		 */
	   list.printList(list);
	   list.removeDuplicate(list);
	   list.printList(list);
   }
   
}
