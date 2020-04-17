import java.util.Arrays;

public class SelectionSortPractice {

    public void sort(int[] numbers){

    }


public static void main(String[] args) {
    SelectionSortPractice bubbleSort = new SelectionSortPractice();
    int[] numbers = new int[]{2, 5, 7, 2, 4, 2, 8, 1, 0};
    int[] numbers1 = new int[]{8,7,6,5,4};
    int[] numbers2 = new int[]{2, 5, 7, 2, 4, 2, 8, 1, 0};
    bubbleSort.sort(numbers);
    bubbleSort.sort(numbers1);
    System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.toString(numbers1));
   
   

}

}