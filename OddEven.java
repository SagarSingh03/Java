import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) { // % this is modulus operator which gives remainder after divison
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
