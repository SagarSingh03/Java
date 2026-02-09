// Static : means belongs to the class, not the specific object.
// Imagine a class room is there and two students are there A and B , A is writing in his copy now B copy is empty but when teacher writes in blackboard it is written for 
// everybody and if it is erased then it is erased for everyone.

class Student {
    String name;
    static String school;

    public static void changeSchool() {
        school = "newschool";
    }
}

public class StaticKeyword {
    public static void main(String args[]) {
        Student.school = "ABC";
        Student student1 = new Student();
        student1.name = "Tony";
        System.out.println(student1.school);
    }
}