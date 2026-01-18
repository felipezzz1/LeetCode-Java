import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maximumLengthSubstring(String s) {
        int l = 0, r = 0;
        int max = 1;

        Map<Character, Integer> counter = new HashMap<>();

        counter.put(s.charAt(0), 1);

        while (r < s.length() -1 ){
            r++;

            char c = s.charAt(r);

            if (counter.containsKey(c)){
                counter.put(c, counter.get(c) + 1);
            } else {
                counter.put(c, 1);
            }

            while (counter.get(c) == 3) {
                char lc = s.charAt(l);
                counter.put(lc, counter.get(lc) - 1);
                l++;
            }
            max = Math.max(max, r - l +1);
        }
        return max;
    }
}