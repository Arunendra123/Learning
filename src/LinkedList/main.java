package LinkedList;

public class main {
     public static void main(String args[]) {
    	 LinkedList3 l=new LinkedList3();
    	 l.insertNode(l,5);
    	 l.insertNode(l,7);
    	 l.insertNode(l,3);
    	 l.insertNode(l,4);
    	 l.insertNode(l,7);
    	 l.insertNode(l,2);
    	 l.insertNode(l,9);
    	 l.insertNode(l,6);
    	 l.printLinkedList(l);
    	 /*l.deleteNode(l, 9);
    	 l.printLinkedList(l);
    	 l.deleteNode(l, 6);
    	 l.printLinkedList(l);
    	 l.deleteNode(l, 5);*/
    	 l.reverse(l);
    	 l.printLinkedList(l);
     }
}
