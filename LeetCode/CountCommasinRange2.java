// Leetcode Weekly contest Medium level Count commas in range 2 
public class CountCommasinRange2 {
    public static void main(String[] args) {
        long n = 1000000L;
        long commas = 0;
        long[] start = { 1000L, 1000000L, 1000000000L, 1000000000000L };
        for (int i = 0; i < start.length; i++) {
            if (n >= start[i]) {
                commas += (n - start[i] + 1);
            }
        }
        System.out.print(commas);
    }
}
