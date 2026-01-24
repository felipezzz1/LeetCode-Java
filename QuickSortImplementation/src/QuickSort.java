public class QuickSort {

    public void quickSort(int[] arr) {
        quickSortRecursive(arr, 0, arr.length -1);
    }

    public void quickSortRecursive(int[] arr, int low, int high) {
        if (low < high) {
            var pi = partition(arr, low, high);
            quickSortRecursive(arr, low, pi-1);
            quickSortRecursive(arr, pi+1, high);
        }
    }

    public int partition(int[] arr, int low, int high){
        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int aux = arr[i];
                arr[i] = arr[j];
                arr[j] = aux;
            }
        }
        int aux = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = aux;

        return i + 1;
    }
}
