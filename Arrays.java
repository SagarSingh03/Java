<<<<<<< HEAD
// import java.util.*;
// public class Arrays {
//         public static void main(String[] args){
//             // int[] marks = new int[3]; // both are valid syntax  
//             // int marks[] = new int[3];
//             // marks[0] = 97; // phy
//             // marks[1] = 98; // chem
//             // marks[2] = 99; // maths

//             int marks[] = {97,98,99,100}; // this is also one way to define an array. 

//             // System.out.println(marks); // This will give us a Jargon value. This will not print right value of the array. 
//             // System.out.println(marks[0]); // This will print the right value of the arrays
//             // System.out.println(marks[1]); // but this is not the best method to print the array values we should use loops for that
//             // System.out.println(marks[2]);
//             for (int i = 0; i < 3; i++){
//                 System.out.println(marks[i]);
//             }
//         }
// }

// here we are taking i/p from the user and then defining the arrays.  ********************************************
// import java.util.*;

// public class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt(); // this is taking size of the i/p from user
//         int numbers[] = new int[size];

//         // input
//         for (int i = 0; i < size; i++) { // this is taking i/p from the user
//             numbers[i] = sc.nextInt();
//         }

//         // output
//         for (int i = 0; i < size; i++) { // this is giving the size of the array 
//             System.out.println(numbers[i]);
//         }

//     }
// }

// Take an array as i/p from the user. Search for a given number x and print the index at which it occurs. *******************************************

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt(); // this is for what element we are finding in the array

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("x found at index: " + i);
            }
        }
    }
=======
// import java.util.*;
// public class Arrays {
//         public static void main(String[] args){
//             // int[] marks = new int[3]; // both are valid syntax  
//             // int marks[] = new int[3];
//             // marks[0] = 97; // phy
//             // marks[1] = 98; // chem
//             // marks[2] = 99; // maths

//             int marks[] = {97,98,99,100}; // this is also one way to define an array. 

//             // System.out.println(marks); // This will give us a Jargon value. This will not print right value of the array. 
//             // System.out.println(marks[0]); // This will print the right value of the arrays
//             // System.out.println(marks[1]); // but this is not the best method to print the array values we should use loops for that
//             // System.out.println(marks[2]);
//             for (int i = 0; i < 3; i++){
//                 System.out.println(marks[i]);
//             }
//         }
// }

// here we are taking i/p from the user and then defining the arrays.  ********************************************
// import java.util.*;

// public class Arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt(); // this is taking size of the i/p from user
//         int numbers[] = new int[size];

//         // input
//         for (int i = 0; i < size; i++) { // this is taking i/p from the user
//             numbers[i] = sc.nextInt();
//         }

//         // output
//         for (int i = 0; i < size; i++) { // this is giving the size of the array 
//             System.out.println(numbers[i]);
//         }

//     }
// }

// Take an array as i/p from the user. Search for a given number x and print the index at which it occurs. *******************************************

import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt(); // this is for what element we are finding in the array

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == x) {
                System.out.println("x found at index: " + i);
            }
        }
    }
>>>>>>> 21d3f24a8c0dda2c245534bb65054c721a5b75d3
}