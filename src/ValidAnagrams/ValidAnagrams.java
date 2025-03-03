package ValidAnagrams;

import java.util.Arrays;

public class ValidAnagrams {

    public static boolean validAnagrams(String s, String t) {
        // split first and second words into arrays of characters
        String[] wordOneArray = s.split("");
        String[] wordTwoArray = t.split("");

        // sort the characters in the arrays
        Arrays.sort(wordOneArray);
        Arrays.sort(wordTwoArray);

        // join the characters into a string
        String sortedWordOne = String.join("", wordOneArray);
        String sortedWordTwo = String.join("", wordTwoArray);

        // compare the strings and return true if they are equal, otherwise return false

        if (sortedWordOne.equals(sortedWordTwo)) {
            return true;
        }

        return false; // return false if the strings are not equal
    }
}
