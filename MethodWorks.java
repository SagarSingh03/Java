// public class MethodWorks {
//     public static boolean isEven(int n) { // in java function is called method because it is always written inside class.
//         return n % 2 == 0; // this is a condition and it will return a value true or false
//     }

//     public static void main(String[] args) {
//         System.out.print(isEven(4));
//     }
// }

// Why we cannot run any code directly or why we have to run any code inside Static void main is because 
// Java executes codes only from the main() method Java needs a starting point for execution. 
// public static void main(String[] args) // this is the starting point. When you run a Java Program, the JVM says Start from the main(). 
// So we can use another way of taking variables also Examples are given below : 

//  here one more thing that i should take care of is method should match the return value 
// **************************************************************************************
// public class MethodWorks {
//     public static int isEven(int n) {
//         if (n % 2 == 0)
//             return 1;
//         else
//             return 0;
//     }

//     public static void main(String[] args) {
//         System.out.print(isEven(4));
//     }
// }

// ************************************************************************************

// public class MethodWorks {
//     public static String isEven(int n) {
//         if (n % 2 == 0)
//             return "Even";
//         else
//             return "Odd";
//     }

//     public static void main(String[] args) {
//         System.out.print(isEven(6));
//     }
// }

// ************************************************************************************
// void : void means “this method does NOT return any value” It only performs an action, that’s it. 
// void method is used you just want to do some work, you don't need a result back. Ex : Printing a Output 
// Updating an array , taking input, modifying object data
public class MethodWorks{
    public static void isEven(int n){
        if ( n % 2 == 0)
            System.out.println("Even");
        else 
            System.out.println("Odd");
    }
    public static void main(String[] args){
        // System.out.println(isEven(6));
        isEven(6);
    }
}

// Real difference of void method and returning method is void method : printed inside the method and returning metho 
// value returned but not used 

