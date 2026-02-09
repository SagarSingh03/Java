// import java.util.*;
// public class StringsBuilder { // In Java Strings are Immutable. 
//       public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("Sagar");
//         System.out.println(sb); 

//         // char at index 0
//         System.out.println(sb.charAt(0));

//         // set char at Index
//         sb.setCharAt(0, 'P');
//         System.out.println(sb);

//         //Insert : these are the ways in which we can put the elements in a String
//         sb.insert(0, 'Z');
//         System.out.println(sb);

//         sb.insert(2, "X");
//         System.out.println(sb);

//         // Delete 
//         sb.delete(2,4);
//         System.out.println(sb);
//       }
// }

// String Builder *******************************************************************

// import java.util.*;
// public static void main(String[] args) {
//     StringBuilder sb = new StringBuilder("S");
//     sb.append("a");
//     sb.append("g");
//     sb.append("a");
//     sb.append("r");
//     System.out.println(sb.length()); // here we can print the length of the string
//     System.out.println(sb); // here we can print the exact string
// }

// Reverse a String *********************************** Practice it again and again solve on leetcode

// import java.util.*;
// public class StringsBuilder {
// public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("Sagar Singh");
//         for (int i = 0; i < sb.length() / 2; i++) {
//             int front = i;
//             int back = sb.length() - 1 - i;

//             char frontChar = sb.charAt(front);
//             char backChar = sb.charAt(back);

//             sb.setCharAt(front, backChar);
//             sb.setCharAt(back, frontChar);
//         }

//         System.out.println(sb);
//     }
// }