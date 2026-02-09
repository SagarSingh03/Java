import Bank.Account; // this allows Packages.java to use the account class without import java won't know where is Account located
 
class Shape {
    public void area() {
        System.out.println("Displays area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5 * l * h);
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println(3.14 * r * r);
    }
}

public class Packages {
    public static void main(String args[]) {
        Account account1 = new Account(); // An object of Account is created
        account1.name = "customer1";  // name is public, so it can be accessed from another package
        System.out.println(account1.name);
    }
}


// by seeing code once you should know where we are using over loading and where we are using over riding 
// Packages help organize related classes, provide security, and avoid naming conflicts in large applications.