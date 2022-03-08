package Graph;

import java.util.LinkedList;

public class Graph {
	   public LinkedList<Integer> adj[];
	   public int v;
       public Graph(int v) {
    	   this.v=v;
    	   adj=new LinkedList[v];
    	   for(int i=0;i<adj.length;i++) {
    		   adj[i]=new LinkedList<Integer>();
    	   }
       }
       
       public void add(int source,int destination) {
    	   adj[source].add(destination);
    	   adj[destination].add(source);
       }
       
      /* 1,3,4,5
       2,4,5
       4,3,1*/
       public static void main(String args[]) {
    	   Graph graph=new Graph(6);
    	   graph.add(1,3);
    	   graph.add(1,4);
    	   graph.add(1,5);
    	   graph.add(2,4);
    	   graph.add(2,5);
    	   graph.add(4,3);
    	   graph.add(4,1);
       }
}
