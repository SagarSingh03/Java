// Strings 
// **********************************************************************
// public class Chapter3{
//     public static void main(String[] args) {
//         String name = "Sagar"; 
//         int value = name.length();                    //1.) length() method
//         System.out.print(value);
//     }
// }

// **********************************************************************
// public class Chapter3{
//     public static void main(String[] args) {
//         String name = "SAGAR";
//         String value = name.toLowerCase();            // 2.) toLowerCase() method
//         System.out.print(value);
//     }
// }

// ***********************************************************************

// public class Chapter3{
//     public static void main(String[] args){
//         String name = "sagar";
//         String value = name.toUpperCase();             // 3.) toUpperCase() method
//         System.out.print(value);
//     }
// }

// ************************************************************************

// public class Chapter3{
//     public static void main(String[] args) {
//         String name = "  Sagar  Singh   ";
//         String value = name.trim();   // 4.) Trim method it removes extra space from start and end
//         System.out.print(value);
//     }
// }

// ************************************************************************

// public class Chapter3{
//     public static void main(String[] args){
//         String name = "Sagar";
//         String value = name.substring(2); // 5.) substring method it removes 2 char from start
//         System.out.print(value);
//     }
// }

// *************************************************************************

// public class Chapter3{
//     public static void main(String[] args){
//         String name = "Sagar";
//         String value = name.substring(2, 3); // 6.) returns substring from start index to end index start is included and end is excluded
//         System.out.print(value);
//     }
// }

// ************************************************************************

// public class Chapter3{
//     public static void main(String[] args){
//         String name = "Sagar";
//         String value = name.replace('a', 'p'); // 7.) returns a new string after replacing r with p 
//         System.out.print(value);
//     }
// }

// ************************************************************************

// public class Chapter3{
//     public static void main(String[] args) {
//         String name = "Sagar";
//         boolean value = name.startsWith("Sa"); //8.) returns true if name starts with string. 
//         System.out.print(value);
//     }
// }

// *************************************************************************

// public class Chapter3{
//     public static void main(String[] args) {
//         String name = "Sagar";
//         boolean value = name.endsWith("a");  // 9.) returns true if name ends with string
//         System.out.print(value);        
//     }
// }

// ****************************************************************************

// public class Chapter3{
//     public static void main(String[] args) {
//         String name = "Sagar";
//         char value = name.charAt(2); // 10.) charAt shows the character at the index
//         System.out.print(value);        
//     }
// }

// ********************************************************************************

// public class Chapter3{
//     public static void main(String[] args){
//         String name = "Sagar";
//         int value = name.indexOf("g"); // 11.) indexOf tells the index value of the char
//         System.out.print(value);
//     }
// }

// *******************************************************************************

// public class Chapter3{
//     public static void main(String[] args){
//         String name = "Sagar";
//         int value = name.indexOf("S", 3);  // 12.) indexOf 
//         System.out.print(value);
//     }
// }

// *******************************************************************************

// public class Chapter3{
//     public static void main(String[] args){
//         String name = "Sagar";
//         int value = name.lastIndexOf("r"); //13.) lastIndexOf 
//         System.out.print(value);
//     }
// }

// ******************************************************************************

// public class Chapter3{
//     public static void main(String[] args){
//         String name = "Sagar";
//         int value = name.lastIndexOf("a", 1); // 14.) lastIndexOf 
//         System.out.print(value);
//     }
// }

// *******************************************************************************

// public class Chapter3{
//     public static void main(String[] args) {
//         String name = "Sagar";
//         boolean value = name.equals("Sagar"); //15.) returns true if the given string is equal to Sagar false otherwise [case sensitive]
//         System.out.print(value);       
//     }
// }

// *********************************************************************************

// public class Chapter3{
//     public static void main(String[] args){
//         String name = "Sagar";
//         boolean value = name.equalsIgnoreCase("Sagar"); //16.)  
//         System.out.print(value);
//     }
// }

// *********************************************************************************
// Write a Java Program to convert a string to lowerCase? 

// public class Chapter3{
//     public static void main(String[] args){
//         String s = "SAGAR";
//         String words = s.toLowerCase();
//         System.out.print(words);
//     }
// }

// ********************************************************************************
// Write a Java Program to replace spaces with underscores? 

// public class Chapter3 {
//     public static void main(String[] args) {
//         String s = "Sagar Singh Rajput";
//         String spaceRemoved = s.replace(" ", "_");
//         System.out.print(spaceRemoved);
//     }
// }

// ********************************************************************************
// Write a Java Program to fill in a letter template which looks like below :
// letter = "Dear <|name|> , Thanks a lot"
// Replace <|name|> with a String (some name)

// public class Chapter3 {
//     public static void main(String[] args) {
//         String letter = "Dear <|name|>, Thanks a lot";
//         String name = "Sagar";
//         letter = letter.replace("<|name|>", name);
//         System.out.println(letter);
//     }
// }

// ********************************************************************************
// Write a Java Program to detect double and type spaces in a String

// public class Chapter3{
//     public static void main(String[] args) {
//         String s = "Sagar Singh Rajput";
//         System.out.print(s.indexOf(" "));
//         System.out.print(s.indexOf("   "));
//     }
// }

// *********************************************************************************
// Write a Program to format the following letter using escape sequence
// character
// letter = "Dear Harry, This Java Course is Nice. Thanks"

public class Chapter3 {
    public static void main(String[] args) {
        String letter = "Dear Harry, \n\t\'This Java Course is Nice.\' Thanks";
        System.out.print(letter);
    }
}
