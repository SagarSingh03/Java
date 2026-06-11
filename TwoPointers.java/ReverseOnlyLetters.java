// LeetCode : 917 
public class ReverseOnlyLetters {
    public static void main(String[] args){
        String s =  "Test1ng-Leet=code-Q!";

        char[] arr = s.toCharArray();

        int left = 0,
            right = s.length()- 1;

        while (left < right){
            if(!Character.isLetter(arr[left])){
                left++;
            } else if(!Character.isLetter(arr[right])){
                right--;
            } else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
        System.out.print(arr);

    }    
}
