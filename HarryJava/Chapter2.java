// How will you write the following expressions in Java? 
// x - y /  2, b * b - 4ac / 2a , (v * v) - (u * u) , (a * b) - d  

// x - y / 2
// public class Chapter2 {
//     public static void main(String[] args) {
//         int x = 5;
//         int y = 10;
//         System.out.print(x - y / 2);
//     }
// }

// ***********************************************************

// b * b - 4ac / 2a
// public class Chapter2{
//     public static void main(String[] args) {
//         int b = 10;
//         int a = 2;
//         int c = 5;
//         System.out.print((b * b - 4*a * c) / (2 * a));
//     }
// }

// ********************************************************
// Try increment and decrement Operators on a Java Variable

// public class Chapter2{
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 20;
//         System.out.println(a++);
//         System.out.println(a--);
//         System.out.println(a = a + 10);
//         System.out.println(a = a - 2);
//         System.out.println("Now about the b");
//         System.out.println(--b);

//     }
// }

// *********************************************************

// What will be the value of the following expressions(x).
// int y = 7; int x = ++y * 8; value of x?

// public class Chapter2{
//     public static void main(String[] args) {
//         int y = 7;
//         int x = ++y * 8;
//         System.out.print(x);
//     }
// }


// What will be the result of the following expressions
// float a = 7 / 4 * 9 / 2

// public class Chapter2{
//     public static void main(String[] args) {
//         float a = 7 / 4 * 9 / 2;
//         System.out.print(a);        
//     }
// }


// Write a Java Program to encrypt a grade by adding 8 to it. Decrypt it to show
// the correct grade

// public class Chapter2{
//     public static void main(String[] args) {
//         char grade = 'A';

//         // Encrypting the grade
//         grade = (char)(grade + 8);
//         System.out.println("Encrypted Grade : " + grade);

//         // Decrypting the grade
//         grade = (char)(grade - 8);
//         System.out.println("Decrypted Grade: " + grade);

//     }
// }


// Use Comparison operators to find out whether a given number is greater than
// the user entered number or not
// import java.util.*;
// public class Chapter2{
//     public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         if (a > b){
//             System.out.print("a is greater");
//         } else if (a < b ) {
//             System.out.print("b is greater");
//         } else {
//             System.out.print("a and b are equal");
//         }
//     }
// }


// Write the following expression in a given program (v * v) - (u * u) / 2as.
// public class Chapter2{
//     public static void main(String[] args) {
//         int v = 5;
//         int u = 7;
//         int a = 3;
//         int s = 4;
//         int program = ((v * v) - (u * u)) / (2*a*s);
//         System.out.print(program);
//     }
// }



// Find the value of the following expression : int x = 7; int a = 7 * 49 / 7 + 35 / 7 value of a?

// public class Chapter2{
//     public static void main(String[] args){
//         int x = 7;
//         int a = 7 * 49 / 7 + 35 / 7;
//         System.out.print(a);
//     }
// }