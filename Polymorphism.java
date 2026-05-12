// Polymorphism is made up of two words poly means many and morphism means forms many forms.
// Polymorphism is a feature in OOPs where one same code acts differently at different places. 
// There are two types of polymorphism : 1. Compile Time Polymorphism (Static) 2. Run time Polymorphism (Dynamic)
// 1. Compile Time polymorphism : is implemented at the compile time is known as compile time polymorphism ex: Method overloading

// Method Overloading : is a technique which allows you to have more than one function with the same function name but with different 
// functionality. method overloading can be possible on the following basis: 1. The type of parameters passed to the function 
// 2. The number of parameters passed to the function. 

// 2. Run time polymorphism : is also known as dynamic polymorphism. Function overriding is an example of run time polymorphism. Function
// overriding means when the child class contains the method which is already present in the parent class. Hence the child class over
//  rides the method of the parent class. In case of function over riding, parent and child class contains the same function with a
// different definition. The call to the function is determined at the run time is known as runtime polymorphism. 


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

