import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();

        int[] arr = new int[]{10,7,8,9,1,5,2,0};

        System.out.println("Not Ordered Array: " + Arrays.toString(arr));

        quickSort.quickSort(arr);

        System.out.println("Ordered Array:" + Arrays.toString(arr));
    }
}