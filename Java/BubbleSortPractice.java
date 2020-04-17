import java.util.Arrays;

public class BubbleSort {


public void sort(int [] numbers){

    for (int i=0; i < numbers.length - 1; i++){
        for (int j=0; j < numbers.length -i -1; j++){
            if (numbers[j] > numbers[j + 1]){
                 swap(numbers, j, j +1);               
                
            }

        }

    }
}

public void swap (int[] arr, int i, int j){
   
    int temp = arr[j];
    arr[j] = arr[i];
    arr[i] = temp;


}

public static void main(String[] args) {
    BubbleSortPractice bubbleSort = new BubbleSortPractice();
    int[] numbers = new int[]{2, 5, 7, 2, 4, 2, 8, 1, 0};
    int[] numbers1 = new int[]{8,7,6,5,4};
    int[] numbers2 = new int[]{2, 5, 7, 2, 4, 2, 8, 1, 0};
    bubbleSort.sort(numbers);
    bubbleSort.sort(numbers1);
    System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.toString(numbers1));
   

}



}