// Append Characters to String to make Subsequence LeetCode : 2486 
// Subsequence : a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the 
// remaining elements
// delete any element but just characters should remain at their position and if it is not creating any it's fine. 

// append:  means to add data to the end of an existing sequence or file

public class AppendCharacters {
    public static void main(String[] args) {
        String s = "coaching", t = "coding";
        int i = 0,
                j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }
        System.out.print(t.length() - j);
    }
}
