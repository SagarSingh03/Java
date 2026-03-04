
// In java String cannot be sorted directly , because in java Strings are immutable (cannot change) 
// for sorting convert string into array because array can be sorted string cannot
import java.util.Arrays;

public class SortingString{
    public static void main(String[] args) {
        String s = "shadow";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String sortedString = new String(arr);
        System.out.print("Sorted String " + sortedString); // All CAPITAL letters come before small letters when sorting.
    }
}

// toCharArray() → converts String to char[]

// Arrays.sort() → sorts array alphabetically

// new String(arr) → converts array back to String