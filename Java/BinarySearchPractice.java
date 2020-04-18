// Java implementation of recursive Binary Search 
class BinarySearchPractice { 
	// Returns index of x if it is present in arr[l.. 
	// r], else return -1 

	// l is left start 
    // r is right start
    // x is number to search for



	int binarySearch(int arr[], int l, int r, int x) 
	{ 
	
		return -1; 
	} 

	// Driver method to test above 
	public static void main(String args[]) 
	{ 
		BinarySearch ob = new BinarySearch(); 
		int arr[] = { 2, 3, 4, 10, 40 }; 
		int n = arr.length; 
		int x = 10; 
		int result = ob.binarySearch(arr, 0, n - 1, x); 
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at index " + result); 
	} 
} 
/* This code is contributed by Rajat Mishra */
