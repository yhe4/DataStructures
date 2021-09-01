public class StringUtilities {

    /**
     * Method that determines if a string is a palindrome.
     *
     * The string is broken into pairs of letters symmetrically placed from its center. The pairs are compared to
     * determine if the letters are the same. If all pairs contain the same letters, the string is a palindrome.
     * For example "palindrome" is broken into the following pairs:
     *   p == e ... false
     *   a == m ... false
     *   l == o ... false
     *   i == r ... false
     *   n == d ... false
     * And the string "deed" is broken into the following pairs
     *   d == d ... true
     *   e == e ... true
     * And the string "racecar" is broken as follows
     *   r == r ... true
     *   a == a ... true
     *   c == c ... true
     * Notice that there is no pair containing the middle letter 'e' for strings with an odd number of letters.
     *
     * @param string String to test if it is palindrome
     * @return true if palindrome; false otherwise
     */
    static boolean isPalindrome(String string) {
        /* Assume that string is a palindrome */
        boolean result = true;
        /* Convert to lowercase, remove everything but letters */
        string = string.toLowerCase().replaceAll("[^a-z]","");
        /* Create a local variable with string length, for readability */
        int len = string.length();
        /* Check every pair of letters, from both sides of the string moving towards its center */
        for (int i = 0; i < len/2; i++) {
            /* Left letter of pair */
            char leftOfCenter = string.charAt(i);
            /* Right letter of pair. Remember that len-1 is the last letter of a string due to 0-based counting. */
            char rightOfCenter = string.charAt(len-1-i);
            /* Are pair letters the same? True if same, false otherwise.*/
            boolean pairSame = leftOfCenter == rightOfCenter;
            /*
            Update result. Remember AND operation's truth table:
                 p      q      p && q
                 false  false  false
                 false  true   false
                 true   false  false
                 true   true   true
             */
            result = result && pairSame;
        } // end for
        return result;
    } // method isPalindrome

}
