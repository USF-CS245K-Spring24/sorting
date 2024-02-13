import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int arr[], int low, int high) {
        int pivot;
        if (low < high) {
            pivot = partition(arr, low, high);
            System.out.println(Arrays.toString(arr));
            System.out.println("Used pivot " + arr[pivot]);
            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private static int partition(int arr[], int low, int high) {
        int pivot;
        int tmp;
        int max = high;
        int mid = (low + high) / 2;

        tmp = arr[mid];
        arr[mid] = arr[high];
        arr[high] = tmp;

        pivot = arr[high];
        while (low <= high) {
            while ((low <= high) && (arr[low] < pivot))
                low++;
            while ((low <= high) && (arr[high] >= pivot))
                high--;
            if (low <= high) {
                tmp = arr[low];
                arr[low] = arr[high];
                arr[high] = tmp;
                low++;
                high--;
            }
        }
        tmp = arr[low];
        arr[low] = arr[max];
        arr[max] = tmp;
        return low;
    }

    public static void quickSort(int arr[]) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr2 = {5, 9, 0, 1, 12, 6, 20, 4, 10, 3, 45};
        System.out.println(Arrays.toString(arr2));
        quickSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

}
