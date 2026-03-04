
// Java me sorting alphabetical order (ASCII based) hota hai.
import java.util.Arrays;

public class SortingtheSentence {
    public static void main(String[] args) {
        String s = "Hello this is my Place";
        String[] words = s.split(" ");
        Arrays.sort(words , String.CASE_INSENSITIVE_ORDER);
        String sortedSentence = String.join(" ", words);
        System.out.println("Sorted Sentence : " + sortedSentence);
    }
}
