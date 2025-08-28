import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        return set.size() != nums.length;
    }
}

// Faster
//class Solution{
//    public boolean containsDuplicate(int[] nums) {
//        HashSet<Integer> set = new HashSet<Integer>();
//        for (int i = 0; i < nums.length; i++) {
//            if(!set.add(nums[i])) return true;
//        }
//        return false;
//    }
//}