package Cache;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class Cache {
	public static void main(String args[]) {
		
	}
}

class LRUCache {
	
	private int capacity;
	private Deque<Integer> d;
	private HashMap<Integer,String> hm;
	
	LRUCache(int capacity){
		this.capacity=capacity;
		hm=new HashMap<Integer,String>();
		d=new LinkedList<Integer>();
	}
	
	public String getEle(int key) {
		if(hm.containsKey(key)) {
			d.remove(key);
			d.addFirst(key);
			return hm.get(key);
		}
		else {
			return "Not Exist";
		}
	}
	
	public void putEle(int key,String value) {
		   	if(hm.containsKey(key)) {
		   		d.remove(key);
		   		d.addFirst(key);
		   	} else {
		   		if(d.size()==capacity) {
		   			int i=d.removeLast();
		   			hm.remove(i);
		   		}
		   		d.addFirst(key);
		   		hm.put(key, value);
		   	}
	}
}