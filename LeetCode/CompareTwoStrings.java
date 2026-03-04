// Comparing two Strings
// public class CompareTwoStrings {
//     public static void main(String[] args) {
//         String s = "Hello";
//         String t = "Hello";
//         if (s.equals(t)) {
//             System.out.print("Strings are same");
//         } else {
//             System.out.print("Strings are not same");
//         }
//     }
// }

// Comparing two Strings using (Upper / Lower) case. **********************

// public class CompareTwoStrings {
//     public static void main(String[] args) {
//         String s = "Sagar";
//         String t = "sagar";
//         if (s.equalsIgnoreCase(t)) {
//             System.out.println("Strings are equal");
//         } else {
//             System.out.println("Strings are not Equal");
//         }
//     }
// }

// public class compareTo() ****************************************

 // 0 => Both Strings are exactly equal 
 // Positive value > 0 : a is lexicographically greater than b 
 // Negative value < 0 : a is lexicographically smaller than b

public class CompareTwoStrings {
    public static void main(String[] args) {
        String s = "Sagar";
        String t = "Sagar";
        if (s.compareTo(t) == 0) {
            System.out.print("Equal");
        } 
    }
}

// Check if Strings Contain Something ************************************

// public class StringsContain {
// public static void main(String[] args) {
// String str = "Java Programming";
// if (str.contains("Java")) {
// System.out.print("Found");
// } else {
// System.out.print("Not found");
// }
// }
// }

// Check if Strings are Empty
// ****************************************************

// public class StringEmpty {
// public static void main(String[] args) {
// String s = "";
// if (s.isEmpty()) {
// System.out.print("String is Empty"); // If there is only space inside string
// then it's not empty
// } else {
// System.out.print("String is not Empty");
// }
// }
// }

// Check Specific Character in
// String*********************************************

// public class Specificharacter {
// public static void main(String[] args) {
// String s = "Sagapr";
// if (s.charAt(4) == 'p') {
// System.out.print("p alphabet is there");
// }
// }
// }