class Solution {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int l = 0;
        int r = 0;

        while (r < s.length()){
            if (s.charAt(r) != ' ') {
                r++;
            } else {
                res.append(new StringBuilder(s.substring(l, r+1)).reverse());
                r++;
                l = r;
            }
        }
        res.append(' ');
        res.append(new StringBuilder(s.substring(l, r)).reverse());
        return res.substring(1);
    }
}