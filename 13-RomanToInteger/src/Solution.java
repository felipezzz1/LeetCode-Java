public class Solution {
    public int romanToInt(String s) {
        int[] roman = new int[26];
        roman['I' - 'A'] = 1;
        roman['V' - 'A'] = 5;
        roman['X' - 'A'] = 10;
        roman['L' - 'A'] = 50;
        roman['C' - 'A'] = 100;
        roman['D' - 'A'] = 500;
        roman['M' - 'A'] = 1000;

        int result = 0;
        int previous = 0;

        for( int i = s.length() - 1; i >= 0; i-- ) {
            int current = roman[s.charAt(i) - 'A'];
            result += (current < previous) ? - current : current;
            previous = current;
        }

        return result;
    }
}