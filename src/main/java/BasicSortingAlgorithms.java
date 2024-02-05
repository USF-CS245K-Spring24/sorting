import java.util.Arrays;

public class BasicSortingAlgorithms {

    public static void swap(int ind1, int ind2, int[] arr) {
        int tmp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = tmp;
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int indexOfMin = i;
            //search for min from index = i to length - 1
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[indexOfMin])
                    indexOfMin = j;
            }
            swap(indexOfMin, i, arr);
        }
    }

    public static void bubbleSort(int[] arr) {
        for (int pos = 0; pos < arr.length - 1; pos++) {
            // start at the end and go to pos,
            // bubble the smallest element to the top
            for (int j = arr.length - 1; j > pos; j--) {
                if (arr[j] < arr[j-1]) {
                    swap(j, j-1, arr);
                }
            }
        }
    }

    public static void insertionSort(int[] arr) {
        int curr;
        int j;
        for (int i = 1; i < arr.length; i++) {
            curr = arr[i];      // insert curr into the sorted part of the list
            j = i - 1;  // last element in the sorted part
            while ((j >= 0) && (curr < arr[j])) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = {17, 10, 15, 13, 4, 12, 7, 9, 16, 8, 5, 14, 3};
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        // bubbleSort(arr);
        // insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
