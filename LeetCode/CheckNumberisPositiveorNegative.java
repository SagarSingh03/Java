import java.util.*;

public class CheckNumberisPositiveorNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 0) {
            System.out.print("It is a neutral number not positive nor negative It is a Zero");
        } else if (n < 0) {
            System.out.print("It is a negative number");
        } else {
            System.out.print("It is a positive number");
        }
    }
}
