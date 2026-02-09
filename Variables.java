public class Variables{
    public static void main (String[] args){
        int a = 10;
        int b = 20; 
        int c = 18;
        int sum =  a + b + c;
        System.out.println("Sum of all the Int values are: " + sum);
        int simplification = a + b - c;
        System.out.println("Val of Simplification : " + simplification);
        
    }
}

// Here all the types of Data Types you should write. 
// In Java You cannot just write code floating in empty space like in python or C++ Everything your variables, Your function (methods)
//  and your logic must be wrapped inside a class.
/* Think of a Class like a House :  variables (furniture) must be inside the house. Methods (people doing things): must be inside the house
You cannot leave furniture on the street(outside the class) 
The Only exceptions (The 1%) There are only 3 things that sit above or outside the class : 1. Package Decalartion (telling java which folder 
the file is in).
2. Imports (Bringing in tools like Java.util.ArrayList). 3.Comments (Note to Yourself).

Other thing is class name and file name should be same if it is different then it will give error and won't even compile Java is designed 
this way so the compiler (and the Java Virtual Machine) can easily find the code it needs. When you tell Java to run a specific class, it
 looks for a file with that exact name to find the entry point.
*/