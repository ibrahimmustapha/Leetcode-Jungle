package HasDuplicate;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Duplicate {

    // check if the array has duplicate elements
    public static <T> boolean hasDuplicate(T[] array) {
        Arrays.sort(array);

        // loop through the array and compare each element with the next element
        for (int i = 0; i < array.length - 1; i++) {
            // check if the current element is equal to the next element
            if (array[i] == array[i + 1]) {
                return true; // return true if duplicates found
            }
        }

        return false; // return false if no duplicates found
    }

    public static void printDuplicateResults(boolean isDuplicate) {
        System.out.println(isDuplicate);
    }
}
