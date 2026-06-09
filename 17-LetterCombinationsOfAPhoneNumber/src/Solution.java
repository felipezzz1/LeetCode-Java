import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
    private HashMap<Character, String> phoneDic = new HashMap<>();
    private List<String> res = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.isEmpty()){
            return new ArrayList<>();
        }

        phoneDic.put('2', "abc");
        phoneDic.put('3', "def");
        phoneDic.put('4', "ghi");
        phoneDic.put('5', "jkl");
        phoneDic.put('6', "mno");
        phoneDic.put('7', "pqrs");
        phoneDic.put('8', "tuv");
        phoneDic.put('9', "wxyz");

        bt("", digits);
        return res;
    }

    private void bt(String permutation, String digits){
        if(digits.isEmpty()){
            res.add(permutation);
            return;
        }
        String letters = phoneDic.get(digits.charAt(0));

        for(char letter:letters.toCharArray()){
            bt(permutation+letter, digits.substring(1));
        }
    }
}