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
        // Init the adj list and vectors
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++){
            adj[i] = new LinkedList();
        }
	
	} 

	// Function to add an edge into the graph 
	void addEdge(int v,int w) 
	{ 
        // from v add a link to w
        adj[v].add(w);
		
	} 

	// prints BFS traversal from a given source s 
	void BreadthFirstSearchPractice(int s) 
	{ 

        boolean visited[] = new boolean[V];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0 ){
            s = queue.poll();
            System.out.print(s + " ");

            // this is breadth first as all children for each node
            // added to the queue then 

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()){
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }

            }
        }


		
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
