// Learning Patterns in Java : Here we will print 9 types of patterns here. 

// import java.util.Scanner;
// public class Patterns {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt(); // here we are taking i/p for the rows
//         int m = sc.nextInt(); // here we are taking i/p for the column

//         for (int i = 0; i < n; i++){
//             for (int j = 0; j < m; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Hollow Reactangle Pattern *********************************************
// import java.util.*;
// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = 4;
//         int m = 5;
//         // Outer loop
//         for (int i = 1; i <= n; i++) {
//             // Inner Loop
//             for (int j = 1; j <= m; j++) {
//                 if (i == 1 || j == 1 || i == n || j == m) {
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

// Half Pyramid Pattern***********************************************************
// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Half Pyramid Pattern reverse Order ****************************************************
// Outer Loop controls the number of loops i starts from number and goes up to 1.
// Inner Loop controls how many times the symbol will be(*, #, %) will be printed
// import java.util.*;

// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = 5;
//         // Outer Loop
//         for (int i = 5; i >= 1; i--) {
//             // Inner Loop
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Right Aligned Half Pyramid  ************************************************************

// import java.util.*;
// public class Patterns {
//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//         int n = 4;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             // Inner loop -> Star print
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//Print the numbers here ************************************************************************

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 5;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Inverted Half Pyramid with numbers ******************************************************************

// public class Patterns {
//     public static void main(String[] args) {
//         int n = 7;
//         for (int i = n; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// Print the floyd's Triangle ******************************************************************
// here we print the numbers by using their rows number of rows then number of elements gets printed. 
// public class Patterns {-
//     public static void main(String[] args) {
//         int n = 5;
//         int number = 1;
//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(number + " ");
//                 number++;
//             }
//             System.out.println();
//         }
//     }
// }

// 0 - 1 Traingle pattern *************************************************************************

public class Patterns {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}

// Program to print full pyramid using * 

// Check the TCS Sheet and solve coding qeustions from there. 