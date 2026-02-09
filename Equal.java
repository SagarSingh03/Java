import java.util.Scanner;
public class Equal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b){
            System.out.println("a and b are equal number");
        }
        else if ( a > b){ // here also we could have used if but it will check the previous if again and again 
            System.out.println("a is greater than b"); // in else it will not check the previous condition
        }
        else {
            System.out.println("b is greater than a");
        }

    }
}
