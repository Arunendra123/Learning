package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionInterface {
	          /*Collection Interface
	           * Collection
	           * List
	           * Set
	           * SortedSet
	           * NavigableSortedSet
	           * Map
	           * SortedMap
	           * NavigableSortedMap
	           * Queue
	           * */
               public static void main(String args[]) {
            	  /*Collection c=new ArrayList();
            	  Collection c1=new LinkedList();
            	  Collection c2=new Vector();
            	  Collection c3=new Stack();
            	  List l=new ArrayList();
            	  List l2=new LinkedList();
            	  List l3=new Vector();
            	  List l4=new Stack();
            	  Set s=new TreeSet();
            	  Set s2=new HashSet();
            	  Set s1=new LinkedHashSet();
           	  
            	  TreeSet<Integer> ts=new TreeSet<Integer>();
            	  ts.add(3);
            	  ts.add(10);
            	  ts.add(2);
            	  ts.add(9);
            	  ts.add(1);
            	  ts.add(9);
            	  ts.remove(8);
            	  
            	  Iterator<Integer> it=ts.iterator();
            	  while(it.hasNext()) {
            		  System.out.println(it.next());
            	  }
            	  
            	  HashSet<Integer> hs=new HashSet<Integer>();
            	  hs.add(3);
            	  hs.add(10);
            	  hs.add(2);
            	  hs.add(9);
            	  hs.add(1);
            	  
            	  Iterator<Integer> it1=hs.iterator();
            	  while(it1.hasNext()) {
            		  System.out.println(it1.next());
            	  }
            	  
            	  LinkedHashSet<Integer> lhs=new LinkedHashSet<Integer>();
            	  lhs.add(3);
            	  lhs.add(10);
            	  lhs.add(2);
            	  lhs.add(9);
            	  lhs.add(1);
            	  
            	  Iterator<Integer> it2=lhs.iterator();
            	  while(it2.hasNext()) {
            		  System.out.println(it2.next());
            	  }
            	  
            	  Stack<Integer> st=new Stack<Integer>();
            	  st.push(1);
            	  st.push(4);
            	  st.push(7);
            	  st.push(3);
            	  st.push(8);
            	  st.push(9);
            	  st.push(0);
            	  st.push(21);
            	  System.out.print("\n");
            	  
            	  Iterator<Integer> it4=st.iterator();
            	  while(it4.hasNext()) {
            		  System.out.println(it4.next());
            	  }
            	  
            	  Enumeration<Integer> em=st.elements();
            	  while(em.hasMoreElements()) {
            		  System.out.print(em.nextElement());
            	  }*/
            	   
            	  //minPartitions("235454");
            	  //int[] x= {6,8,9,7,4,3,1};
            	   
            	   int n=5;
            	   n=1<<n;
            	   System.out.print(n);
       
              }
               
               public static void minPartitions(String n) {
                   System.out.print(n.chars().max().getAsInt());
               }
}
