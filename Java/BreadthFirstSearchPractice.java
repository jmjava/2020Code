// Java program to print BFS traversal from a given source vertex. 
// BFS(int s) traverses vertices reachable from s. 
import java.io.*; 
import java.util.*; 
import java.util.LinkedList;

// This class represents a directed graph using adjacency list 
// representation 
class BreadthFirstSearchPractice
{ 
	private int V; // No. of vertices 
	private LinkedList<Integer> adj[]; //Adjacency Lists 

	// Constructor 
	BreadthFirstSearchPractice(int v) 
	{ 

       // initialize the fields
    
	} 

	// Function to add an edge into the graph 
	void addEdge(int v,int w) 
	{ 

        // add m to list v
	
	} 

	// prints BFS traversal from a given source s 
	void BreadthFirstSearchPractice(int s) 
	{ 

	    // create the boolean visited
		// create the Linked List queue
		// add initial to queue
		// mark initial as visited
		// while loop
		//   pop from queue		
        //   iterate over children
        //        if not visited
        //              mark as visited
        //              add to queue
        
     


      }		
		
	

    // Driver method to 
    
	public static void main(String args[]) 
	{ 
		BreadthFirstSearchPractice g = new BreadthFirstSearchPractice(4); 

		g.addEdge(0, 1); 
		g.addEdge(0, 2); 
		g.addEdge(1, 2); 
		g.addEdge(2, 0); 
		g.addEdge(2, 3); 
		g.addEdge(3, 3); 

		System.out.println("Following is Breadth First Traversal "+ 
						"(starting from vertex 2)"); 

		g.BreadthFirstSearchPractice(2); 
	} 
} 
// This code is contributed by Aakash Hasija 
