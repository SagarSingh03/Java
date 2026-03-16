// Leetcode Weekly contest count commas in range 
public class CountCommasinRange {
    public static void main(String[] args) {
        int n = 1000000;
        if (n < 1000) {
            System.out.print(n);
        } else {
            System.out.print(n - 999);
        }
    }
}
