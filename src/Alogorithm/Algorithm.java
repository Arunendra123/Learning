package Alogorithm;

import java.util.Arrays;
import java.util.LinkedList;

import Graph.Graph;

public class Algorithm {
	
	/*
	 * Binary Search Algorithm                      |
	 * Two pointer approach and two sum             | 
	 * Breadth First Search (BFS) Algorithm         | 
	 * Depth First Search (DFS) Algorithm           | 
	 * Inorder, Preorder, Postorder Tree Traversals | 
	 * Insertion Sort, Selection Sort, Merge        |
	 * Sort, Quicksort, Counting Sort, Heap Sort    | 
	 * Kruskal’s Algorithm                          | 
	 * Floyd Warshall Algorithm                     | 
	 * Dijkstra’s Algorithm                         | 
	 * Bellman Ford Algorithm                       | 
	 * Kadane’s Algorithm                           | 
	 * Lee Algorithm                                | 
	 * Flood Fill Algorithm                         | 
	 * Floyd’s Cycle Detection Algorithm            |
	 * Topological Sorting in a DAG                 | 
	 * Union Find Algorithm                         |
	 */

	// 1. Binary search
	public int binarySearch(int arr[], int l, int r, int n) {
		if (r >= l) {
			int m = r-(r+l) / 2;
			if (arr[m] == n)
				return m;
			if (n > arr[m])
				return binarySearch(arr, m + 1, r, n);
			return binarySearch(arr, l, m - 1, n);
		}
		return -1;
	}

	// 2. Two point approach (two sum)
	public boolean twoSum(int arr[], int sum) {
		int i = 0, j = arr.length - 1;
		while (i < j) {
			if (arr[i] + arr[j] < sum) {
				i++;
			} else if (arr[i] + arr[j] < sum) {
				j--;
			}else {
				return true;
			}
		}
		return false;
	}

	// 3. BFS
	public void bfs(Graph g, int s) {
		Boolean[] visited = new Boolean[g.v];
		LinkedList<Integer> que = new LinkedList<Integer>();
		que.add(s);
		visited[s] = true;
		while (que.isEmpty() != true) {
			s = que.poll();
			for (int n : g.adj[s]) {
				System.out.println(n + ",");
				if (visited[n] == false) {
					visited[n] = true;
					que.add(n);
					System.out.println(n);
				}
			}
			System.out.println("\n");
		}
	}
	
	//4. Kadane’s Algorithm
	public int maxContigousSum(int arr[]) {
		int max=Integer.MIN_VALUE;
		int cmax=0;
		for(int s:arr) {
			cmax=s+cmax;
			if(cmax>max) {
				max=cmax;
			} else if(cmax<=0){
				cmax=0;
			}
		}
		return max;
	}

	public static void main(String args[]) {
		
		// 1. binary Search
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Arrays.sort(arr);
		for (int x : arr) {
			System.out.print(x + "\t");
		}
		System.out.println();
		System.out.println(new Algorithm().binarySearch(arr, 0, arr.length - 1, 5));

		// 2. Two pointer Two sum
		System.out.println(new Algorithm().twoSum(arr, 7) == true);
		System.out.println(new Algorithm().twoSum(arr, 77) == true);

		// 3. bfs
		Graph graph = new Graph(6);
		graph.add(1, 3);
		graph.add(1, 4);
		graph.add(1, 5);
		graph.add(2, 4);
		graph.add(2, 5);
		graph.add(4, 3);
		// new Algorithm().bfs(graph, 1);
		
		//4. kadane's
		int ar[]= {-1,3,4,-5,8,-9,7,6,3};
		System.out.println(new Algorithm().maxContigousSum(ar));
	}
}
