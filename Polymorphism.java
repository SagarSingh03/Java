// Polymorphism is made up of two words poly means many and morphism means forms many forms.
// There are two types of polymorphism one Function overloading and other is function overriding and the first type function overloading
// is compile time polymorphism and function over riding is run time polymorphism.
// here we will discuss only about compile time polymorphism run time will
// discuss in inheritance topic.

class Student {
    String name;
    int age;

    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
}

public class Polymorphism{
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Sagar Singh";
        s1.age = 24;

        s1.printInfo(s1.name, s1.age);
    }
}

