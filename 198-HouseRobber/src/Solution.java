class Solution {
    public int rob(int[] nums) {
        int one_before = 0, two_before = 0;

        for(int n : nums){
            int temp = Math.max(n+two_before, one_before);
            two_before = one_before;
            one_before = temp;
        }

        return one_before;
    }
}