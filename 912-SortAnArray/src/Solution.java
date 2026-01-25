import java.util.Random;

public class Solution {
    private final Random random = new Random();

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length-1);

        return nums;
    }

    public void quickSort(int[] arr, int low, int high){
        if (low >= high) return;

        int pivotIndex = low + random.nextInt(high - low + 1);
        int pivot = arr[pivotIndex];

        int lt = low, i = low, gt = high;

        while (i <= gt) {
            if(arr[i] < pivot) {
                swap(arr, lt++, i++);
            } else if (arr[i] > pivot) {
                swap(arr, i, gt--);
            }else{
                i++;
            }
        }

        quickSort(arr, low, lt-1);
        quickSort(arr, gt+1, high);
    }

    public void swap(int arr[], int i, int j){
        int aux = arr[i];
        arr[i] = arr[j];
        arr[j] = aux;
    }
}