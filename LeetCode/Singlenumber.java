// ^ this symbol is called XOR Operator (BitWise XOR / Exclusive OR)
public class Singlenumber {
    public static void main(String[] args){
        int[] nums = {4,2,4,1,2};
        int result = 0;
        for (int num : nums){
            result ^= num;

        }
        System.out.print(result);
    }
}