import java.util.Arrays;

public class SortingExercise {

    public static void swap(int ind1, int ind2, int[] arr) {
        int tmp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = tmp;
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int indexOfMin = i;
            // FILL IN CODE
            //search for min from index = i to length - 1,

            // swap it with the element at index i

        }
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int pos = 0; pos < n - 1; pos++) {
            // start at the end and go to pos, comparing neighboring elements
            // and swapping them as needed
            // This will bubble the smallest element to the top
            // FILL IN CODE
        }
    }

    public static void insertionSort(int[] arr) {
        int curr;
        int j;
        for (int i = 1; i < arr.length; i++) { // iterates over unsorted part of the list
            curr = arr[i];      // insert curr into the sorted part of the list
            j = i - 1;  // last element in the sorted part
            // FILL IN CODE

        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 10, 6, 1, 8};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        // bubbleSort(arr);
        //insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
