// LeetCode : Reverse String Prefix 3794 
public class ReverseStringPrefix {
    public static void main(String[] args) {
        String s = "abcdef";
        int k = 2;
        
        char[] arr = s.toCharArray();
        int left = 0,
            right = k - 1;
        
        while (left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.print(arr);
    }
}
