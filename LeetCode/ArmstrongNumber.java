// ArmStrong number : we also call it narcisstic number. Some of the armstrong numbers are : 153, 370, 371. In the armstrong number we find the cube value of the single 
// number and like 1 cube then 5 cube and then 3 cube and then add all of them together you will get 153 only.  
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int r, sum = 0;

        while (n > 0) {
            r = n % 10;
            n = n / 10;
            sum = sum + r * r * r;
        }

        if (temp == sum) 
            System.out.println("It's a Armstrong number");
        else 
            System.out.println("Not an Armstrong number");

    }
}
