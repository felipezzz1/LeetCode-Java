public class Solution {
    public void sortColors(int[] nums) {
        quickSort(nums, 0, nums.length-1);
    }

    public void quickSort(int[] nums, int low, int high) {
        if(low < high){
            var pi = partition(nums, low, high);
            quickSort(nums, low, pi-1);
            quickSort(nums, pi+1, high);
        }
    }

    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if(arr[j] <= pivot) {
                i++;
                int aux = arr[i];
                arr[i] = arr[j];
                arr[j] = aux;
            }
        }
        int aux = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = aux;

        return i+1;
    }
}
