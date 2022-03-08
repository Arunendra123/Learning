package LinkedList;

class LinkedList1 
{
	Node head;
    class Node
    {
    	int data;
    	Node next;
    	Node(int data){
    		this.data=data;
    		this.next=null;
    	}
    }
    
    public LinkedList1 insertNode(LinkedList1 l,int data) {
    	Node n=new Node(data);
    	if(l.head==null) {
    		l.head=n;
    	}
    	Node cur=l.head;
    	while(cur.next!=null) {
    		cur=cur.next;
    	}
    	cur.next=n;
    	return l;
    }
    
    public void printList(LinkedList1 l) {
    	Node cur=l.head;
    	while(cur.next!=null){
    		System.out.println(cur.data);
    	}
    }
    
}
