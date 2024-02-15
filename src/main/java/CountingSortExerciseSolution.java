import java.util.Arrays;

public class CountingSortExerciseSolution {
    /**
     * @param arr input array
     * Assume the range of elements  in the array is from 0 to maxValue
     * @param maxValue the largest value that we can have in the array
     * Note: this is not how the counting sort is typically implemented!
     */
    public static void basicCountingSort(int[] arr, int maxValue) {
        int[] counterArray = new int[maxValue + 1];
        // Iterate over arr, and for each val = arr[i], increment counterArray[val].
        for (int i = 0; i < arr.length; i++) {
            int elem =  arr[i];
            counterArray[elem]++;
        }
        System.out.println(Arrays.toString(counterArray));
        // Iterate over the counter array, and use it to sort arr
        int j = 0;
        int k = 0; // index that keeps track of where we are at in the arr
        while (j < counterArray.length) {
            int frequency = counterArray[j];
            for (int l = 0; l < frequency; l++) {
                arr[k] = j;
                k++;
            }
            j++;
        }

    }

    public static void main(String[] args) {
        int[] arr = {6, 9, 1, 5, 9, 0, 1, 9, 6, 4};
        basicCountingSort(arr, 9);
        System.out.println(Arrays.toString(arr));

    }

}
