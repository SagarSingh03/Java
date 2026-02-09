// Inheritance means one class gets properties and method of another class just like child gets qualities from parents. Inheritance increases the reusability. 
// Top most class is called base class and 2nd class is called sub class 

// class Shape {
//     String color;
// }

// class Triangle extends Shape {

// }

// public class Inheritance {
//     public static void main(String args[]){
//         Triangle t1 = new Triangle();
//         t1.color = "red";
//     }
// }

// ******************************************************************************************

// In Java There are 4 types of Inheritance are there :  Single Level Inheritance 

// Single level Inheritance : BaseClass -->  Derived class 

class Shape {
    public void area() {    
        System.out.println("Displays area");
    }
}

class Triangle extends Shape { // till this is Single level Inheritance
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class EquilateralTriangle extends Triangle { // this is multi level Inheritance
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class Circle extends Shape { // Hierarchical Inheritance
    public void area(int r) {
        System.out.println((3.14) * r * r);
    }
}

public class Inheritance {
    public static void main(String args[]) {
        Triangle t = new Triangle();
        t.area(10, 5);

        EquilateralTriangle et = new EquilateralTriangle();
        et.area(6, 6);

        Circle c = new Circle();
        c.area(7);

    }
}

// Some places you can see Hybrid Inheritance
// Multiple Inheritance is also there but that is not in Java that is in C++. In
// java we use Interfaces.
