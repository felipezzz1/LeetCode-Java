public class Implementation {
    public int binarySearch(int[] nums, int n){
        int lo = 0;
        int hi = nums.length;
        int steps = 0;

        while (lo < hi){
            steps += 1;
            int mid = (lo+(hi-lo)/2);

            if (nums[mid] == n){
                System.out.println("steps: " + steps);
                return mid;
            } else if (nums[mid] < n) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return -1;
    }
}
