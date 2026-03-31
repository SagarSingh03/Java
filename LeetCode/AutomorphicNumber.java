
// An autoporphic number is a number whose square ends with the same number
import java.util.*;

public class AutomorphicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);

        if (squareStr.endsWith(numStr)) {
            System.out.print(num + " is an Automorphic number");
        } else {
            System.out.print(num + " is not an Automorphic number");
        }
    }
}
