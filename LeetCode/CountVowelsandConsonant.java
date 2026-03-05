// Count Vowel and Consonant in a String. 
public class CountVowelsandConsonant {
    public static void main(String[] args) {
        String s = "Paridhi Chawhan";
        int vowelCount = 0;
        int consonantCount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else if (Character.isLetter(ch)) { // remember this method Character.isLetter 
                consonantCount++;
            }
        }
        System.out.println(vowelCount);
        System.out.println(consonantCount);
    }
}
