// class Pen { // this is how we create class and name of class starts from capital 
//     String Color;
//     String type;

//     public void write() {
//         System.out.println("Writing Something");
//     }

//     public void printColor() {
//         System.out.println(this.Color);
//     }

//     public void printType() {
//         System.out.println(this.type);
//     }
// }

// public class OOPS {
//     public static void main(String args[]) {
//         Pen pen1 = new Pen();
//         pen1.Color = "Blue Color";
//         pen1.type = "Gel Type";

//         Pen pen2 = new Pen();
//         pen2.Color = "Black Color";
//         pen2.type = "Ballpoint Type";

//         Pen pen3 = new Pen();
//         pen3.Color = "Pink Color";
//         pen3.type = "Marker Type";

//         pen1.printColor();
//         pen1.printType();
//         pen2.printColor();
//         pen2.printType();
//         pen3.printColor();
//         pen3.printType();
//     }
// }

// Another example we will take *****************************************************************************

class Student {
    int age;
    String name;

    public void printInfo() {
        System.out.println(this.age);
        System.out.println(this.name);
    }

    // Student() {
    // System.out.println("constructor called"); // constructor is made here and
    // this is normal constructor
    // }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class OOPS {
    public static void main(String args[]) {
        Student s1 = new Student("Mann Singh", 23); // new : memory heap kei andar ek jagah allocate ho jaayegi and
                                                    // inside that
        // place all the objects will get stored.
        // student(): is special type of functions and class aur constructor ka naame
        // same hote hai.

        // s1.name = "Sagar Singh"; // this is for normal constructor
        // s1.age = 23;
        s1.printInfo();
    }
}

// Java does not have destructors.
// Memory management in Java is done automatically by the Garbage Collector.
// Garbage Collector removes objects that are no longer in use. That's why we don't write Desctructors in Java because in Java there is garbage collector. 


