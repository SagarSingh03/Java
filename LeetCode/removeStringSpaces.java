// This Question is from the leetcode and here I have to reverse a string and also remove the extra space from the string.
// To remove the extra space we will do : 

// Using String.replaceAll()
// The replaceAll() method is the most common and efficient way to handle this. It uses regular expressions to find all occurrences of one or more whitespace characters and replaces them with a single space. 

// \\s: This regex metacharacter matches a single whitespace character (which includes spaces, tabs, and newline characters).

// +: This qualifier indicates that the preceding element (\\s) must occur one or more times.

// " ": This is the replacement string (a single space). 

// This is the code for where we are removing spaces from the string but it does not remove first space of string.

// public class Removespace {
//     public static void main(String[] args) {
//         String text = " Hello    hi  how do  you  do\ttabs.";
//         String result = text.replaceAll("\\s+", " ");
//         System.out.println("Original String: \" " + text + "\"");
//         System.out.println("Modified String: \"" + result + "\"");
//     }
// }

// Code to remove space from the string and it removes first space of the string as well. 

// To ensure that the resulting string also has no leading or trailing spaces, you can chain the trim() method (or strip() in Java 11+): 
public class removeStringSpaces {
    public static void main(String[] args) {
        String Text = "   Hello   hi   how are you   ";
        String result = Text.trim().replaceAll("\\s+", " ");
        System.out.println("Original String: \"" + Text + "\"");
        System.out.println("Modified String: \"" + result + "\"");
    }
}