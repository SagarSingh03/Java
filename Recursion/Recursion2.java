// Tower of Hanoi *************************************************************
// public class Recursion2 {
//     public static void towerofHanoi(int n, String src, String helper, String dest) {
//         if (n == 1) {
//             System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
//             return;
//         }

//         towerofHanoi(n - 1, src, dest, helper);
//         System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
//         towerofHanoi(n - 1, helper, src, dest);
//     }

//     public static void main(String[] args) {
//         int n = 3;
//         towerofHanoi(n, "S", "H", "O");
//     }
// }

// Reverse a String *********************************************************

// public class Recursion2 {

//     public static void printRev(String str, int idx) {
//         if (idx == 0) {
//             System.out.print(str.charAt(idx));
//             return;
//         }
//         System.out.println(str.charAt(idx));
//         printRev(str, idx - 1);
//     }

//     public static void main(String[] args) {
//         String str = "abcd";
//         printRev(str, str.length() - 1);
//     }
// }

// First and Last occurrence of element ********************************************************

