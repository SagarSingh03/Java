// Numbers***************************************************************
// Reverse a number

// public class Cognizant {
//     public static void main(String[] args) {
//         int num = 1234, reversed = 0;
//         while (num != 0) {
//             int digit = num % 10;
//             reversed = reversed * 10 + digit;
//             num /= 10;
//         }
//         System.out.println("Reversed Number: " + reversed);
//     }
// }

// Check palindrome (number) ***************************************************************
// public class Cognizant {
//     public static void main(String[] args) {
//         int num = 121, original = num, reversed = 0;
//         while (num != 0) {
//             int digit = num % 10;
//             reversed = reversed * 10 + digit;
//             num /= 10;
//         }
//         if (original == reversed)
//             System.out.println(original + "is a Palindrome");
//         else
//             System.out.println(original + "is not a palindrome");
//     }
// }

// Check Armstrong number (Common GenC question) *****************************************************
// public class Cognizant {
//     public static void main(String[] args) {
//         int num = 153, original = num, result = 0;
//         while (num != 0) {
//             int digit = num % 10;
//             result += digit * digit * digit;
//             num /= 10;
//         }
//         if (result == original)
//             System.out.println(original + " is an Armstrong number");
//         else
//             System.out.println(original + " is not");
//     }
// }

// Check prime number ****************************************************************************

// public class Cognizant {
//     public static void main(String[] args) {

//         int num = 29;
//         boolean isPrime = true;

//         if (num <= 1) {
//             isPrime = false;
//         } else {
//             for (int i = 2; i <= num / 2; i++) {
//                 if (num % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//         }

//         System.out.println(num + (isPrime ? " is Prime" : " is not Prime"));
//     }
// }

// Print prime numbers in a given range ****************************************************************
// public class Cognizant {
//     public static void main(String[] args) {
//         int start = 10, end = 50;
//         for (int i = start; i <= end; i++) {
//             if (i <= 1)
//                 continue;
//             boolean isPrime = true;
//             for (int j = 2; j <= i / 2; j++) {
//                 if (i % j == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if (isPrime)
//                 System.out.print(i + " ");
//         }
//     }
// }

// Find factorial (Prepare both iterative for loop and recursive methods)

// Fibonacci series up to N terms
// import java.util.*;
// public class Cognizant {
// public static void main(String[] args){
// int n = 10, first = 0, second = 1;
// System.out.println("Fibonacci Series: " + first + ", " + second);
// for (int i = 2; i < n; i++){
// int next = first + second;
// System.out.print(", " + next);
// first = second;
// second = next;
// }
// }
// }

// Sum of digits of a number

// public class Cognizant {
// public static void main(String[] args){
// int num = 567, sum = 0;
// while( num!= 0){
// sum += num % 10;
// num /= 10;
// }
// System.out.println("Sum : "+ sum);
// }
// }

// Swap two numbers (Try to learn the "without a third variable" trick)

// public class Cognizant {
// public static void main(String[] args){
// int a = 10, b = 20;
// a = a + b;
// b = a - b;
// a = a - b;
// System.out.println("a: "+ a + "b : " + b);
// }
// }

// Strings
// *************************************************************************
// Reverse a string*******************************************************

// Check palindrome (string)*******************************************************

// Count vowels and consonants in a string ****************************************************

// public class Cognizant {
//     public static void main(String[] args) {
//         String str = "Hello World";
//         int vCount = 0, cCount = 0;
//         str = str.toLowerCase();

//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch >= 'a' && ch <= 'z') {
//                 if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
//                     vCount++;
//                 else
//                     cCount++;
//             }
//         }
//         System.out.print("Vowels: " + vCount + ", Consonant: " + cCount);
//     }
// }

// Check if two Strings are Anagrams (e.g., "Keep" and "Peek").****************************************8

// import java.util.Arrays;

// public class Cognizant {
//     public static void main(String[] args) {

//         String s1 = "Keep", s2 = "Peek";
//         s1 = s1.toLowerCase();
//         s2 = s2.toLowerCase();

//         if (s1.length() == s2.length()) {

//             char[] charArray1 = s1.toCharArray();
//             char[] charArray2 = s2.toCharArray();

//             Arrays.sort(charArray1);
//             Arrays.sort(charArray2);

//             if (Arrays.equals(charArray1, charArray2))
//                 System.out.println("Anagrams");
//             else
//                 System.out.println("Not Anagrams");

//         } else {
//             System.out.println("Not Anagrams");
//         }
//     }
// }

// Find the Second Largest number in an array (without sorting).*******************************************************

// Find the Duplicate character in a string.*******************************************************

// Count occurrences of words in a sentence.*******************************************************

// Arrays / Lists
// ***********************************************************************
// Remove duplicates (from an Array or ArrayList)
// import java.util.*;

// public class Cognizant {
//     public static void main(String[] args) {

//         Integer[] arr = { 1, 2, 2, 3, 4, 4 };

//         Set<Integer> set = new HashSet<>(java.util.Arrays.asList(arr));
//         System.out.println(set);
//     }
// }

// Find largest element in an array******************************************************

// public class Cognizant {
//     public static void main(String[] args) {

//         int[] arr = {10, 50, 20, 90, 30};
//         int max = arr[0];

//         for (int i = 1; i < arr.length; i++) {
//             if (arr[i] > max)
//                 max = arr[i];
//         }

//         System.out.println("Largest: " + max);
//     }
// }



// Gemini Questions Pro :
// *********************************************************************

// Print a Pyramid Pattern of Stars.

// Calculate GCD of two numbers.

// Euclidean Algorithm (Recursive)
// public class Cognizant {

//     public static int gcd(int a, int b) {
//         if (b == 0)
//             return a;
//         return gcd(b, a % b);
//     }

//     public static void main(String[] args) {
//         int a = 36, b = 24;
//         System.out.println("GCD: " + gcd(a, b));
//     }
// }

// Usage: System.out.println(findGCD(48, 18)); // Output: 6

// Bubble Sort (Sort an array without using Arrays.sort()). *******************************************************
// import java.util.Arrays;

// public class Cognizant {
//     public static void main(String[] args) {

//         int[] arr = {64, 34, 25, 12, 22};
//         int n = arr.length;

//         for (int i = 0; i < n - 1; i++) {
//             for (int j = 0; j < n - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                 }
//             }
//         }

//         System.out.println(Arrays.toString(arr));
//     }
// }


// Find the "Nth term" of a series (e.g., 1, 4, 9, 16... find the 10th term).*******************************************************
// public class Cognizant {
//     public static void main(String[] args) {
//         int n = 10;
//         int nthTerm = n * n;
//         System.out.println("The " + n + "th term is: " + nthTerm);
//     }
// }


// Merge two arrays into a single array. *******************************************************
// import java.util.Arrays;

// public class Cognizant {
//     public static void main(String[] args) {

//         int[] a = {1, 2, 3};
//         int[] b = {4, 5, 6};
//         int[] result = new int[a.length + b.length];

//         // Copy first array
//         for (int i = 0; i < a.length; i++) {
//             result[i] = a[i];
//         }

//         // Copy second array
//         for (int i = 0; i < b.length; i++) {
//             result[a.length + i] = b[i];
//         }

//         System.out.println(Arrays.toString(result));
//     }
// }
