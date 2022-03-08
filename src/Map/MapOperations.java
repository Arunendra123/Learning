package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapOperations {
   public static void main(String arg[]) {
		/*
		 *                          Map
		 *                           |
		 *  -----------------------------------------------------------
		 *  |           |            |        |                       |
		 *  HashMap   TreeHashMap   EnumMap  LinkedHashMap   WeakHashMap
		 *  
		 */
	   
	   Map<String,Integer> map=new HashMap<String,Integer>();
	   Map<String,Integer> map1=new LinkedHashMap<String,Integer>();
	   map.put("one",1);
	   map.put("two",2);
	   map.put("three",3);
	   map.put("four",4);
	   
	   map.putIfAbsent("one",10);
	   System.out.println(map.containsKey("one"));
	   System.out.println(map.containsValue(2));
	   System.out.println(map.replace("one",1,20));
	   System.out.println(map.replace("one",1,10));
	   System.out.println(map.remove("one"));
	   System.out.println(map.remove("two",5));
	   System.out.println(map.get("three"));
	   
	   //KeySet
	   Set<String> keySet=map.keySet();
	   
	   //Values
	   Collection<Integer> values=map.values();

	   //EntrySet
	   Set<Entry<String, Integer>> entrySet=map.entrySet();
       for(Entry<String,Integer> e:entrySet) {
    	   System.out.println(e.getKey()+"="+e.getValue());
    	   System.out.println();
       }

	   System.out.println(map);
   }
}
