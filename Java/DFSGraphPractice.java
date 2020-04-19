// Java program to print DFS traversal from a given given graph 
import java.io.*; 
import java.util.*; 
import java.util.LinkedList;

// This class represents a directed graph using adjacency list 
// representation 
class DFSGraphPractice 
{ 
	private int V; // No. of vertices 

	// Array of lists for Adjacency List Representation 
	private LinkedList<Integer> adj[]; 

	// Constructor 
	DFSGraphPractice(int v) 
	{ 
      // iniitialize the structure
	} 

	//Function to add an edge into the graph 
	void addEdge(int v, int w) 
	{ 
        // Add w to v's list. 
      
	} 

	// this is the recursive function
	void DFSUtil(int v,boolean visited[]) 
	{ 
      // make visited
      // get iterator for children
      // iterate over childern
      //   if not visited recurse (within the while)
    }
	// this intializes the recursive function
	void DFSGraphPractice(int v) 
	{ 
       //initialize the boolean
       //call the recursive func
    
	} 

	public static void main(String args[]) 
	{ 
        DFSGraphPractice g = new DFSGraphPractice(5); 
        	
        g.addEdge(3, 4);
        g.addEdge(0, 1); 
		g.addEdge(0, 2); 
		g.addEdge(1, 2); 
		g.addEdge(2, 0); 
		g.addEdge(2, 3); 
        g.addEdge(3, 3); 

		System.out.println("Following is Depth First Traversal "+ 
						"(starting from vertex 2)"); 

		g.DFSGraphPractice(2); 
	} 
} 
// This code is contributed by Aakash Hasija 
