import java.util.Arrays;

public class MergeSort {

	public static void mergeSort(int[] arr){
		mergeSort(arr, new int[arr.length], 0 , arr.length -1);
	}


	public static void mergeSort(int[] arr, int[] temp, int leftStart, int rightEnd){
		if (leftStart >= rightEnd){
			return;
		}
		int middle = (leftStart + rightEnd) /2;
		mergeSort(arr, temp, leftStart, middle);
		mergeSort(arr, temp, middle + 1, rightEnd);
		mergeHalves(arr, temp, leftStart, rightEnd);		
	}

	public static void mergeHalves(int[] arr, int[] temp, int leftStart, int rightEnd){
		int leftEnd = (rightEnd + leftStart) / 2;
		int rightStart = leftEnd + 1;
		int size = rightEnd - leftStart + 1;

		int left = leftStart;
		int right = rightStart;
		int index = leftStart;

		while ( left <= leftEnd && right <= rightEnd){
			if (arr[left] <= arr[right]){
				temp[index] = arr[left];
				left++;

			}else{
				temp[index] = arr[right];
				right++;

			}
			index++;
		}

		System.arraycopy(arr, left, temp, index, leftEnd -left +1);
		System.arraycopy(arr, right, temp, index, rightEnd -right +1);
		System.arraycopy(temp, leftStart, arr, leftStart, size);
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