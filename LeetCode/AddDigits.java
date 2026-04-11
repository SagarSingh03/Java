// LeetCode : 258
public class AddDigits {
    public static void main(String[] args){
        int n = 38;
        System.out.println(addDigits(n));
    }

    public static int addDigits(int n){
        if (n == 0){
            return 0;
        }
        return (n % 9 == 0) ? 9 : n % 9;
    }
}
