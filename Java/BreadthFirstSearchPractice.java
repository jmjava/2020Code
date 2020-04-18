// Java program to print BFS traversal from a given source vertex. 
// BFS(int s) traverses vertices reachable from s. 
import java.io.*; 
import java.util.*; 
import java.util.LinkedList;

// This class represents a directed graph using adjacency list 
// representation 
class BFSGraph 
{ 
	private int V; // No. of vertices 
	private LinkedList<Integer> adj[]; //Adjacency Lists 

	// Constructor 
	BFSGraph(int v) 
	{ 
	
	} 

	// Function to add an edge into the graph 
	void addEdge(int v,int w) 
	{ 
		
	} 

	// prints BFS traversal from a given source s 
	void BFS(int s) 
	{ 
		
	} 

	// Driver method to 
	public static void main(String args[]) 
	{ 
		BFSGraph g = new BFSGraph(4); 

		g.addEdge(0, 1); 
		g.addEdge(0, 2); 
		g.addEdge(1, 2); 
		g.addEdge(2, 0); 
		g.addEdge(2, 3); 
		g.addEdge(3, 3); 

		System.out.println("Following is Breadth First Traversal "+ 
						"(starting from vertex 2)"); 

		g.BFS(2); 
	} 
} 
// This code is contributed by Aakash Hasija 
