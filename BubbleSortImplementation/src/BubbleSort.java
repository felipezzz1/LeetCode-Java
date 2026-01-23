import java.util.Arrays;

public class BubbleSort {
    public int[] bubbleSort(int[] nums){
        int size = nums.length;

        for (int j = 0; j < nums.length; j++) {
            boolean isSorted = true;
            System.out.println(Arrays.toString(nums));
            for (int i = 0; i < size-1; i++) {
                if(nums[i] > nums[i+1]){
                    isSorted = false;
                    int aux = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = aux;
                }
            }
            if (isSorted == true) {
                return nums;
            }
        }
        return nums;
    }
}
