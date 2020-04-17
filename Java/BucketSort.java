import java.util.Arrays;


public class BucketSort{



    public static void bucketSort(int[] array)
    {
        int max = array[0];
        int min = array[0];

        //Find the maximim and minimum integers in the array.
        for(int index = 0; index < array.length; index++)
        {
            if(array[index] > max)
                max = array[index];
            if(array[index] < min)
                min = array[index];
        }

        int[] buckets = new int[(max - min) + 1];
        
        //Initialize each bucket with the values of the array.
        for(int index = 0; index < array.length; index++)
        {
            buckets[array[index] - min]++;
        }
        
        int pointer = 0;

        //Dump the bucket values into the array.
        for(int index = 0; index < array.length; index++)
        {
            if(buckets[pointer] != 0)
            {
                array[index] = pointer + min;
                buckets[pointer]--;
            }
            else
            {
                index--;
                pointer++;
            }
        }
    }


    public static void main(String[] args) {
		
		int[] numbers = new int[]{2, 5, 7, 2, 4, 2, 8, 1, 0};
		int[] numbers1 = new int[]{8,7,6,5,4};
		int[] numbers2 = new int[]{2, 5, 7, 2, 4, 2, 8, 1, 0};
		bucketSort(numbers);
		bucketSort(numbers1);
		System.out.println(Arrays.toString(numbers));
		System.out.println(Arrays.toString(numbers1));
	   
	
	}









}