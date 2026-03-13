// public class Strings {
//     public static void main(String[] args) {
//         String name = "Tony"; // this is strings
//         String fullName = "Tony Stark";
//         String sentence = "My name is Tony Stark";
//         System.out.println(name + " " + fullName + "@" + sentence); // here is showns how all the strings are
//                                                                     // concatenated together.
//         System.out.println(sentence.length());

//         // charAt
//         for (int i = 0; i < fullName.length(); i++) {
//             System.out.println(fullName.charAt(i));
//         }
//     }
// }


// here We are taking Strings i/p from the user.********************************************************
// import java.util.*;

// public class Strings {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         // String name = sc.next(); // here sc.next will print only the first word of
//         // the sentence.
//         String name = sc.nextLine(); // this sc.nextLine will print all the wordsinfact it can print the entire
//                                      // sentence also.
//         System.out.println("Print Your name is: " + name);
//     }
// }

// Comparing Two Strings
// ****************************************************************
// import java.util.*;

// public class Strings {
//     public static void main(String[] args) {
//         String name1 = "Sagar";
//         String name2 = "Sagar";
//         if (name1.compareTo(name2) == 0) { // this comapreTo function compares the strings in two ways :
//             System.out.println("Strings are equal"); // 1.String1 > String2 = +ve // here if it greater then it will
//             // give +ve value.
//         } else {
//             System.out.println("Strings are not equal");
//         } // 2.String1 == String2 = 0 // if equal then it will give 0 value.
//           // 3.String1 < String2 = -ve // if equal then it will give -ve value
//     }
// }

// Comapring with == two
// Strings***********************************************************

// import java.util.*;

// public class Strings {
//     public static void main(String[] args) {
//         String name1 = "Sagar";
//         String name2 = "Sagar";
//         if (name1 == name2) { // here we are using == but many times it is going tofail and in competition
//                               // some test cases will not run due
//             // to this. so never use the == operator use compareto() function.
//             System.out.println("Strings are equal");
//         } else {
//             System.out.println("Strings are not equal");
//         }
//     }
// }

// Substring ***************************** Substrings means finding the smaller
// part of the big part.

// import java.util.*;

// public class Strings {
//     public static void main(String args[]) {
//         String sentence = "My name is Adi shankrachrya";
//         String name = sentence.substring(11, sentence.length());
//         System.out.println(name);
//     }
// }

// Another way of finding the
// strings***********************************************************
// import java.util.*;

// public class Strings {
//     public static void main(String args[]) {
//         String sentence = "SagarSingh";
//         String name = sentence.substring(5);
//         System.out.println(name);
//     }
// }

// Strings are immutable next lectures. very important.