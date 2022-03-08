package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Graph1 {
   public LinkedList<Integer> adj[];
   Graph1(int v){
	   adj=new LinkedList[v];
	   for(int i=0;i<adj.length;i++) {
		   adj[i]=new LinkedList<Integer>();
	   }
   }
   
   public void add(int s,int d) {
	   adj[s].add(d);
	   adj[d].add(s);
   }
  
   public int BFS(int s,int d) {
	   boolean vis[]=new boolean[adj.length];
	   Queue q=new LinkedList();
	   int par[]=new int[adj.length];
	   
	   vis[s]=true;
	   q.add(s);
	   par[s]=-1;
	   
	   while(!q.isEmpty()) {
		   int cur=(int) q.poll();
		   if(cur==d) break;
		   
		   for(int v:adj[cur]) {
			   if(!vis[v]) {
				   q.add(v);
				   vis[v]=true;
				   par[v]=cur;
			   }
		   }
	   }
	   
	   int cur=d;
	   int dis=0;
	   while(par[cur]!=-1) {
		   System.out.println(cur+"-->"+par[cur]);
		   cur=par[cur];
		   dis++;
	   }
	   return dis;
   }
   
   
   
   public static void main(String args[]) {
	   Graph1 graph=new Graph1(5);
	   graph.add(0,2);
	   graph.add(0,1);
	   graph.add(0,3);
	   graph.add(2,3);
	   graph.add(1,3);
	   graph.add(3,4);
	   graph.add(1,4);
	   
	   graph.BFS(0, 4); 
   }
}
