import java.util.Stack;
import java.util.stream.Collectors;

class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<Character>();

        for(Character c: s.toCharArray()) {
            if(c == '*') {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.stream().map(Object::toString).collect(Collectors.joining(""));
    }
}