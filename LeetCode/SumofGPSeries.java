
// Formula to find GP series sum : Sn = a * (Math.pow(r, n) - 1) / (r - 1)
import java.util.*;

public class SumofGPSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int r = sc.nextInt();

        if (r == 1) {
            System.out.print(a * n);
        } else {
            double sum = a * (Math.pow(r, n) - 1) / (r - 1);
            System.out.print((int) sum);
        }
    }

}
