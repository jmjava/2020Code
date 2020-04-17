import java.util.Arrays;

class SelectionSort 
{ 
    public void sort(int[] numbers){

        for (int i =0; i < numbers.length -1 ; i++){
            int min_idx = i;
            for (int j = i + 1; j < numbers.length; j++ ){
                if (numbers[j] < numbers[min_idx]){
                    min_idx = j;
                }
            }

            int temp = numbers[min_idx];
            numbers[min_idx] = numbers[i];
            numbers[i] = temp;
        }




    }


public static void main(String[] args) {
    SelectionSort bubbleSort = new SelectionSort();
    int[] numbers = new int[]{2, 5, 7, 2, 4, 2, 8, 1, 0};
    int[] numbers1 = new int[]{8,7,6,5,4};
    int[] numbers2 = new int[]{2, 5, 7, 2, 4, 2, 8, 1, 0};
    bubbleSort.sort(numbers);
    bubbleSort.sort(numbers1);
    System.out.println(Arrays.toString(numbers));
    System.out.println(Arrays.toString(numbers1));
   
   

}

} 