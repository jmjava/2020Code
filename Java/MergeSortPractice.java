import java.util.Arrays;

public class MergeSortPractice {

	public static void mergeSort(int[] arr){
        // start the merge
        // pass in original, new temp, lefmost, rightmost
		
	}


	public static void mergeSort(int[] arr, int[] temp, int leftStart, int rightEnd){

        // check bounds outer ends
        // compute middle
        // sort left
        // sort right
        // mergeHalves outer bounds
		
	}

	public static void mergeHalves(int[] arr, int[] temp, int leftStart, int rightEnd){

        // leftEnd
        // rightStart
        // size

        // left
        // right
        // index

        // while in bounds 
            // left or right 
            // move to temp[index]
            // increment l or r
            // increment index

        // copy remaining from left and right (end - start  + 1)
        // copy from temp
          


    }
		

	public static void main(String[] args) {
		
		int[] numbers = new int[]{2, 5, 7, 2, 4, 2, 8, 1, 0};
		int[] numbers1 = new int[]{8,7,6,5,4};
		int[] numbers2 = new int[]{2, 5, 7, 2, 4, 2, 8, 1, 0};
		mergeSort(numbers);
		mergeSort(numbers1);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(numbers1));
	   
	
	}

}