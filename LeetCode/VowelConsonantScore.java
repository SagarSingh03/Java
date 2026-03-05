// Leetcode : 3813 Vowel Consonant Score : here we need to show how many vowels are there per consonant
public class VowelConsonantScore {
    public static void main(String[] args) {
        String s = "samundar";
        int vowelCount = 0;
        int consonantScore = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i); // ch here stores the current character at index i. charAt(i) → gets the character at index i. 

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if (Character.isLetter(ch)) { // Character.isLetter() is a built-in method in Java. It belongs to the
                                                 // Character class. It checks whether a character is a letter or not.
                consonantScore++;
            }
        }
        int score = 0; // it just stores the final answer 
        if (consonantScore > 0) {
            score = vowelCount / consonantScore; // This checks if consonant exists or not
        }
        System.out.println(score);
    }
}