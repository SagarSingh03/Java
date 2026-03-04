import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        // 1st String
        String s = "arjun";
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String sortedString = new String(arr);
        System.out.println(sortedString);

        // 2nd String
        String t = "junar";
        char[] array = t.toCharArray();
        Arrays.sort(array);
        String sortString = new String(array);
        System.out.println(sortString);

        if (Arrays.equals(arr, array)) { // Arrays.equals() compares element by element
            System.out.print("String are sorted and they are anagram");
        } else {
            System.out.print("Strings are not sorted and they are not anagrams");
        }

    }
}
