import java.util.Arrays;

public class StudentTest {
    public static void selectionSort(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int indexOfMin = i;
            //search for min from index = i to length - 1
            for (int j = i; j < arr.length; j++) {
                if (arr[j].compareTo(arr[indexOfMin]) < 0)
                    indexOfMin = j;
            }
            swap(indexOfMin, i, arr);
        }
    }
    public static void swap(int ind1, int ind2, Student[] arr) {
        Student tmp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = tmp;
    }

    public static void main(String[] args) {
        Student st1 = new Student("Helen", 3);
        Student st2 = new Student("Allen", 1);
        /*int val = st1.compareTo(st2);
        System.out.println(val);
        if (val < 0) {
            System.out.println("Helen < Allen in terms of id");
        }
        else if (val == 0)
            System.out.println("Helen and Allen are equal in terms of id");
        else // val > 0
            System.out.println("Helen > Allen in terms of id"); */
        Student[] students = {
                new Student("Hao", 0),
                new Student("Kate", 5),
                new Student("Carlos", 6),
                new Student("Priya", 3),
                new Student("Joseph", 2),
        };
        selectionSort(students);
        System.out.println(Arrays.toString(students));
    }
}
