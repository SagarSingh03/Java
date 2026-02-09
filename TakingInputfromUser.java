import java.util.Scanner;

public class TakingInputfromUser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // nextInt() helps us to take integer input from the user
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("sum of a and b is: " + sum);
        sc.close();
    }
}