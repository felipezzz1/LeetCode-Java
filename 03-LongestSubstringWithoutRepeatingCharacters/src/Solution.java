import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_length = 0, left = 0;

        HashMap<Character, Integer> last_seen = new HashMap<>();

        for(int right = 0; right < s.length(); right++){
            char c = s.charAt(right);
            if(last_seen.get(c) != null && last_seen.get(c) >= left){
                left = last_seen.get(c) + 1;
            }

            max_length = Math.max(max_length, right-left+1);
            last_seen.put(c, right);
        }

        return max_length;
    }
}