// Java program for implementation of Insertion Sort 
class InsertionSortPractice { 
	/*Function to sort array using insertion sort*/
	void sort(int arr[]) 




	
	{ 
	
	} 

	/* A utility function to print array of size n*/
	static void printArray(int arr[]) 
	{ 
		int n = arr.length; 
		for (int i = 0; i < n; ++i) 
			System.out.print(arr[i] + " "); 

		System.out.println(); 
	} 

	// Driver method 
	public static void main(String args[]) 
	{ 
		int arr[] = { 12, 11, 13, 5, 6 }; 

		InsertionSort ob = new InsertionSort(); 
		ob.sort(arr); 

		printArray(arr); 
	} 
} /* This code is contributed by Rajat Mishra. */
