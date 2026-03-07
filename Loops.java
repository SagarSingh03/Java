// For loop
// public class Loops {
// public static void main(String[] args) {
// for (int i = 0; i < 15; i++) {
// System.out.println("Loop is printed multiple times" + i);
// }
// }
// }

// **************************************************************************

// public class Loops{
// public static void main(String[] args){
// for (int i = 0; i < 15; i++){
// System.out.println(i); // This we use to print the values from the loop.
// }
// }
// }

// Reverse the for Loop********************************************************

// public class Loops {
//     public static void main(String[] args){
//         for (int i = 17; i >= 1; i--){
//             System.out.println(i);
//         }
//     }
// }

// While Loop  **************************************************************************

// public class Loops {
// public static void main(String[] args){
// int i = 0;
// while (i < 10){
// System.out.println(i);
// i = i + 1;
// }
// }
// }

// Do While
// Loop***************************************************************************
// public class Loops {
// public static void main(String[] args) {
// int i = 1;
// do {
// System.out.println(i);
// i++;
// } while (i <= 15); // While loop : This loop will run atleast once whether
// condition is true or
// // false once it will run
// }
// }

// Print the sum of First n natural numbers. *******************************************************
// public class Loops {
//     public static void main(String[] args) {
//         int n = 4;
//         int sum = 0;
//         for (int i = 1; i <= n; i++) {
//             sum = sum + i;
//         }
//         System.out.println("Total sum of all the natural numbers are " + sum);
//     }
// }

// *************************************adding natural numbers by taking i/p from the user***********

// import java.util.*;
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for (int i = 0; i <= n; i++) {
//             sum = sum + i;
//         }
//         System.out.println("Total sum of all the natural numbers are : " + sum);
//     }
// }

// Print the sum of first n natural numbers (number taking by the user). ***************************************************
// import java.util.*;

// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for (int i = 0; i <= n; i++) {
//             sum = sum + i;
//         }
//         System.out.println("Total sum of all the natural numbers are " + sum);
//     }
// }

// Printing table of 3 using for loops. ***************************************************
// public class Loops {
//     public static void main(String[] args) {
//         int n = 3;
//         for (int i = 1; i < 11; i++) {
//             System.out.println("Table of " + n * i);
//         }
//     }
// }

// Solving Questions for For Loop Practice 
// Print the even numbers from 1 to 20

// public class Loops {
//     public static void main(String[] args){
//         for ( int i = 0; i <= 20; i++){
//             if ( i % 2 == 0){
//                 System.out.println(i + " Even numbers");
//             }
//             else {
//                 System.out.println(i + " Odd number");
//             }
//         }
//     }
// }

// Print the Table of 10 **************************************************

// 📌 Format specifiers:

// %s → String

// %d → int

// %f → float/double

// %c → char

// public class Loops {
//     public static void main(String[] args){
//         int num = 5;
//         for (int i = 1; i <= 10; i++){
//             System.out.printf("Table of %d : %d * %d = %d%n", num, num, i, num * i); // %d only works with printf, not println
//         }
//     }
// }

// Print the sum of all the numbers from 1 to N (N is user Input) : 

// import java.util.*;

// public class Loops{
//     public static void main(String[] args){ // here when u run this code JVM looks for this exact method this is standard signature
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int sum = 0;
//         for(int i = 0; i < n; i++){
//             sum = sum + i;
//         }
//         System.out.println("Sum of all the numbers : " + sum);
//     }
// }

// String[] args because when you run a program from the command line These values are passed as text Strings. JVM sends them to your 
// program like args[0] = "10" , args[1] = "20", args[2] = "30" 
// Everything comming from the command line is String by default, not int
// Why not int[] args becasue JVM only knows how to pass String[] not int[] , double[], char[] 
// JVM → delivers a packet of text Your program → converts it into int if needed

// *********************** Enhanced for loop in Java : It is used to Iterate through arrays or Collections only*****************
// for (datatype variable : array_or_collections) {
// }

public class Loops {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40 };
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
