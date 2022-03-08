package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Properties;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionInterface_1 {

	public static void main(String args[]) {
		
		System.out.println("Array List");
		Collection s=new ArrayList();
		s.add(null);
		s.add(null);
		s.add(null);
		s.add(null);
		s.add(null);
		s.add("Arunendra");
		s.add("Dheeru");
		s.add('C');
		
		Iterator i=s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println("Linked List");
		Collection s1=new LinkedList();
		s1.add(null);
		s1.add(null);
		s1.add(null);
		s1.add(null);
		s1.add(null);
		s1.add("Arunendra");
		s1.add("Dheeru");
		s1.add('C');
		
		Iterator i1=s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		
		System.out.println("Vector");
		System.out.println("Vector");
		Collection s2=new Vector();
		s2.add(null);
		s2.add(null);
		s2.add(null);
		s2.add(null);
		s2.add(null);
		s2.add("Arunendra");
		s2.add("Dheeru");
		s2.add('C');
		
		Iterator i2=s2.iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		System.out.println("Stack");
		Collection s3=new Stack();
		s3.add(null);
		s3.add(null);
		s3.add(null);
		s3.add(null);
		s3.add(null);
		s3.add("Arunendra");
		s3.add("Dheeru");
		s3.add('C');
		
		Iterator i3=s3.iterator();
		while(i3.hasNext()) {
			System.out.println(i3.next());
		}
		
		List l=new ArrayList();
		l.add(34);
		l.add(32);
		l.add(52);
		l.add(82);
		l.add(35);
		
		ListIterator li=l.listIterator();
		while(li.hasNext()) {
			System.out.println(li.nextIndex()+"-"+li.next());	
		}
		
		System.out.println("Collection to ArrayList");
		Collection c=new LinkedList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		c.add("a");
		ArrayList a=new ArrayList(c);
		Iterator i8=a.iterator();
		while(i8.hasNext()) {
			System.out.println(i8.next());
		}
		a.remove("a");
		i8=a.iterator();
		while(i8.hasNext()) {
			System.out.println(i8.next());
		}
		
		System.out.println("Stack");
		Stack st=new Stack();
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		System.out.println(st.push(2));
		System.out.println(st.push(4));
		System.out.println(st.push(6));
		System.out.println(st.push(1));
		System.out.println(st.pop());
		System.out.println(st.pop());
		System.out.println(st.peek());
		
		System.out.println("HashSet");
		Set ss=new HashSet();
		ss.add(null);
		ss.add(null);
		ss.add("Arunendra");
		ss.add("Arunendra");
		ss.add("Dheeru");
		
		Iterator ii=ss.iterator();
		while(ii.hasNext()) {
			System.out.println(ii.next());
		}
		
		System.out.println("LinkedHashSet");
		Set ss1=new LinkedHashSet();
		ss1.add(null);
		ss1.add(null);
		ss1.add("Arunendra");
		ss1.add("Arunendra");
		ss1.add("Dheeru");
		
		Iterator ii1=ss1.iterator();
		while(ii1.hasNext()) {
			System.out.println(ii1.next());
		}
		
		TreeSet stt=new TreeSet(new MyComparator());
		
		stt.add(5);
		stt.add(8);
		stt.add(9);
		stt.add(1);
		stt.add(4);
		Iterator itr=stt.iterator();
		while(itr.hasNext()) {
		   System.out.println(itr.next());	
		}
		ArrayList al=new ArrayList();
		HashMap hm=new HashMap();
		LinkedList ll=new LinkedList();
		List ll1=Collections.synchronizedList(ll);
		Map m=Collections.synchronizedMap(hm);
		List ll2=Collections.synchronizedList(al);
		
		System.out.println("Queue");
		Queue q=new LinkedList();
		q.add("Arunendra");
		q.add("Dheeru");
		q.add("Prakash");
		q.add("Dubey");
		q.add("Okay");
		
		Iterator i23=q.iterator();
		while(i23.hasNext()) {
			System.out.println(i23.next());
		}
		
		q.remove();
		q.poll();
		i23=q.iterator();
	    while(i23.hasNext()) {
			System.out.println(i23.next());
	    }
		System.out.println(q.peek());
		
		System.out.println("Map");
		Map hm1=new HashMap();
		hm1.put(1,"Arunendra");
		hm1.put(2,"Dheeru");
		hm1.put(3,"Praksh");
		System.out.println(hm1.get(1));
		Set s9=hm1.keySet();
		Iterator itr2=s9.iterator();
		while(itr2.hasNext()) {
			System.out.println(hm1.get(itr2.next()));
		}
		hm1.put(2,"New Value");
		itr2=s9.iterator();
		while(itr2.hasNext()) {
			System.out.println(hm1.get(itr2.next()));
		}
		
		ArrayList all=new ArrayList();
		all.add("All");
		all.add("cc");
		all.add("cc");
		System.out.println(all.hashCode());
		System.out.println(all.getClass().getName());
		
	}
	
	
}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		
		if(i2>i1) {
			return +1;
		} else if(i2<i1) {
			return -1;
		} else {
			return 0;
		}
	}
}
