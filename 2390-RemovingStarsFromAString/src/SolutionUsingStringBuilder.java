public class SolutionUsingStringBuilder {

    //    Approach 1
    public String removeStars(String s) {
        StringBuilder c = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '*') {
                c.deleteCharAt(c.length() - 1);
            } else {
                c.append(s.charAt(i));
            }
        }

        return c.toString();
    }

    //    Approach 2 foreach
    public String removeStars2(String s) {
        StringBuilder sb = new StringBuilder();

        for (char ch: s.toCharArray()){
            if (ch != '*'){
                sb.append(ch);
            } else {
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        return sb.toString();
    }
}
