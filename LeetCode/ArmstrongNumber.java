// ArmStrong number : we also call it narcisstic number. Some of the armstrong numbers are : 153, 370, 371. In the armstrong number we find the cube value of the single 
// number and like 1 cube then 5 cube and then 3 cube and then add all of them together you will get 153 only.  

//  (%) gives the remainder after the first divison is called modulus operator 
// (/) gives the quotient only after the first divison part in java if both are integers 
public class ArmstrongNumber {
    public static void main(String[] args) {
        int n = 153;
        int temp = n; // copying n because we will remove elements from n
        int r, sum = 0;

        while (n > 0) {
            r = n % 10; // we are taking out last digit
            n = n / 10; // then we are removing that digit
            sum = sum + r * r * r; // inside sum we are adding r cube and sum value
        }

        if (temp == sum) // comparing temp == sum value
            System.out.println("It's a Armstrong number");
        else
            System.out.println("Not an Armstrong number");

    }
}
