// Conditionals in Java 

// What will be the output of this program : see the Pdf 

// public class Chapter4 {
//     public static void main(String[] args) {
//         int a = 10;
//         if (a == 11) {
//             System.out.println("I am 11");
//         } else {

//             System.out.println("I am not 11 I am 10");
//         }
//     }
// }

// *****************************************************************************************************
// Write a Program to findout whether a student is pass or fail; if it requires
// total 40 % and atleast 33% in each subject
// to pass assume 3 subjects and take marks as an input from the user.
// import java.util.*;

// public class Chapter4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter marks of subject 1");
//         float s1 = sc.nextFloat();

//         System.out.println("Enter marks of subject 2");
//         float s2 = sc.nextFloat();

//         System.out.println("Enter marks of subject 3");
//         float s3 = sc.nextFloat();

//         float totalpercentage = (s1 + s2 + s3) / 3;
//         if (totalpercentage >= 40 && s1 >= 33 && s2 >= 33 && s3 >= 33) {
//             System.out.println("Student is Pass");
//         } else {
//             System.out.print("Student is Fail");
//         }
//     }
// }

// *******************************************************************************************************
// Q3 See the Pdf Tax based question 
// import java.util.*;
// public class Chapter4{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter your income: ");
//         float income = sc.nextFloat();

//         float tax = 0;

//         if (income <= 250000){
//             tax = 0;
//         } else if (income <= 500000){
//             tax = income * 0.05f;
//         }
//         else if (income <= 1000000){
//             tax = income * 0.20f;
//         } else {
//             tax = income * 0.30f;
//         }
//         System.out.print("Total tax Paid = " + tax);
//     }
// }

// **********************************************************************************************************
// Write a Java Program to findout the day of the week given the number [ 1 for
// monday, 2 for tuesday ... and so on!]

// public class Chapter4 {
//     public static void main(String[] args) {
//         int day = 2;
//         if (day == 1) {
//             System.out.println("Monday");
//         } else if (day == 2) {
//             System.out.println("Tuesday");
//         } else if (day == 3) {
//             System.out.println("Wednesday");
//         } else if (day == 4) {
//             System.out.println("Thursday");
//         } else if (day == 5) {
//             System.out.println("Friday");
//         } else if (day == 6) {
//             System.out.println("Saturday");
//         } else if (day == 7) {
//             System.out.println("Sunday");
//         }
//     }
// }

// *********************************************************************************************************
// Write a Java program to find whether a year entered by the user is a leap year or not?
// import java.util.*;

// public class Chapter4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int year = sc.nextInt();

//         if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
//             System.out.println("It's a leap year");
//         } else {
//             System.out.println("It is not a leap year");
//         }
//     }
// }

// ***********************************************************************************************************
// Java Harry pdf