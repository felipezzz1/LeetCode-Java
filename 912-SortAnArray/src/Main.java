import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int[] arr = new int[]{5,2,3,1};

        int[] arr1 = new int[]{5,1,1,2,0,0};

        System.out.println(Arrays.toString(solution.sortArray(arr)));
        System.out.println(Arrays.toString(solution.sortArray(arr1)));


    }
}