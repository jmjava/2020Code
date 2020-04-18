// Java implementation of recursive Binary Search 
class BinarySearchPractice2 { 
	// Returns index of x if it is present in arr[l.. 
	// r], else return -1 

    // l is left start 
    // r is right start
    // x is number to search for

	public static int binarySearch(int arr[], int l, int r, int x) 
	{ 
	     // if the bounds are still correct
         // the right it greater than l
         if (r >= l){

            // find the mid
            mid = l + (r - 1) / 2;
            // check for middle
            if (arr[mid] == x){
                return mid;
            }

            if (arr[mid] > x){
                return binarySearch(arr, mid + 1, r, x);
            }

            return binarySearch(arr, l, mid - 1, x)




         }

        // if we make it here nothing found
         return -1
		
	} 

	// Driver method to test above 

	public static void main(String args[]) 
	{ 
		
		int arr[] = { 2, 3, 4, 10, 40 }; 
		int n = arr.length; 
		int x = 10; 
		int result = binarySearch(arr, 0, n - 1, x); 
		if (result == -1) 
			System.out.println("Element not present"); 
		else
			System.out.println("Element found at index " + result); 
	} 
} 
/* This code is contributed by Rajat Mishra */
