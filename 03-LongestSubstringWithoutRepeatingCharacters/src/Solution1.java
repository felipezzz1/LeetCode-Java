import java.util.ArrayList;
import java.util.List;

class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        if (s.isEmpty()) return 0;
        int l = 0, r = 0;
        int res = 1;
        List<Character> total = new ArrayList<>();

        while (r < s.length()) {
            if (!total.contains(s.charAt(r))) {
                total.add(s.charAt(r));
                r++;
            } else {
                l++;
                total.removeFirst();
            }
            res = Math.max(res, total.size());
        }

        return res;
    }
}