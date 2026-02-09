// Encapsulation : means wrapping data (variables) and methods (functions) together into one unit, called a class and protecting the data from 
// outside access.
// In simple words : Hide the data and allow access only through proper methods 

class Encapsulation {
    private int marks; // marks is private here cannot be access directly

    // setMarks() and getMarks() are public -> used to access data publicly
    // method to set value
    public void setMarks(int m) {
        marks = m;
    }

    // method to get value
    public int getMarks() {
        return marks;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setMarks(85);
        System.out.println("Marks: " + obj.getMarks());
    }
}

