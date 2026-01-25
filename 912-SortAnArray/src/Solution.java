import java.util.Random;

public class Solution {
    private final Random random = new Random();

    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length-1);

        return nums;
    }

    public void quickSort(int[] nums, int low, int high){
        if(low < high) {
            int pi = partition(nums, low, high);
            quickSort(nums, low, pi-1);
            quickSort(nums, pi+1, high);
        }
    }

    private int randomizedPartition(int [] arr, int low, int high){
        int pivot = low + random.nextInt(high - low + 1);
        swap(arr, pivot, high);

        return partition(arr, low, high);
    }

    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for (int j = low; j < high; j++) {
            if(arr[j] <= pivot){
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);

        return i+1;
    }

    public void swap(int arr[], int i, int j){
        int aux = arr[i];
        arr[i] = arr[j];
        arr[j] = aux;
    }
}