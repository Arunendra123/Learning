package LinkedList;

public class LinkedList3 {
    Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	
	public void insertNode(LinkedList3 list,int data) {
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
	}
	
	public void deleteFirstNode(LinkedList3 list) {
		list.head=list.head.next;
	}
	
	public void deleteLastNode(LinkedList3 list) {
		Node tmphead=list.head;
		while(tmphead.next.next!=null) {
			tmphead=tmphead.next;
		}
		tmphead.next=null;
	}
	
	public void deleteNode(LinkedList3 list,int data) {
		Node temp=list.head;
		Node tempPrev=null;
		if(temp.data==data) {
			list.head=list.head.next;
		}else {
			while(temp.next!=null) {
				tempPrev=temp;
				temp=temp.next;
				if(temp.data==data) {
					tempPrev.next=temp.next;
					break;
				}
			}
		}
	}
	
	public void reverse(LinkedList3 list) {
		Node pre=null;
		Node curr=list.head;
		Node nxt=null;
		while(curr!=null) {
			nxt=curr.next;
			curr.next=pre;
			pre=curr;
			curr=nxt;
		}
		list.head=pre;
	}
	
	public void printLinkedList(LinkedList3 list) {
		Node tmphead=list.head;
		System.out.print("\nList: ");
		while(tmphead!=null) {
			System.out.print(tmphead.data+"\t");
			tmphead=tmphead.next;
		}
	}
}
